package management;

import management.views.main.MainJFrame;
import management.views.main.Login;
import management.views.categories.device.DeviceJFrame;
import org.eclipse.paho.client.mqttv3.MqttException;

public class ColdStorage {

    public static void main(String[] args) throws MqttException{
        new Login().setVisible(true);
    }
}
