package management.controllers.IOT.MQTT;

import java.util.ArrayList;
import management.controllers.JSON.JSONController;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class MyCallback implements MqttCallback{
    private MqttMessage receivedMessage;
    
    private final JSONController jsonController = new JSONController();
    
    public static byte[] string2Byte(String str){
        return str.getBytes(StandardCharsets.UTF_8);
    }
    
    public static void toByteFile(String filename, String context){
        byte[] bytes = string2Byte(context);
        
        try (FileOutputStream fos = new FileOutputStream(filename, false)){
            fos.write(bytes);
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.IOT.MQTT.MyCallback.toByteFile\n" + e);
        }
        
    }

    public MqttMessage getMessage() {
        return receivedMessage;
    }
    
    @Override
    public void connectionLost(Throwable thrwbl) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void messageArrived(String topic, org.eclipse.paho.client.mqttv3.MqttMessage message) throws Exception {
        System.out.println(topic + ": " + message);
        
        String jsonString = message.toString();        
        String filename = "..\\..\\..\\temps\\storages.dat";
        toByteFile(filename, jsonString);
        
        receivedMessage = message;
    }
    
    @Override
    public void deliveryComplete(IMqttDeliveryToken imdt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
