package management;

import management.models.categories.*;
import management.models.histories.*;
import management.models.details.*;

import management.views.categories.employee.UpdateEmployeeJFrame;
import management.views.categories.employee.EmployeeJFrame;
import management.views.categories.provider.ProviderJFrame;
import management.views.histories.input.InputHistoryJFrame;
import management.views.histories.output.OutputHistoryJFrame;
import management.views.histories.input.details.InputDetailJFrame;
import management.views.MainJFrame;

import management.models.inspections.QualityInspection;
import management.controllers.IOT.MQTT.MQTTController;
import org.eclipse.paho.client.mqttv3.MqttException;

public class ColdStorage {

    public static void main(String[] args) throws MqttException{
        MainJFrame test = new MainJFrame();
        test.setVisible(true);
        
    }
}
