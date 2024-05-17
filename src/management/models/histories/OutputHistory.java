package management.models.histories;

import management.database.DB;

import java.sql.DriverManager;

interface IOutputHistory{    
    boolean addOutputHistory(String outputId, String outputDate, String outputTime, String outputNote);
    boolean delOutputHistory(String outputId);
}

public class OutputHistory extends DB implements IOutputHistory{
    private String outputId;
    private String outputDate;
    private String outputTime;
    private float totalOutputWeight;
    private float totalIncome;
    private String outputNote;
    
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
    public boolean addOutputHistory(String outputId, String outputDate, String outputTime, String outputNote){
 
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
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.models.histories.OutputHistory.addOutputHistory\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean delOutputHistory(String outputId){
 
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            String query = "UPDATE lichsu_xuatkho SET ghi_chu = \'Hủy\' WHERE ma_xuatkho = '" + outputId + "';";
            stmt = connection.createStatement();
            stmt.executeUpdate(query);
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.models.hítories.OutputHistory.delOutputHistory\n" + e);
        }
        
        return false;
    }
    
}
