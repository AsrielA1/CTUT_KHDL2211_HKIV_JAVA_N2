package management.controllers.categories;

import management.models.categories.Storage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

import java.util.Vector;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import management.configs.PropertiesController;

public class StorageController {
    private final Storage storageModel = new Storage();
    
    private final HashMap<String, String> properties = PropertiesController.getProperties();
    private final String url = properties.get("url");
    private final String dbUsername = properties.get("username");
    private final String dbPassword = properties.get("password");
    
    public StorageController(){}
        
    public void showAllStorageData(JTable _tblStorage){
        DefaultTableModel dtModel = (DefaultTableModel)_tblStorage.getModel();
        dtModel.setRowCount(0);
        
        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;
        String query = null;
        
        String _storageId, _weight, _percentEmpty;
        
        try {        
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            stmt = connection.createStatement();
            query = "SELECT ma_kho, CONCAT(khoiluong_hientai, '/', suc_chua), (khoiluong_hientai/suc_chua * 100) "
                    + "FROM danhmuc_kho";
            
            rs = stmt.executeQuery(query);
            while(rs.next()){
                _storageId = rs.getString(1);
                _weight = rs.getString(2);
                _percentEmpty = String.valueOf(rs.getString(3));
                
                String[] storageData = {_storageId, _weight, _percentEmpty};
                dtModel.addRow(storageData);
            }
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.StorageController.showAllStorageData\n" + e);
        }
    }
    
    public void showSingleStorage(JTextField _tfStorageId, JTextField _tfWeightMax, JTextField _tfStorageNote){
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String query = null;
        
        String _storageId = _tfStorageId.getText();
        String _weightMax = "";
        String _storageNote = "";
        
        try {        
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "SELECT suc_chua, ghi_chu FROM danhmuc_kho WHERE ma_kho = ?;";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _storageId);
            
            rs = pstmt.executeQuery();
            while(rs.next()){
                _weightMax = String.valueOf(rs.getFloat(1));
                _storageNote = rs.getString(2);
                
                _tfWeightMax.setText(_weightMax);
                _tfStorageNote.setText(_storageNote);
            }
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.StorageController.showSingleStorage\n" + e);
        }
    }
    
    public boolean addStorage(JTextField _tfStorageId, JTextField _tfWieghtMax, JTextField _tfStorageNote){

        try {        
            String _storageId = _tfStorageId.getText();
            float _weightMax = Float.parseFloat(_tfWieghtMax.getText());
            String _storageNote = _tfStorageNote.getText();
            
            return storageModel.addStorage(_storageId, _weightMax, _storageNote);
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.StorageController.addStorage\n" + e);
        }
        
        return false;
    }
    
    public boolean delStorage(JTable _tblStorage){        
        try {        
            int row = _tblStorage.getSelectedRow();
            DefaultTableModel dtModel = (DefaultTableModel)_tblStorage.getModel();
            String _storageId = dtModel.getValueAt(row, 0).toString();
            
            return storageModel.delStorage(_storageId);            
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.StorageController.delStorage\n" + e);
        }
        
        return false;
    }
    
    public boolean updateStorage(JTextField _tfStorageId, JTextField _tfWieghtMax, JTextField _tfStorageNote){
        try {
            String _storageId = _tfStorageId.getText();
            float _weightMax = Float.parseFloat(_tfWieghtMax.getText());
            String _storageNote = _tfStorageNote.getText();
            
            return storageModel.updateStorage(_storageId, _weightMax, _storageNote);
        }
        catch (Exception e){            
            System.out.println("Error in management.controllers.categories.StorageController.updateStorage\n" + e);
        }
        
        return false;
    }
    
    public void searchStorage(JTextField _tfSearchBar, JTable _tblStorage){
        DefaultTableModel dtModel = (DefaultTableModel)_tblStorage.getModel();
        dtModel.setRowCount(0);
        
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String query = null;
        
        String _storageId = "";
        String _weight = "";
        String _emptyPercent = "";
        
        String keyword = "%" + _tfSearchBar.getText() + "%";
        
        try {                    
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "SELECT * FROM sp_TimKho(?);";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, keyword);
            
            rs = pstmt.executeQuery();
            while(rs.next()){
                _storageId = rs.getString(1);
                _weight = rs.getString(2);
                _emptyPercent = String.valueOf(rs.getFloat(3));
                
                String[] storageData = {_storageId, _weight, _emptyPercent};
                dtModel.addRow(storageData);
            }
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.StorageController.searchStorage\n" + e);
        }
    }
}
