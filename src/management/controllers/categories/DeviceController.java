package management.controllers.categories;

import management.models.categories.Device;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.util.HashMap;

import javax.swing.JTextField;
import management.configs.PropertiesController;

interface IDeviceController{
    void showAllDevice(JTable _tblDevice);
    boolean addDevice(JTextField _tfDeviceId, JTextField _tfDeviceName, JTextField _tfDeviceNote);
    boolean delDevice(JTable _tblDevice);
    boolean updateDevice(JTextField _tfDeviceId, JTextField _tfDeviceName, JTextField _tfDeviceNote);
    void showSingleDevice(JTextField _deviceId, JTextField _deviceName, JTextField _deviceNote);
    void searchDevice(JTable _tblDevice, JTextField _tfSearchBar);
    
    void showAllIdDevice(JTable _tblIdDevice, JTextField _tfDeviceId);
    boolean addIdDevice(JTextField _tfDeviceId, JTextField _tfStorageId, JTextField _tfDeviceNote);
    boolean delIdDevice(JTable _tblIdDevice, JTextField _tfDeviceId);
    boolean updateIdDevice(JTextField _tfDeviceId, JTextField _tfDeviceNum, JTextField _tfStorageId, JTextField _tfDeviceNote);
    void showSingleIDDevice(JTextField _tfDeviceId, JTextField _tfDeviceNum, JTextField _tfStorageId, JTextField _tfDeviceNote);
    void searchIDDevice(JTable _tblDevice, JTextField _tfDeviceId, JTextField _tfSearchBar);
}

public class DeviceController implements IDeviceController{
    private final Device deviceModel = new Device();
    
    private final HashMap<String, String> properties = PropertiesController.getProperties();
    private final String url = properties.get("url");
    private final String dbUsername = properties.get("username");
    private final String dbPassword = properties.get("password");
    
    public DeviceController(){}
    
    @Override
    public void showAllDevice(JTable _tblDevice){
        DefaultTableModel dtModel = (DefaultTableModel)_tblDevice.getModel();
        dtModel.setRowCount(0);
        
        Connection connection;
        PreparedStatement pstmt;
        String query;
        ResultSet rs;
        
        String _deviceId, _deviceName;
        
        try {            
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "SELECT ma_thietbi, ten_thietbi FROM danhmuc_thietbi WHERE ghi_chu NOT LIKE '%Hủy%' ORDER BY ma_thietbi;";
            pstmt = connection.prepareStatement(query);
            
            rs = pstmt.executeQuery();
            while(rs.next()){
                _deviceId = rs.getString(1);
                _deviceName = rs.getString(2);
                
                Object[] _deviceData = {_deviceId, _deviceName};
                dtModel.addRow(_deviceData);
            }
        }
        catch (Exception e){
            System.out.println("management.controllers.categories.DeviceController.showAllDevice\n" + e);
        }
    }
    
    @Override
    public boolean addDevice(JTextField _tfDeviceId, JTextField _tfDeviceName, JTextField _tfDeviceNote){
        try {
            String _deviceId = _tfDeviceId.getText();
            String _deviceName = _tfDeviceName.getText();
            String _deviceNote = _tfDeviceNote.getText();
            
            return deviceModel.addDevice(_deviceId, _deviceName, _deviceNote);
        }
        catch (Exception e){
            System.out.println("management.controllers.categories.DeviceController.addDevice\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean delDevice(JTable _tblDevice){
        int rows[] = _tblDevice.getSelectedRows();
        DefaultTableModel dtModel = (DefaultTableModel)_tblDevice.getModel();
        
        String _deviceId;
        
        try {
            for (int i = 0; i < rows.length; i++){
                _deviceId = dtModel.getValueAt(rows[i], 0).toString();
                deviceModel.hideDevice(_deviceId);
            }
            
            return true;
        } 
        catch (Exception e){            
            System.out.println("management.controllers.categories.DeviceController.delDevice\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean updateDevice(JTextField _tfDeviceId, JTextField _tfDeviceName, JTextField _tfDeviceNote){
        String _deviceId, _deviceName, _deviceNote;
        
        try {
            _deviceId = _tfDeviceId.getText();
            _deviceName = _tfDeviceName.getText();
            _deviceNote = _tfDeviceNote.getText();
            
            return deviceModel.updateDevice(_deviceId, _deviceName, _deviceNote);
        }
        catch (Exception e){
            System.out.println("management.controllers.categories.DeviceController.updateDevice\n" + e);
        }
        
        return false;
    }
    
    @Override
    public void showSingleDevice(JTextField _tfDeviceId, JTextField _tfDeviceName, JTextField _tfDeviceNote){
        Connection connection;
        PreparedStatement pstmt;
        String query;
        ResultSet rs;
        
        String _deviceId = _tfDeviceId.getText();
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "SELECT ten_thietbi, ghi_chu FROM danhmuc_thietbi WHERE ma_thietbi = ?;";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _deviceId);
            
            rs = pstmt.executeQuery();
            while(rs.next()){
                _tfDeviceName.setText(rs.getString(1));
                _tfDeviceNote.setText(rs.getString(2));
            }
        }
        catch(Exception e){
            System.out.println("management.controllers.categories.DeviceController.showSingleDevice\n" + e);            
        }
    }
    
    @Override
    public void searchDevice(JTable _tblDevice, JTextField _tfSearchBar){
        DefaultTableModel dtModel = (DefaultTableModel)_tblDevice.getModel();
        dtModel.setRowCount(0);
        
        Connection connection;
        PreparedStatement pstmt;
        String query;
        ResultSet rs;
        
        String _keyword = "%" + _tfSearchBar.getText() + "%";
        
        String _deviceId, _deviceName;
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "SELECT * FROM sp_TimDMThietbi(?);";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _keyword);
            
            rs = pstmt.executeQuery();
            while(rs.next()){
                _deviceId = rs.getString(1);
                _deviceName = rs.getString(2);
                
                dtModel.addRow(new Object[]{_deviceId, _deviceName});
            }
            
        }
        catch(Exception e){
            System.out.println("management.controllers.categories.DeviceController.searchDevice\n" + e);            
        }
    }
    
    @Override
    public void showAllIdDevice(JTable _tblIdDevice, JTextField _tfDeviceId){
        DefaultTableModel dtModel = (DefaultTableModel)_tblIdDevice.getModel();
        dtModel.setRowCount(0);
        
        String _deviceId = _tfDeviceId.getText();
        
        Connection connection;
        PreparedStatement pstmt;
        String query;
        ResultSet rs;
        
        int _deviceNum;
        String _storageId;
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "SELECT so_thutu, ma_kho FROM thietbi WHERE ma_thietbi = ? AND ghi_chu NOT LIKE '%Hủy%' ORDER BY so_thutu;";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _deviceId);
            
            rs = pstmt.executeQuery();
            while(rs.next()){
                _deviceNum = rs.getInt(1);
                _storageId = rs.getString(2);
                
                dtModel.addRow(new Object[]{_deviceNum, _storageId});
            }
        }
        catch (Exception e){
            System.out.println("management.controllers.categories.DeviceController.showAllIdDevice\n" + e);            
        }
    }
    
    @Override
    public boolean addIdDevice(JTextField _tfDeviceId, JTextField _tfStorageId, JTextField _tfDeviceNote){
        try {
            String _deviceId = _tfDeviceId.getText();
            String _storageId = _tfStorageId.getText();
            _storageId = _storageId.isEmpty() ? null : _storageId;
            String _deviceNote = _tfDeviceNote.getText();
            
            return deviceModel.addIdDevice(_deviceId, _storageId, _deviceNote);
        }
        catch (Exception e){
            System.out.println("management.controllers.categories.DeviceController.showAllIdDevice\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean delIdDevice(JTable _tblIdDevice, JTextField _tfDeviceId){
        int _deviceNum;
        String _deviceId = _tfDeviceId.getText();
        
        try {
            int[] rows = _tblIdDevice.getSelectedRows();
            DefaultTableModel dtModel = (DefaultTableModel)_tblIdDevice.getModel();
            
            for (int row: rows){
                _deviceNum = Integer.parseInt(dtModel.getValueAt(row, 0).toString());
                
                deviceModel.hideIdDevice(_deviceId, _deviceNum);
            }
            
            return true;
        }
        catch (Exception e){
            System.out.println("management.controllers.categories.DeviceController.delIdDevice\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean updateIdDevice(JTextField _tfDeviceId, JTextField _tfDeviceNum, JTextField _tfStorageId, JTextField _tfDeviceNote){
        try{
            String _deviceId = _tfDeviceId.getText();
            int _deviceNum = Integer.parseInt(_tfDeviceNum.getText());
            String _storageId = _tfStorageId.getText();
            String _deviceNote = _tfDeviceNote.getText();
            
            deviceModel.updateIdDevice(_deviceId, _deviceNum, _storageId, _deviceNote);
            
            return true;
        }
        catch (Exception e){            
            System.out.println("management.controllers.categories.DeviceController.updateIdDevice\n" + e);
        }
        
        return false;
    }
    
    @Override
    public void showSingleIDDevice(JTextField _tfDeviceId, JTextField _tfDeviceNum, JTextField _tfStorageId, JTextField _tfDeviceNote){
        Connection connection;
        PreparedStatement pstmt;
        String query;
        ResultSet rs;
        
        String _deviceId = _tfDeviceId.getText();
        int _deviceNum = Integer.parseInt(_tfDeviceNum.getText());
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "SELECT ma_kho, ghi_chu FROM thietbi WHERE ma_thietbi = ? AND so_thutu = ?;";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _deviceId);
            pstmt.setInt(2, _deviceNum);
            
            rs = pstmt.executeQuery();
            while(rs.next()){
                _tfStorageId.setText(rs.getString(1));
                _tfDeviceNote.setText(rs.getString(2));
            }
        }
        catch(Exception e){
            System.out.println("management.controllers.categories.DeviceController.showSingleIDDevice\n" + e);
        }
    }
    
    @Override
    public void searchIDDevice(JTable _tblDevice, JTextField _tfDeviceId, JTextField _tfSearchBar){
        DefaultTableModel dtModel = (DefaultTableModel)_tblDevice.getModel();
        dtModel.setRowCount(0);
        
        Connection connection;
        PreparedStatement pstmt;
        String query;
        ResultSet rs;
        
        String _keyword = "%" + _tfSearchBar.getText() + "%";
        
        int _deviceNum;
        String _storageId;
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "SELECT * FROM sp_TimThietbi(?);";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _keyword);
            
            rs = pstmt.executeQuery();
            while(rs.next()){
                _deviceNum = rs.getInt(1);
                _storageId = rs.getString(2);
                
                dtModel.addRow(new Object[]{_deviceNum, _storageId});
            }
            
        }
        catch(Exception e){
            System.out.println("management.controllers.categories.DeviceController.searchDevice\n" + e);            
        }
    }
}