package management.controllers.IOT.MQTT;

import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MqttDefaultFilePersistence;

public class MQTTController {
    private BlockingQueue<MqttMessage> messageQueue = new LinkedBlockingQueue<>();

    
    public void subscribe() {
    MqttDefaultFilePersistence persistence = new MqttDefaultFilePersistence("..\\..\\..\\temps");

    String broker = "tcp://localhost:1883";
    String clientId = MqttClient.generateClientId();
    MqttClient client = null;
    try {
        client = new MqttClient(broker, clientId, persistence);

        MyCallback myCallback = new MyCallback();
        client.setCallback(myCallback);

        client.connect(); // Connect to the broker

        client.subscribe("ESP8266_device1", 0);

        // Wait for a message to be received
        while (true) {
            MqttMessage message = myCallback.getMessage(); // Implement this method in MyCallback class to get the received message
            if (message != null) {
                System.out.println("Received message: " + new String(message.getPayload()));
                break; // Exit the loop after receiving the message
            }
            Thread.sleep(1000); // Sleep for 1 second before checking again
        }

        client.disconnect(); // Disconnect from the broker
    } catch (MqttException e) {
        e.printStackTrace(); // Handle the exception appropriately based on your application requirements
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt(); // Restore the interrupted status
    } finally {
        try {
            if (client != null && client.isConnected()) {
                client.disconnect(); // Disconnect from the broker in case of any exceptions
            }
        } catch (MqttException e) {
            e.printStackTrace(); // Handle disconnection exception
        }
    }
}

}