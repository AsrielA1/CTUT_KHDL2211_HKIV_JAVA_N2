package management.models.categories;

import management.database.DB;

import java.sql.DriverManager;


interface IProvider{
    boolean addProvider(String providerId, String providerName, String providerEmail, String providerNumber, String providerNote);
    boolean delProvider(String providerId);
    boolean updateProvider(String providerId, String providerName, String providerEmail, String providerNumber, String providerNote);
}

public class Provider extends DB implements IProvider{
    private String providerId;
    private String providerName;
    private String providerEmail;
    private String providerNumber;
    private String providerNote;

    public Provider(){}

    public Provider(String providerId, String providerName, String providerEmail, String providerNumber) {
        this.providerId = providerId;
        this.providerName = providerName;
        this.providerEmail = providerEmail;
        this.providerNumber = providerNumber;
    }

    @Override
    public boolean addProvider(String providerId, String providerName, String providerEmail, String providerNumber, String providerNote){

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
