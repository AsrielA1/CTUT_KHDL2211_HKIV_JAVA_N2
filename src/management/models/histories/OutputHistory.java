package management.models.histories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import java.sql.Time;
import java.sql.Date;

import java.util.HashMap;

import management.configs.PropertiesController;

interface IOutputHistory{    
    void addOutputHistory(String outputId, String outputDate, String outputTime, String outputNote);
    void delOutputHistory(String outputId);
}

public class OutputHistory implements IOutputHistory{
    private String outputId;
    private String outputDate;
    private String outputTime;
    private float totalOutputWeight;
    private float totalIncome;
    private String outputNote;
    
    private final HashMap<String, String> properties = PropertiesController.getProperties();
    private final String url = properties.get("url");
    private final String dbUsername = properties.get("username");
    private final String dbPassword = properties.get("password");
    
    public OutputHistory(){}

    public OutputHistory(String outputId, String outputDate, String outputTime, float totalOutputWeight, float totalIncome, String outputNote) {
        this.outputId = outputId;
        this.outputDate = outputDate;
        this.outputTime = outputTime;
        this.totalOutputWeight = totalOutputWeight;
        this.totalIncome = totalIncome;
        this.outputNote = outputNote;
    }
    
    @Override
    public void addOutputHistory(String outputId, String outputDate, String outputTime, String outputNote){
        Connection connection = null;
        PreparedStatement pstmt = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            String query = "INSERT INTO lichsu_xuatkho VALUES (?, ?, ?, ?, ?, ?);";
            pstmt = connection.prepareStatement(query);
            
            pstmt.setString(1, outputId);
            pstmt.setString(2, outputDate);
            pstmt.setString(3, outputTime);
            pstmt.setFloat(4, 0);
            pstmt.setFloat(5, 0);
            pstmt.setString(6, outputNote);
            
            pstmt.executeUpdate();
        }
        catch (Exception e){
            System.out.println("Error in management.models.histories.OutputHistory.addOutputHistory\n" + e);
        }
    }
    
    @Override
    public void delOutputHistory(String outputId){
        Connection connection = null;
        Statement stmt = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            String query = "UPDATE lichsu_xuatkho SET ghi_chu = \'Hủy\' WHERE ma_lohang = '" + outputId + "';";
            stmt = connection.createStatement();
            stmt.executeUpdate(query);
        }
        catch (Exception e){
            System.out.println("Error in management.models.hítories.OutputHistory.delOutputHistory\n" + e);
        }
    }
    
}
