package management;

import management.models.categories.Device;

import management.views.main.MainJFrame;
import management.views.categories.device.tag.DeviceTagJFrame;

import org.eclipse.paho.client.mqttv3.MqttException;

public class ColdStorage {

    public static void main(String[] args) throws MqttException{
        new DeviceTagJFrame().setVisible(true);
    }
}
