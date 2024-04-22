package management;

import management.models.categories.Device;

import management.views.main.MainJFrame;
import management.views.main.Login;
import management.views.categories.device.tag.DeviceTagJFrame;
import management.views.categories.device.device.DeviceJFrame;
import management.views.categories.storage.StorageJFrame;
import management.views.categories.provider.ProviderJFrame;
import management.views.histories.input.InputHistoryJFrame;
import management.views.histories.output.OutputHistoryJFrame;

import org.eclipse.paho.client.mqttv3.MqttException;

public class ColdStorage {

    public static void main(String[] args) throws MqttException{
        new Login().setVisible(true);
    }
}
