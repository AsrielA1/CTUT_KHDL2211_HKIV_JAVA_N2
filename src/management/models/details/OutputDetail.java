package management.models.details;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.HashMap;
import management.configs.PropertiesController;


interface IOutputDetail{
    void minusWeightFromStorage(String storageId, float weight);
    void addWeightToOutputHistory(String ouputId, float weight, float cost);
    boolean addOutputDetail(String outputId, String storageId, float incomePerWeight, float weight, String _outputNote);
    
    void addWeightToStorage(String storageId, float weight);
    void minusWeightFromOutputHistory(String outputId, float weight, float cost);
    void delOutputDetail(String outputId, int outputNumber);
}

public class OutputDetail implements IOutputDetail{
    private String outputId;
    private int outputNumber;
    private String storageId;
    private float weight;
    
    public OutputDetail(){}

    public OutputDetail(String outputId, int outputNumber, String storageId, float weight) {
        this.outputId = outputId;
        this.outputNumber = outputNumber;
        this.storageId = storageId;
        this.weight = weight;
    }
    
    private final HashMap<String, String> properties = PropertiesController.getProperties();
    private final String url = properties.get("url");
    private final String dbUsername = properties.get("username");
    private final String dbPassword = properties.get("password");
    
    @Override
    public void minusWeightFromStorage(String storageId, float weight){
        Connection connection = null;
        PreparedStatement pstmt = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            String query = "UPDATE danhmuc_kho SET khoiluong_hientai = khoiluong_hientai - ? WHERE ma_kho = ?";
            pstmt = connection.prepareStatement(query);
            
            pstmt.setFloat(1, weight);
            pstmt.setString(2, storageId);
            
            pstmt.executeUpdate();
            
        }
        catch (Exception e){
            System.out.println("Error in management.models.details.OutputDetail.minusWeightFromStorage\n" + e);
        }
    }
    
    @Override
    public void addWeightToOutputHistory(String ouputId, float weight, float income){
        Connection connection = null;
        PreparedStatement pstmt = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            String query = "UPDATE lichsu_xuatkho SET tong_khoiluong = tong_khoiluong + ?, tong_doanhthu = tong_doanhthu + ? WHERE ma_xuatkho = ?";
            pstmt = connection.prepareStatement(query);
            
            pstmt.setFloat(1, weight);
            pstmt.setFloat(2, income);
            pstmt.setString(3, ouputId);
            
            pstmt.executeUpdate();
        }
        catch (Exception e){
            System.out.println("Error in management.models.details.OutputDetail.addWeightToOutputHistory\n" + e);
        }
    }
    
    @Override
    public boolean addOutputDetail(String outputId, String storageId, float incomePerWeight, float weight, String _outputNote){
        Connection connection = null;
        PreparedStatement pstmt = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            float income = incomePerWeight * weight;
            
            String query = "INSERT INTO chitiet_xuatkho(ma_xuatkho, ma_kho, doanhthu_theodv, khoi_luong, doanh_thu, ghi_chu) VALUES (?, ?, ?, ?, ?, ?);";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, outputId);
            pstmt.setString(2, storageId);
            pstmt.setFloat(3, incomePerWeight);
            pstmt.setFloat(4, weight);
            pstmt.setFloat(5, income);
            pstmt.setString(6, _outputNote);
            
            pstmt.executeUpdate();
            
            minusWeightFromStorage(storageId, weight);
            addWeightToOutputHistory(outputId, weight, income);
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.models.details.OutputDetail.addOutputDetail\n" + e);
        }
        
        return false;
    }
    
    @Override
    public void addWeightToStorage(String storageId, float weight){
        Connection connection = null;
        PreparedStatement pstmt = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            String query = "UPDATE danhmuc_kho SET khoiluong_hientai = khoiluong_hientai + ? WHERE ma_kho = ?";
            pstmt = connection.prepareStatement(query);
            
            pstmt.setFloat(1, weight);
            pstmt.setString(2, storageId);
            
            pstmt.executeUpdate();
            
        }
        catch (Exception e){
            System.out.println("Error in management.models.details.OutputDetail.addWeightToStorage\n" + e);
        }
    }
    
    @Override
    public void minusWeightFromOutputHistory(String outputId, float weight, float income){
        Connection connection = null;
        PreparedStatement pstmt = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            String query = "UPDATE lichsu_xuatkho SET tong_khoiluong = tong_khoiluong - ?, tong_doanhthu = tong_doanhthu - ? WHERE ma_xuatkho = ?";
            pstmt = connection.prepareStatement(query);
            
            pstmt.setFloat(1, weight);
            pstmt.setFloat(2, income);
            pstmt.setString(3, outputId);
            
            System.out.println("Weight = " + String.valueOf(weight));
            System.out.println("Income = " + String.valueOf(income));
            System.out.println("OutputId = " + String.valueOf(outputId));
            
            pstmt.executeUpdate();
        }
        catch (Exception e){
            System.out.println("Error in management.models.details.OutputDetail.minusWeightFromOutputHistory\n" + e);
        }
    }
    
    @Override
    public void delOutputDetail(String outputId, int outputNumber){
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            String query = "SELECT ma_kho, khoi_luong, doanh_thu FROM chitiet_xuatkho WHERE ma_xuatkho = ? AND so_thutu = ?";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, outputId);
            pstmt.setInt(2, outputNumber);
            
            rs = pstmt.executeQuery();
            if (rs.next()){
                String _storageId = rs.getString(1);
                float _weight = rs.getFloat(2);
                float _income = rs.getFloat(3);
                
                addWeightToStorage(_storageId, _weight);
                minusWeightFromOutputHistory(outputId, _weight, _income);
            }
            
            query = "UPDATE chitiet_xuatkho SET ghi_chu = 'Hủy' WHERE ma_xuatkho = ? AND so_thutu = ?;";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, outputId);
            pstmt.setInt(2, outputNumber);

            pstmt.executeUpdate();
        }
        catch (Exception e){
            System.out.println("Error in management.models.details.OutputDetail.delOutputDetail\n" + e);
        }
    }
}
