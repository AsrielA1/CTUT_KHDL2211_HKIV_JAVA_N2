package management;

import management.views.main.MainJFrame;

import org.eclipse.paho.client.mqttv3.MqttException;

public class ColdStorage {

    public static void main(String[] args) throws MqttException{
        new MainJFrame().setVisible(true);
    }
}
