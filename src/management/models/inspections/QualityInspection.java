package management.models.inspections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

import java.util.HashMap;
import management.configs.PropertiesController;


interface IQualityInspection{
    void minusWeightFromStorage(String _storageId, float _lossWeight);
    void addWeightToStorage(String _storageId, float _lossWeight);
    float getCurrentWeight(String _storageId);
    void addQualityInspection(String inspectionId, String storageId, String inspectionDate, float lossWeight, String inspectionNote);
    void delQualityInspection(String inspectionId);
}

public class QualityInspection implements IQualityInspection{
    private String inspectionId;
    private String storageId;
    private String inspectionDate;
    private float lossWeight;
    private float lossRatio;
    private String inspectionNote;
    
    private final HashMap<String, String> properties = PropertiesController.getProperties();
    private final String url = properties.get("url");
    private final String dbUsername = properties.get("username");
    private final String dbPassword = properties.get("password");
    
    public QualityInspection(){}

    public QualityInspection(String inspectionId, String storageId, String inspectionDate, float lossWeight, float lossRatio, String inspectionNote) {
        this.inspectionId = inspectionId;
        this.storageId = storageId;
        this.inspectionDate = inspectionDate;
        this.lossWeight = lossWeight;
        this.lossRatio = lossRatio;
        this.inspectionNote = inspectionNote;
    }
    
    @Override
    public void minusWeightFromStorage(String _storageId, float _lossWeight){
        Connection connection = null;
        PreparedStatement pstmt = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            String query = "UPDATE danhmuc_kho SET khoiluong_hientai = khoiluong_hientai - ? WHERE ma_kho = ?";
            pstmt = connection.prepareStatement(query);
            
            pstmt.setFloat(1, _lossWeight);
            pstmt.setString(2, _storageId);
                        
            pstmt.executeUpdate();
        }
        catch (Exception e){
            System.out.println("Error in management.models.inspections.QualityInspection.mminusWeightFromStorage\n" + e);
        }
    }
    
    @Override
    public void addWeightToStorage(String _storageId, float _lossWeight){
        Connection connection = null;
        PreparedStatement pstmt = null;
        
        try {
            Class.forName("org.postgresql.Driver");            
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            String query = "UPDATE danhmuc_kho SET khoiLuong_hientai = khoiluong_hientai + ? WHERE ma_kho = ?";
            pstmt = connection.prepareStatement(query);
            
            pstmt.setFloat(1, _lossWeight);
            pstmt.setString(2, _storageId);
            
            pstmt.executeUpdate();
            
        }
        catch (Exception e){
            System.out.println("Error in management.models.inspections.QualityInspection.addWeightToStorage\n" + e);
        }
    }
    
    @Override
    public float getCurrentWeight(String _storageId){
        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        float currentWeight = 0;
        
        try {
            Class.forName("org.postgresql.Driver");            
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            String query = "SELECT khoiLuong_hientai FROM danhmuc_kho WHERE ma_kho = '" + _storageId + "';";
            stmt = connection.createStatement();
            rs = stmt.executeQuery(query);
            
            while(rs.next()){
                currentWeight = rs.getFloat(1);
            }
        }
        catch (Exception e){
            System.out.println("Error in management.models.inspections.QualityInspection.getCurrentWeight\n" + e);
        }
        finally {
            return currentWeight;
        }        
    }

    @Override
    public void addQualityInspection(String inspectionId, String storageId, String inspectionDate, float lossWeight, String inspectionNote){
        Connection connection = null;
        PreparedStatement pstmt = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            String query = "INSERT INTO danhgia_chatluong VALUES (?, ?, ?, ?, ?, ?);";
            pstmt = connection.prepareStatement(query);
            
            pstmt.setString(1, inspectionId);
            pstmt.setString(2, storageId);
            pstmt.setString(3, inspectionDate);
            pstmt.setFloat(4, lossWeight);
            pstmt.setFloat(5, lossWeight / getCurrentWeight(storageId));
            pstmt.setString(6, inspectionNote);
            
            pstmt.executeUpdate();
            
            minusWeightFromStorage(storageId, lossWeight);
        }
        catch (Exception e){
            System.out.println("Error in management.models.inspections.QualityInspection.addQualityInspection\n" + e);
        }
    }
    
    @Override
    public void delQualityInspection(String inspectionId){
        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            String query = "UPDATE danhgia_chatluong SET lydo_haohut = 'Hủy' WHERE ma_kiemke = '" + inspectionId + "';";
            stmt = connection.createStatement();
            stmt.executeUpdate(query);
            
            query = "SELECT ma_kho, khoiluong_haohut FROM danhgia_chatluong WHERE ma_kiemke = '" + inspectionId +"';";
            rs = stmt.executeQuery(query);
            while(rs.next()){
                String _storageId = rs.getString(1);
                float _lossWeight = rs.getFloat(2);
                addWeightToStorage(_storageId, _lossWeight);
            }
        }
        catch (Exception e){
            System.out.println("Error in management.models.inspections.QualityInspection.delQualityInspection\n" + e);
        }
    }
}
