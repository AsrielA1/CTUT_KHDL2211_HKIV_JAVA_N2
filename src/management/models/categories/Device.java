package management.models.categories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.HashMap;
import management.configs.PropertiesController;

interface IDevice{
    boolean addTag(String _tagId, String _tagName, String _tagNote);
    boolean delTag(String _tagId);
    boolean updateTag(String _tagId, String _tagName, String _tagNote);
    
    boolean addDevice(String _deviceId, String _deviceName, String _deviceNote);
    boolean delDevice(String _deviceId);
    boolean updateDevice(String _deviceId, String _deviceName, String _deviceNote);
    
    boolean addDeviceTag(String _deviceId, String _deviceTag);
    boolean delDeviceTag(String _deviceId, String _tagId);
    
    boolean addUniqueDevice(String _deviceId, String _storageId, String _uniqueNote);
    boolean delUniqueDevice(String _deviceId, int _deviceNum);
    boolean updateUniqueDevice(String _deviceId, int _deviceNum, String _storageId, String _uniqueNote);
    boolean updateUniqueDevice(String _deviceId, int _deviceNum, String _uniqueNote);
}

public class Device implements IDevice{
    private String deviceId;
    private String deviceName;
    private String deviceType;
    private String deviceNote;
    private String deviceLocation;
    
    private final HashMap<String, String> properties = PropertiesController.getProperties();
    private final String url = properties.get("url");
    private final String dbUsername = properties.get("username");
    private final String dbPassword = properties.get("password");
    
    public Device(){}
    
    @Override 
    public boolean addTag(String _tagId, String _tagName, String _tagNote){        
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String query = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "INSERT INTO danhmuc_loaithietbi VALUES(?, ?, ?)";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _tagId);
            pstmt.setString(2, _tagName);
            pstmt.setString(3, _tagNote);
            
            pstmt.executeUpdate();
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.models.categories.DeviceController.addTag\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean delTag(String _tagId){
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String query = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "DELETE FROM danhmuc_loaithietbi WHERE ma_loaithietbi = ?";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _tagId);            
            
            pstmt.executeUpdate();
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.models.categories.DeviceController.delTag\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean updateTag(String _tagId, String _tagName, String _tagNote){
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String query = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "UPDATE danhmuc_loaithietbi SET ten_loaithietbi = ?, ghi_chu = ? WHERE ma_loaithietbi = ?;";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _tagName);
            pstmt.setString(2, _tagNote);
            pstmt.setString(3, _tagId);
            
            pstmt.executeUpdate();
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.models.categories.DeviceController.updateTag\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean addDevice(String _deviceId, String _deviceName, String _deviceNote){
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String query = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "INSERT INTO danhmuc_thietbi VALUES(?, ?, ?)";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _deviceId);
            pstmt.setString(2, _deviceName);
            pstmt.setString(3, _deviceNote);
            
            pstmt.executeUpdate();
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.models.categories.DeviceController.addDevice\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean delDevice(String _deviceId){
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String query = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "DELETE FROM danhmuc_thietbi WHERE ma_thietbi = ?";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _deviceId);            
            
            pstmt.executeUpdate();
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.models.categories.DeviceController.delDevice\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean updateDevice(String _deviceId, String _deviceName, String _deviceNote){
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String query = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "UPDATE danhmuc_thietbi SET ten_thietbi = ?, ghi_chu = ? WHERE ma_loaithietbi = ?;";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _deviceName);
            pstmt.setString(2, _deviceNote);
            pstmt.setString(3, _deviceId);
            
            pstmt.executeUpdate();
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.models.categories.DeviceController.updateDevice\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean addDeviceTag(String _deviceId, String _deviceTag){
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String query = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "INSERT INTO chitiet_thietbi VALUES(?, ?)";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _deviceId);
            pstmt.setString(2, _deviceTag);
            
            pstmt.executeUpdate();
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.models.categories.DeviceController.addDeviceTag\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean delDeviceTag(String _deviceId, String _tagId){
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String query = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "DELETE FROM chitiet_thietbi WHERE ma_thietbi = ? AND ma_loaithietbi = ?;";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _deviceId);
            pstmt.setString(2, _tagId);
            
            pstmt.executeUpdate();
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.models.categories.DeviceController.delDevice\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean addUniqueDevice(String _deviceId, String _storageId, String _uniqueNote){
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String query = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "INSERT INTO thietbi(ma_thietbi, ma_kho, ghi_chu) VALUES(?, ?, ?)";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _deviceId);
            pstmt.setString(2, _storageId);
            pstmt.setString(3, _uniqueNote);
            
            pstmt.executeUpdate();
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.models.categories.DeviceController.addDeviceTag\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean delUniqueDevice(String _deviceId, int _deviceNum){
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String query = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "UPDATE thietbi SET ghi_chu = ? WHERE ma_thietbi = ? AND so_thutu = ?";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, "Hỏng");
            pstmt.setString(2, _deviceId);
            pstmt.setInt(3, _deviceNum);
            
            pstmt.executeUpdate();
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.models.categories.DeviceController.delUniqueDevice\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean updateUniqueDevice(String _deviceId, int _deviceNum, String _storageId, String _uniqueNote){
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String query = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "UPDATE thietbi SET ma_kho = ?, ghi_chu = ? WHERE ma_thietbi = ? AND so_thutu = ?;";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _storageId);
            pstmt.setString(2, _uniqueNote);
            pstmt.setString(3, _deviceId);
            pstmt.setInt(4, _deviceNum);
            
            pstmt.executeUpdate();
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.models.categories.DeviceController.updateUniqueDevice\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean updateUniqueDevice(String _deviceId, int _deviceNum, String _uniqueNote){
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String query = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "UPDATE thietbi SET ghi_chu = ? WHERE ma_thietbi = ? AND so_thutu = ?";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _uniqueNote);
            pstmt.setString(2, _deviceId);
            pstmt.setInt(3, _deviceNum);
            
            pstmt.executeUpdate();
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.models.categories.DeviceController.updateUniqueDevice\n" + e);
        }
        
        return false;
    }
}
