package management.controllers.categories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

import java.util.Vector;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import management.configs.PropertiesController;

public class StorageController {
    private final HashMap<String, String> properties = PropertiesController.getProperties();
    private final String url = properties.get("url");
    private final String dbUsername = properties.get("username");
    private final String dbPassword = properties.get("password");
    
    public StorageController(){}
        
    public void showAllStorageData(JTable storageTable, ArrayList<ArrayList<String>> storageData){
        DefaultTableModel tModel = (DefaultTableModel)storageTable.getModel();
        tModel.setNumRows(0);
        
        String storageId, weight;
        
        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;
        String query = null;
        
        ArrayList<String> tempStorageData = new ArrayList<String>();
                
        try {
            for (ArrayList<String> storageEntry: storageData){
                tempStorageData = storageEntry;
                
                storageId = storageEntry.get(0);
                
                stmt = connection.createStatement();
                query = "SELECT STR(khoiluong_hientai + '/' + suc_chua) FROM danhmuc_kho WHERE ma_kho = '" + storageId + "';";
                rs = stmt.executeQuery(query);
                while(rs.next()){
                    weight = rs.getString(1);                    
                    tempStorageData.add(weight);                    
                }
                
                Vector<Object> rowData = new Vector<Object>(tempStorageData);
                tModel.addRow(rowData);
                
            }
        }
        catch (Exception e){
            System.out.println("management.controllers.categories.StorageController.showAllStorageData\n" + e);
        }
    }
    
    
    public DefaultTableModel getStorageTable(JTable storageTable, ArrayList<ArrayList<String>> storageData){
        DefaultTableModel tModel = (DefaultTableModel)storageTable.getModel();
        tModel.setNumRows(0);
        
        String storageId, weight;
        
        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;
        String query = null;
        
        ArrayList<String> tempStorageData = new ArrayList<String>();
                
        try {
            for (ArrayList<String> storageEntry: storageData){
                tempStorageData = storageEntry;
                
                storageId = storageEntry.get(0);
                
                stmt = connection.createStatement();
                query = "SELECT STR(khoiluong_hientai + '/' + suc_chua) FROM danhmuc_kho WHERE ma_kho = '" + storageId + "';";
                rs = stmt.executeQuery(query);
                while(rs.next()){
                    weight = rs.getString(1);                    
                    tempStorageData.add(weight);                    
                }
                
                Vector<Object> rowData = new Vector<Object>(tempStorageData);
                tModel.addRow(rowData);
                
                return tModel;
            }
        }
        catch (Exception e){
            System.out.println("management.controllers.categories.StorageController.showAllStorageData\n" + e);
        }
        
        return null;
    }
}
