package management.models.categories;

import management.database.DB;

import java.sql.DriverManager;


interface IDevice{
    boolean addDevice(String _deviceId, String _deviceName, String _deviceNote);
    boolean hideDevice(String _deviceId);
    boolean updateDevice(String _deviceId, String _deviceName, String _deviceNote);    
    
    boolean addIdDevice(String _deviceId, String _storageId, String _deviceNote);
    boolean hideIdDevice(String _deviceId, int _deviceNum);
    boolean updateIdDevice(String _deviceId, int _deviceNum, String _storageId, String _deviceNote);
}

public class Device extends DB implements IDevice{
    private String deviceId;
    private String deviceName;
    private String deviceType;
    private String deviceNote;
    private String deviceLocation;
    
    public Device(){}    

    @Override
    public boolean addDevice(String _deviceId, String _deviceName, String _deviceNote){
 
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
            System.out.println("Error in management.models.categories.Device.addDevice\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean hideDevice(String _deviceId){

        try {            
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "UPDATE danhmuc_thietbi SET ghi_chu = CONCAT(ghi_chu, ' Hủy') WHERE ma_thietbi = ? AND ghi_chu NOT LIKE '%Hủy%';";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _deviceId);
            
            pstmt.executeUpdate();
            
            query = "UPDATE thietbi SET ghi_chu = CONCAT(ghi_chu, ' Hủy') WHERE ma_thietbi = ? AND ghi_chu NOT LIKE '%Hủy%';";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _deviceId);
            
            pstmt.executeUpdate();
            
            return true;
        }
        catch(Exception e){
            System.out.println("Error in management.models.categories.Device.hideDevice\n" + e);        
        }
        
        return false;
    }
    
    @Override
    public boolean updateDevice(String _deviceId, String _deviceName, String _deviceNote){
 
        try {            
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = """
                    UPDATE danhmuc_thietbi
                    SET ten_thietbi = ?, ghi_chu = ?
                    WHERE ma_thietbi = ?
                    """;
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _deviceName);
            pstmt.setString(2, _deviceNote);
            pstmt.setString(3, _deviceId);
            
            pstmt.executeUpdate();
            
            return true;
        }
        catch(Exception e){
            System.out.println("Error in management.models.categories.Device.hideDevice\n" + e);        
        }
        
        return false;
    }
        
    @Override
    public boolean addIdDevice(String _deviceId, String _storageId, String _deviceNote){
   
        try {            
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "INSERT INTO thietbi(ma_thietbi, ma_kho, ghi_chu) VALUES(?, ?, ?);";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _deviceId);
            if (_storageId == null)
                pstmt.setNull(2, java.sql.Types.VARCHAR);
            else 
                pstmt.setString(2, _storageId);                
            pstmt.setString(3, _deviceNote);
            
            pstmt.executeUpdate();
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.models.categories.Device.addIdDevice\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean hideIdDevice(String _deviceId, int _deviceNum){
 
        try {            
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "UPDATE thietbi SET ghi_chu = CONCAT(ghi_chu, ' Hủy') WHERE ma_thietbi = ? AND so_thutu = ?;";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _deviceId);
            pstmt.setInt(2, _deviceNum);
            
            pstmt.executeUpdate();
            
            return true;
        }
        catch(Exception e){
            System.out.println("Error in management.models.categories.Device.hideIdDevice\n" + e);        
        }
        
        return false;
    }
    
    @Override
    public boolean updateIdDevice(String _deviceId, int _deviceNum, String _storageId, String _deviceNote){

        try {            
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = """
                    UPDATE danhmuc_thietbi
                    SET ma_kho = ?, ghi_chu = ?
                    WHERE ma_thietbi = ? AND so_thutu = ?
                    """;
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _storageId);
            pstmt.setString(2, _deviceNote);
            pstmt.setString(3, _deviceId);
            pstmt.setInt(4, _deviceNum);
            
            pstmt.executeUpdate();
            
            return true;
        }
        catch(Exception e){
            System.out.println("Error in management.models.categories.Device.hideDevice\n" + e);        
        }
        
        return false;
    }
}