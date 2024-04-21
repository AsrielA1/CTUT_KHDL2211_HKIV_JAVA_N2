package management.controllers.histories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

import java.util.HashMap;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import management.configs.PropertiesController;
import management.models.details.InputDetail;

interface IInputDetailController{
    void showAllInputDetail(JTable inputDetailTable, String _inputHistoryId);
    boolean addInputDetail(JTextField _tfSupplyId, JTextField _tfStorageId, JTextField costPerWeightTF, JTextField weightTF, JTextField inputDetailNoteTF);
    boolean hideInputDetail(JTable inputDetailTable, JComboBox inputHistoryIdChooser);
    void searchInputDetail(JTextField _tfSearchBar, JTable _tblInputDetail);
}

public class InputDetailController implements IInputDetailController{
    private final InputDetail inputDetail = new InputDetail();
    
    private final HashMap<String, String> properties = PropertiesController.getProperties();
    private final String url = properties.get("url");
    private final String dbUsername = properties.get("username");
    private final String dbPassword = properties.get("password");
    
    public InputDetailController(){}
    
    @Override
    public void showAllInputDetail(JTable inputDetailTable, String _inputHistoryId){
        DefaultTableModel tModel = (DefaultTableModel)inputDetailTable.getModel();
        tModel.setRowCount(0);
        
        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;
        String query = null;
        
        String inputDetailId, storageId, weight, cost, costPerWeight;
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            stmt = connection.createStatement();
            query = "SELECT so_thutu, ma_kho, khoi_luong, chi_phi, chiphi_theodv FROM chitiet_nhapkho WHERE ghi_chu NOT LIKE '%Hủy%' AND ma_lohang = '" + _inputHistoryId + "';";
            System.out.println(query);
            rs = stmt.executeQuery(query);
            
            while (rs.next()){                
                inputDetailId = rs.getString(1);
                storageId = rs.getString(2);
                weight = String.valueOf(rs.getFloat(3));
                cost = String.valueOf(rs.getFloat(4));
                costPerWeight = String.valueOf(rs.getFloat(5));
                
                String inputHistoryList[] = {inputDetailId, storageId, weight, cost, costPerWeight};
                
                tModel.addRow(inputHistoryList);
            }
                        
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.histories.InputDetailController.showAllInputDetail\n" + e);
        }
    }
    
    @Override
    public boolean addInputDetail(JTextField _tfSupplyId, JTextField _tfStorageId, JTextField costPerWeightTF, JTextField weightTF, JTextField inputDetailNoteTF){
        try {        
            String inputId, storageId, inputDetailNote;
            float costPerWeight, weight;

            inputId = _tfSupplyId.getText();
            storageId = _tfStorageId.getText();
            costPerWeight = Float.parseFloat(costPerWeightTF.getText());
            weight = Float.parseFloat(weightTF.getText());
            inputDetailNote = inputDetailNoteTF.getText();

            inputDetail.addInputDetail(inputId, storageId, costPerWeight, weight, inputDetailNote);
            
            return true;
        }
        catch (Exception e) {
            System.out.println("Error in management.controllers.categories.histories.InputDetailController.addInputDetail\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean hideInputDetail(JTable inputDetailTable, JComboBox inputHistoryIdChooser){
        try {
            int row = inputDetailTable.getSelectedRow();
            DefaultTableModel tModel = (DefaultTableModel)inputDetailTable.getModel();

            String inputHistoryId = inputHistoryIdChooser.getSelectedItem().toString();
            int inputDetailNumber = Integer.parseInt(tModel.getValueAt(row, 0).toString());

            inputDetail.delInputDetail(inputHistoryId, inputDetailNumber);
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.histories.InputDetailController.hideInputDetail\n" + e);
        }
        
        return false;
    }
    
    @Override
    public void searchInputDetail(JTextField _tfSearchBar, JTable _tblInputDetail){
        DefaultTableModel tModel = (DefaultTableModel)_tblInputDetail.getModel();
        tModel.setRowCount(0);
        
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String query = null;
        
        String inputDetailNum, storageId, weight, cost, costPerWeight;
        
        String keyword = "%" + _tfSearchBar.getText() + "%";
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "SELECT * FROM sp_TimChitietNhap(?);";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, keyword);
            
            rs = pstmt.executeQuery();
            while(rs.next()){
                inputDetailNum = rs.getString(1);
                storageId = rs.getString(2);
                weight = String.valueOf(rs.getFloat(3));
                cost = String.valueOf(rs.getFloat(4));
                costPerWeight = String.valueOf(rs.getFloat(5));
                
                String[] inputDetailData = {inputDetailNum, storageId, weight, cost, costPerWeight};
                tModel.addRow(inputDetailData);
            }           
                        
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.histories.InputDetailController.searchInputDetail\n" + e);
        }
    }
}   
