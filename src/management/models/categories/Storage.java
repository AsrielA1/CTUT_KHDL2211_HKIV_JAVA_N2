package management.models.categories;

import management.database.DB;

import java.sql.DriverManager;


interface IStorage{
    boolean addStorage(String storageId, float maxWeight, String storageNote);
    boolean delStorage(String storageId);
    boolean updateStorage(String storageId, float maxWeight, String storageNote);
}

public class Storage extends DB implements IStorage{
    private String storageId;
    private float currentWeight;
    private float maxWeight;
    private String storageNote;
    
    public Storage(){}

    public Storage(String storageId, float currentWeight, float maxWeight, String storageNote) {
        this.storageId = storageId;
        this.currentWeight = currentWeight;
        this.maxWeight = maxWeight;
        this.storageNote = storageNote;
    }
    
    @Override
    public boolean addStorage(String storageId, float maxWeight, String storageNote){
    
        try {
            Class.forName("org.postgresql.Driver");
            
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            String query = "INSERT INTO danhmuc_kho VALUES (?, ?, ?, ?);";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, storageId);
            pstmt.setFloat(2, 0);
            pstmt.setFloat(3, maxWeight);
            pstmt.setString(4, storageNote);
            
            pstmt.executeUpdate();
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.models.catagories.Storage.addStorage\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean delStorage(String storageId){
  
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            String query = "UPDATE danhmuc_kho SET ghi_chu = 'Hủy' WHERE ma_kho = '" + storageId + "';";
            stmt = connection.createStatement();
            stmt.executeUpdate(query);
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.models.catagories.Storage.delStorage\n" + e);
        }
        
        return false;
    }
    
    public boolean isValid(String storageId, float maxWeight){

        float currentWeight;
  
        try {
            Class.forName("org.postgresql.Driver");            
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "SELECT khoiluong_hientai FROM danhmuc_kho WHERE ma_kho = ?;";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, storageId);
            
            rs = pstmt.executeQuery();
            while(rs.next()){
                currentWeight = rs.getFloat(1);
                
                if (currentWeight > maxWeight)
                    return false;
            }
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.models.catagories.Storage.isValid\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean updateStorage(String storageId, float maxWeight, String storageNote){

        try {
            if (!isValid(storageId, maxWeight)){
                return false;
            }
            
            Class.forName("org.postgresql.Driver");            
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "UPDATE danhmuc_kho SET suc_chua = ?, ghi_chu = ? WHERE ma_kho = ?";
            pstmt = connection.prepareStatement(query);
            pstmt.setFloat(1, maxWeight);
            pstmt.setString(2, storageNote);
            pstmt.setString(3, storageId);
            
            pstmt.executeUpdate();
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.models.catagories.Storage.updateStorage\n" + e);
        }
        
        return false;
    }
}
