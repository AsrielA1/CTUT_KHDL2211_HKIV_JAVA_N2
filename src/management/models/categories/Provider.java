package management.models.categories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import management.configs.PropertiesController;


interface IProvider{
    boolean addProvider(String providerId, String providerName, String providerEmail, String providerNumber, String providerNote);
    boolean delProvider(String providerId);
    boolean updateProvider(String providerId, String providerName, String providerEmail, String providerNumber, String providerNote);
}

public class Provider implements IProvider{
    private String providerId;
    private String providerName;
    private String providerEmail;
    private String providerNumber;
    private String providerNote;
    
    private final HashMap<String, String> properties = PropertiesController.getProperties();
    private final String url = properties.get("url");
    private final String dbUsername = properties.get("username");
    private final String dbPassword = properties.get("password");
    
    public Provider(){}

    public Provider(String providerId, String providerName, String providerEmail, String providerNumber) {
        this.providerId = providerId;
        this.providerName = providerName;
        this.providerEmail = providerEmail;
        this.providerNumber = providerNumber;
    }

    @Override
    public boolean addProvider(String providerId, String providerName, String providerEmail, String providerNumber, String providerNote){
        Connection connection = null;
        PreparedStatement pstmt = null;
        
        try {
            Class.forName("org.postgresql.Driver");            
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            String query = "INSERT INTO nha_cungcap VALUES (?, ?, ?, ?, ?);";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, providerId);
            pstmt.setString(2, providerName);
            pstmt.setString(3, providerEmail);
            pstmt.setString(4, providerNumber);
            pstmt.setString(5, providerNote);
            
            pstmt.executeUpdate();
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.models.catagories.Provider.addProvider\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean delProvider(String providerId){
        Connection connection = null;
        Statement stmt = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            String query = "UPDATE nha_cungcap SET ghi_chu = 'Ngừng hợp tác' WHERE ma_nhacungcap = '" + providerId + "';";
            stmt = connection.createStatement();
            stmt.executeUpdate(query);
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.models.catagories.Provider.delProvider\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean updateProvider(String providerId, String providerName, String providerEmail, String providerNumber, String providerNote){
        Connection connection = null;
        PreparedStatement pstmt = null;
        String query = null;

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);

            query = "UPDATE danhmuc_kho SET ten_nhacungcap = ?, diachi_email = ?, so_dienthoai = ?, ghi_chu = ? "
                    + "FROM danhmuc_kho "
                    + "WHERE ma_kho = ?;";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, providerName);
            pstmt.setString(2, providerEmail);
            pstmt.setString(3, providerNumber);
            pstmt.setString(4, providerNote);
            pstmt.setString(6, providerId);
            
            pstmt.executeUpdate();
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.models.catagories.Provider.updateProvider\n" + e);
        }
        
        return false;
    }
}
