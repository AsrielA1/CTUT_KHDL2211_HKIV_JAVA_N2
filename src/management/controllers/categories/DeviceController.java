package management.controllers.categories;

import management.models.categories.Device;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import management.configs.PropertiesController;

interface IDeviceController{
    void showAllTags(JTable _tblTagTable);
    void showSingleTag(JTextField _tfTagId, JTextField _tfTagName, JTextField _tfTagNote);
    void addTagsToComboBox(JComboBox _cbTagId);
    boolean addTag(JTextField _tfTagId, JTextField _tfTagName, JTextField _tfTagNote);
    boolean delTag(JTable _tblTagTable);
    boolean updateTag(JTextField _tfTagId, JTextField _tfTagName, JTextField _tfTagNote);
    
    void showAllDevices(JTable _tblDeviceTable);
    void showSingleDevice(JTextField _tfDeviceId, JTextField _tfDeviceName, JTextField _tfDeviceNote);
    boolean addDevice(JTextField _tfDeviceId, JTextField _tfDeviceName, JTextField _tfDeviceNote);
    boolean delDevice(JTable _tblDeviceTable);
    boolean updateDevice(JTextField _tfDeviceId, JTextField _tfDeviceName, JTextField _tfDeviceNote);
    void searchDevice(JTextField _tfSearchBar, JTable _tblDevice);
    
    void showUntagTags(JTextField _tfDeviceId, JTable _tblTag);
    void showDeviceTags(JTextField _tfDeviceId, JTable _tblTag);
    boolean addTagsForDevice(JTextField _tfDeviceId, JTable _tblTag);
    boolean delTagsForDevice(JTextField _tfDeviceId, JTable _tblTag);
    
    void showAllUniqueDevices(JTable _tblUniqueTableDevice);
    void showSingleUniqueDevice(JTextField _tfUniqueId, JTextField _storageId, JTextField _uniqueNote);
    boolean addUniqueDevice(JTextField _cbDeviceId, JTextField _cbStorageId, JTextField _tfUniqueNote);
    boolean delUniqueDevice(JTable _tblUniqueTableDevice);
    boolean updateUniqueDevice(JTextField _tfDeviceId, JTextField _tfStorageId, JTextField _tfUniqueNote);
    void searchUniqueDevice(JTable _tblUniqueTableDevice, JTextField _tfSearchBar);
}

public class DeviceController implements IDeviceController{
    private final Device deviceModel = new Device();
    
    private final HashMap<String, String> properties = PropertiesController.getProperties();
    private final String url = properties.get("url");
    private final String dbUsername = properties.get("username");
    private final String dbPassword = properties.get("password");
    
    public DeviceController(){}
    
    @Override
    public void showAllTags(JTable _tblTagTable){
        DefaultTableModel dtModel = (DefaultTableModel)_tblTagTable.getModel();
        dtModel.setRowCount(0);
        
        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;
        String query = null;
        
        String _tagId = "";
        String _tagName = "";
        
        try {            
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            stmt = connection.createStatement();
            query = "SELECT ma_loaithietbi, ten_loaithietbi FROM danhmuc_loaithietbi";
            rs = stmt.executeQuery(query);
            
            while(rs.next()){
                _tagId = rs.getString(1);
                _tagName = rs.getString(2);
                
                String[] tagData = {_tagId, _tagName};
                dtModel.addRow(tagData);
            }
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.DeviceController.showAllTags\n" + e);
        }
    }
    
    @Override
    public void showSingleTag(JTextField _tfTagId, JTextField _tfTagName, JTextField _tfTagNote){
        String _tagId = _tfTagId.getText();
        System.out.println(_tagId);

        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String query = null;
        
        String _tagName = "";
        String _tagNote = "";
        
        try {            
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "SELECT ten_loaithietbi, ghi_chu "
                    + "FROM danhmuc_loaithietbi "
                    + "WHERE ma_loaithietbi = ?;";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _tagId);
            
            rs = pstmt.executeQuery();
            while(rs.next()){
                _tagName = rs.getString(1);
                _tagNote = rs.getString(2);
                
                _tfTagName.setText(_tagName);
                _tfTagNote.setText(_tagNote);
            }

        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.DeviceController.showSingleUniqueDevice\n" + e);
        }
    }
    
    @Override
    public void addTagsToComboBox(JComboBox _cbTagId){
        _cbTagId.removeAllItems();
        
        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;
        String query = null;
        
        String _tagId = "";
        
        try {            
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            stmt = connection.createStatement();
            query = "SELECT ma_loaithietbi FROM danhmuc_loaithietbi";
            rs = stmt.executeQuery(query);
            
            while (rs.next()){
                _tagId = rs.getString(1);
                _cbTagId.addItem(_tagId);
            }
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.DeviceController.addTagsToComboBox\n" + e);
        }
    }
    
    @Override
    public boolean addTag(JTextField _tfTagId, JTextField _tfTagName, JTextField _tfTagNote){
        String _tagId = _tfTagId.getText();
        String _tagName = _tfTagName.getText();
        String _tagNote = _tfTagNote.getText();
        
        try {
            return deviceModel.addTag(_tagId, _tagName, _tagNote);
        }
        
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.DeviceController.addTag\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean delTag(JTable _tblTagTable){
        try {
            int row = _tblTagTable.getSelectedRow();
            DefaultTableModel dtModel = (DefaultTableModel)_tblTagTable.getModel();
            String _tagId = dtModel.getValueAt(row, 0).toString();
            
            return deviceModel.delTag(_tagId);
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.DeviceController.delTag\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean updateTag(JTextField _tfTagId, JTextField _tfTagName, JTextField _tfTagNote){

        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String query = null;
        
        String _tagId = _tfTagId.getText();
        String _tagName = _tfTagName.getText();
        String _tagNote = _tfTagNote.getText();
        
        try {            
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "UPDATE danhmuc_loaithietbi "
                    + "SET ten_loaithietbi = ?, ghi_chu = ? "
                    + "WHERE ma_loaithietbi = ?";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _tagName);
            pstmt.setString(2, _tagNote);
            pstmt.setString(3, _tagId);
            
            pstmt.executeUpdate();
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.DeviceController.addTagsToComboBox\n" + e);
        }
        
        return false;
    }
    
    @Override
    public void showAllDevices(JTable _tblDeviceTable){
        DefaultTableModel dtModel = (DefaultTableModel)_tblDeviceTable.getModel();
        dtModel.setRowCount(0);
        
        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;
        String query = null;
        
        String _deviceId = "";
        String _deviceName = "";
        
        try {            
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            stmt = connection.createStatement();
            query = "SELECT ma_thietbi, ten_thietbi FROM danhmuc_thietbi";
            rs = stmt.executeQuery(query);
            
            while(rs.next()){
                _deviceId = rs.getString(1);
                _deviceName = rs.getString(2);
                
                String[] tagData = {_deviceId, _deviceName};
                dtModel.addRow(tagData);
            }
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.DeviceController.showAllDevices\n" + e);
        }
    }
    
    @Override
    public void showSingleDevice(JTextField _tfDeviceId, JTextField _tfDeviceName, JTextField _tfDeviceNote){        
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String query = null;
        
        String _deviceId = _tfDeviceId.getText();
        String _deviceName, _deviceNote;
        
        try {            
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "SELECT ten_thietbi, ghi_chu FROM danhmuc_thietbi WHERE ma_thietbi = ?;";
            System.out.println(_deviceId);
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _deviceId);
            
            rs = pstmt.executeQuery();
            while(rs.next()){
                _deviceName = rs.getString(1);
                _deviceNote = rs.getString(2);
                
                _tfDeviceName.setText(_deviceName);
                _tfDeviceNote.setText(_deviceNote);
            }
            
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.DeviceController.showSingleDevice\n" + e);
        }
    }
    
    @Override
    public boolean addDevice(JTextField _tfDeviceId, JTextField _tfDeviceName, JTextField _tfDeviceNote){
        String _deviceId = _tfDeviceId.getText();
        String _deviceName = _tfDeviceName.getText();
        String _deviceNote = _tfDeviceNote.getText();
        
        try {
            return deviceModel.addDevice(_deviceId, _deviceName, _deviceNote);
        }
        
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.DeviceController.addDevice\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean delDevice(JTable _tblDeviceTable){
        try {
            int row = _tblDeviceTable.getSelectedRow();
            DefaultTableModel dtModel = (DefaultTableModel)_tblDeviceTable.getModel();
            String _deviceId = dtModel.getValueAt(row, 0).toString();
            
            return deviceModel.delDevice(_deviceId);
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.DeviceController.delDevice\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean updateDevice(JTextField _tfDeviceId, JTextField _tfDeviceName, JTextField _tfDeviceNote){
        try {
            String _deviceId = _tfDeviceId.getText();
            String _deviceName = _tfDeviceName.getText();
            String _deviceNote = _tfDeviceNote.getText();
            
            return deviceModel.updateDevice(_deviceId, _deviceName, _deviceNote);
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.DeviceController.updateUniqueDevice\n" + e);
            
        }
        
        return false;
    }
    
    @Override
    public void searchDevice(JTextField _tfSearchBar, JTable _tblDevice){
        DefaultTableModel dtModel = (DefaultTableModel)_tblDevice.getModel();
        dtModel.setRowCount(0);
        
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String query = null;
        
        String _deviceId = "";
        String _deviceName = "";
        
        String _keyword = "%" + _tfSearchBar.getText() + "%";
        
        try {            
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "SELECT * FROM sp_TimDM_thietbi(?)";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _keyword);
            
            rs = pstmt.executeQuery();            
            while(rs.next()){
                _deviceId = rs.getString(1);
                _deviceName = rs.getString(2);
                
                String[] deviceData = {_deviceId, _deviceName};
                dtModel.addRow(deviceData);
            }
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.DeviceController.searchDevice\n" + e);
        }
    }
    
    @Override
    public void showSingleUniqueDevice(JTextField _tfUniqueId, JTextField _tfStorageId, JTextField _tfUniqueNote){
        String _uniqueId = _tfUniqueId.getText();
        String[] list = _uniqueId.split("_");
        
        String _deviceId = list[0];
        int _deviceNum = Integer.parseInt(list[1]);
        
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String query = null;
        
        String _storageId = "";
        String _uniqueNote = "";
        
        try {            
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "SELECT ma_kho, ghi_chu FROM thietbi WHERE ma_thietbi = ? AND so_thutu = ?;";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _deviceId);
            pstmt.setInt(2, _deviceNum);
            
            rs = pstmt.executeQuery();            
            while(rs.next()){
                _storageId = rs.getString(1);
                _uniqueNote = rs.getString(2);
            }
            
            _tfStorageId.setText(_storageId);
            _tfUniqueNote.setText(_uniqueNote);
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.DeviceController.showSingleUniqueDevice\n" + e);
        }
    }
    
    @Override 
    public void showUntagTags(JTextField _tfDeviceId, JTable _tblTag){
        DefaultTableModel dtModel = (DefaultTableModel)_tblTag.getModel();
        dtModel.setRowCount(0);
        
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String query = null;
        
        String _deviceId = _tfDeviceId.getText();
        String _tagId = "";
        
        try {            
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = """
                        SELECT ma_loaithietbi
                        FROM danhmuc_loaithietbi
                        WHERE ma_loaithietbi NOT IN (
                            SELECT ma_loaithietbi
                            FROM chitiet_thietbi
                            WHERE ma_thietbi = ?
                        );
                    """;
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _deviceId);
            
            rs = pstmt.executeQuery();
            while(rs.next()){
                _tagId = rs.getString(1);
                
                String[] _tagData = {_tagId};
                dtModel.addRow(_tagData);
            }
            
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.DeviceController.showUntags\n" + e);
        }
    }
    
    @Override
    public void showDeviceTags(JTextField _tfDeviceId, JTable _tblTag){
        DefaultTableModel dtModel = (DefaultTableModel)_tblTag.getModel();
        dtModel.setRowCount(0);
        
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String query = null;
        
        String _deviceId = _tfDeviceId.getText();
        String _tagId = "";
        
        try {            
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = """
                    SELECT ma_loaithietbi
                    FROM chitiet_thietbi
                    WHERE ma_thietbi = ?;
                    """;
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _deviceId);
            
            rs = pstmt.executeQuery();
            while(rs.next()){
                _tagId = rs.getString(1);
                
                String[] _tagData = {_tagId};
                dtModel.addRow(_tagData);
            }
            
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.DeviceController.showDeviceTags\n" + e);
        }
    }
    
    @Override
    public boolean addTagsForDevice(JTextField _tfDeviceId, JTable _tblTag){
        int[] rows = _tblTag.getSelectedRows();
        DefaultTableModel dtModel = (DefaultTableModel)_tblTag.getModel();
                
        String _deviceId = _tfDeviceId.getText();
        String _tagId = "";
        
        try {
           for (int i = 0; i < rows.length; i ++){
               _tagId = dtModel.getValueAt(rows[i], 0).toString();
               
               deviceModel.addDeviceTag(_deviceId, _tagId);
           }
           
           return true;
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.DeviceController.addTagsForDevice\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean delTagsForDevice(JTextField _tfDeviceId, JTable _tblTag){
        int[] rows = _tblTag.getSelectedRows();
        DefaultTableModel dtModel = (DefaultTableModel)_tblTag.getModel();
        
        String _deviceId = _tfDeviceId.getText();
        String _tagId = "";
        
        try {
           for (int i = 0; i < rows.length; i ++){
               _tagId = dtModel.getValueAt(rows[i], 0).toString();
               
               deviceModel.delDeviceTag(_deviceId, _tagId);
           }
           
           return true;
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.DeviceController.delTagsForDevice\n" + e);
        }
        
        return false;
    }
    
    @Override
    public void showAllUniqueDevices(JTable _tblUniqueTableDevice){        
        DefaultTableModel dtModel = (DefaultTableModel)_tblUniqueTableDevice.getModel();
        dtModel.setRowCount(0);
        
        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;
        String query = null;
        
        String _deviceId = "";
        String _deviceNum = "";
        String _storageId = "";
        
        try {            
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            stmt = connection.createStatement();
            query = "SELECT ma_thietbi, so_thutu, ma_kho "
                    + "FROM thietbi "
                    + "WHERE ghi_chu NOT LIKE '%Hỏng%' "
                    + "ORDER BY ma_thietbi, so_thutu;";
            rs = stmt.executeQuery(query);
            
            while(rs.next()){
                _deviceId = rs.getString(1);
                _deviceNum = rs.getString(2);
                _storageId = rs.getString(3);
                
                String[] tagData = {_deviceId, _deviceNum, _storageId};
                dtModel.addRow(tagData);
            }
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.DeviceController.showAllUniqueDevices\n" + e);
        }
    }
    
    @Override
    public boolean addUniqueDevice(JTextField _cbDeviceId, JTextField _cbStorageId, JTextField _tfUniqueNote){
        try {
            String _deviceId = _cbDeviceId.getText();
            String _uniqueNote = _tfUniqueNote.getText();
            String _storageId = _cbStorageId.getText();            
            
            return deviceModel.addUniqueDevice(_deviceId, _storageId, _uniqueNote);
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.DeviceController.addUniqueDevice\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean delUniqueDevice(JTable _tblUniqueTableDevice){
        try{
            int row = _tblUniqueTableDevice.getSelectedRow();
            DefaultTableModel dtModel = (DefaultTableModel)_tblUniqueTableDevice.getModel();
            
            String _deviceId = dtModel.getValueAt(row, 0).toString();
            int _deviceNum = Integer.parseInt(dtModel.getValueAt(row, 1).toString());
            
            return deviceModel.delUniqueDevice(_deviceId, _deviceNum);
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.DeviceController.delUniqueDevice\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean updateUniqueDevice(JTextField _tfDeviceId, JTextField _tfStorageId, JTextField _tfUniqueNote){
        try {
            String _uniqueId = _tfDeviceId.getText();
            String[] list = _uniqueId.split("_");
            
            String _deviceId = list[0];
            int _deviceNum = Integer.parseInt(list[1]);
            String _storageId = _tfStorageId.getText();
            String _uniqueNote = _tfUniqueNote.getText();
            
            return deviceModel.updateUniqueDevice(_deviceId, _deviceNum, _storageId, _uniqueNote);
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.DeviceController.updateUniqueDevice\n" + e);
            
        }
        
        return false;
    }

    @Override
    public void searchUniqueDevice(JTable _tblUniqueTableDevice, JTextField _tfSearchBar){
        DefaultTableModel dtModel = (DefaultTableModel)_tblUniqueTableDevice.getModel();
        dtModel.setRowCount(0);
        
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String query = null;
        
        String _deviceId = "";
        String _deviceNum = "";
        String _storageId = "";
        
        String _keyword = "%" + _tfSearchBar.getText() + "%";
        
        try {            
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "SELECT * FROM sp_TimThietbi(?)";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _keyword);
            
            rs = pstmt.executeQuery();            
            while(rs.next()){
                _deviceId = rs.getString(1);
                _deviceNum = String.valueOf(rs.getInt(2));
                _storageId = rs.getString(3);
                
                String[] tagData = {_deviceId, _deviceNum, _storageId};
                dtModel.addRow(tagData);
            }
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.DeviceController.showAllUniqueDevices\n" + e);
        }
    }
}
