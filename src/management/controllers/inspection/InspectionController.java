package management.controllers.inspection;

import management.models.inspections.QualityInspection;

import java.util.HashMap;
import java.util.ArrayList;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;

import management.configs.PropertiesController;

interface IInspectionController{
    void addStorageIdChooser(JComboBox storageIdChooser);
    void addInspection(JTextField inspectionIdTF, JComboBox storageIdChooser, JDateChooser dateChooser, JTextField lossWeightTF, String reasonTF);
}

public class InspectionController {
    private final QualityInspection qualiryInspection = new QualityInspection();
    
    private final HashMap<String, String> properties = PropertiesController.getProperties();
    private final String url = properties.get("url");
    private final String dbUsername = properties.get("username");
    private final String dbPassword = properties.get("password");
    
    public InspectionController(){}
    
    public void addStorageIdChooser(JComboBox storageIdChooser){
        ArrayList<String> storageIdList = new ArrayList<String>();
        
        Connection connection = null;
        ResultSet rs = null;
        Statement stmt = null;
        String query = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "SELECT ma_kho FROM danhmuc_kho WHERE ghi_chu NOT LIKE '%Hủy%'";
            rs = stmt.executeQuery(query);
            
            while(rs.next()){
                storageIdList.add(rs.getString(1));
            }
            
            storageIdChooser.removeAllItems();
            storageIdChooser.addItem(storageIdList);
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.inspection.InspectionController.addStorageIdChooser\n" + e);
        }
    }
    
    public void addInspection(JTextField inspectionIdTF, JComboBox storageIdChooser, JDateChooser dateChooser, JTextField lossWeightTF, JTextField reasonTF){
        try {
            SimpleDateFormat desiredFormat = new SimpleDateFormat("dd/MM/yyyy");
            
            String inspectionId, storageId, date, reason;
            float lossWeight;
            
            inspectionId = inspectionIdTF.getText();
            storageId = storageIdChooser.getSelectedItem().toString();
            date = desiredFormat.format(dateChooser.getDate());
            lossWeight = Float.parseFloat(lossWeightTF.getText());
            reason = reasonTF.getText();
            
            qualiryInspection.addQualityInspection(inspectionId, storageId, date, lossWeight, reason);            
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.inspection.InspectionController.addInspection\n" + e);
        }
    }
    
    public void hideInspection(JTextField inspectionIdTF){
        try {
            String inspectionId = inspectionIdTF.getText();
            
            qualiryInspection.delQualityInspection(inspectionId);
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.inspection.InspectionController.hideInspection\n" + e);
        }
    }
    
    
}
