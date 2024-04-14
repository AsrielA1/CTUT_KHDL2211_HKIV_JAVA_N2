package management.models.histories;

import management.configs.PropertiesController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Date;
import java.sql.Time;

import java.text.SimpleDateFormat;  
import java.util.HashMap;


interface IInputHistory{
    void addInputHistory(String supplyId, String inputDate, String inputTime, String providerId, String inputNote);
    void delInputHistory(String supplyId);
    
}

public class InputHistory implements IInputHistory{
    private String supplyId;
    private String inputDate;
    private String inputTime;
    private float totalWeight;
    private float totalCost;
    private String providerId;
    private String inputNote;
    
    private final HashMap<String, String> properties = PropertiesController.getProperties();
    private final String url = properties.get("url");
    private final String dbUsername = properties.get("username");
    private final String dbPassword = properties.get("password");
    
    public InputHistory(){}

    public InputHistory(String supplyId, String inputDate, String inputTime, float totalWeight, float totalCost, String providerId, String inputNote) {
        this.supplyId = supplyId;
        this.inputDate = inputDate;
        this.inputTime = inputTime;
        this.totalWeight = totalWeight;
        this.totalCost = totalCost;
        this.providerId = providerId;
        this.inputNote = inputNote;
    }
    
    @Override
    public void addInputHistory(String supplyId, String inputDate, String inputTime, String providerId, String inputNote){
        Connection connection = null;
        PreparedStatement pstmt = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            String query = "INSERT INTO lichsu_nhapkho VALUES (?, ?, ?, ?, ?, ?, ?);";
            pstmt = connection.prepareStatement(query);
            
            pstmt.setString(1, supplyId);
            pstmt.setString(2, inputDate);
            pstmt.setString(3, inputTime);
            pstmt.setString(4, providerId);
            pstmt.setFloat(5, 0);
            pstmt.setFloat(6, 0);
            pstmt.setString(7, inputNote);
            
            pstmt.executeUpdate();
        }
        catch (Exception e){
            System.out.println("Error in management.models.histories.InputHistory.addInputHistory\n" + e);
        }
    }
    
    //Không xóa nhà cung cấp trong bất kỳ tình huống nào
    @Override
    public void delInputHistory(String supplyId){
        Connection connection = null;
        Statement stmt = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            String query = "UPDATE lichsu_nhapkho SET ghi_chu = 'Hủy' WHERE ma_lohang = '" + supplyId + "';";
            stmt = connection.createStatement();
            stmt.executeUpdate(query);
        }
        catch (Exception e){
            System.out.println("Error in management.models.histories.Supply.delSupply\n" + e);
        }
    }
}
