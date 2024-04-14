package management.controllers.main;

import java.util.ArrayList;

import management.controllers.IOT.MQTT.MQTTController;
import management.controllers.JSON.JSONController;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.eclipse.paho.client.mqttv3.MqttException;

public class MainController {
    private final MQTTController mqttController = new MQTTController();
    private final JSONController jsonController = new JSONController();
    
    public MainController(){}
    
    public void showAllInfo(JTable storageInfo) throws MqttException{
        try{
            DefaultTableModel tModel = (DefaultTableModel)storageInfo.getModel();
            tModel.setRowCount(0);

            while (true){
                mqttController.subscribe();
                String[] storageInfoList = jsonController.getStorage();
                tModel.addRow(storageInfoList);
            }
        }
        catch (MqttException mqttException) {            
            System.out.println("Error in management.controllers.main.MainController.showAllInfo\n" + mqttException);
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.main.MainController.showAllInfo\n" + e);
        }
    }
    
    
}
