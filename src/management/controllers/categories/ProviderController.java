package management.controllers.categories;

import management.database.DB;

import management.models.categories.Provider;

import java.sql.DriverManager;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;

interface IProviderController{
    void showSingleProvider(JTextField _tfProviderId, JTextField _tfProviderName, JTextField _tfProviderEmail, JTextField _tfProviderNumber, JTextField _tfProviderNote);
    boolean addProvider(JTextField providerIdTF, JTextField providerNameTF, JTextField providerMailTF, JTextField providerNumberTF, JTextField providerNoteTF);
    boolean updateProvider(JTextField providerIdTF, JTextField providerNameTF, JTextField providerMailTF, JTextField providerNumberTF, JTextField providerNoteTF);
    void showAllProvider(JTable providerTable);   
    boolean delProvider(JTable providerTable);
    void searchProvider(JTextField _tfProviderId, JTable _tblProvider);
}

public class ProviderController extends DB implements IProviderController {
    private final Provider providerModel = new Provider();

    public ProviderController(){}
    
    @Override
    public void showSingleProvider(JTextField _tfProviderId, JTextField _tfProviderName, JTextField _tfProviderEmail, JTextField _tfProviderNumber, JTextField _tfProviderNote){

        String _providerId = _tfProviderId.getText();
        String _providerName, _providerEmail, _providerNumber, _providerNote;
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "SELECT ten_nhacungcap, diachi_email, so_dienthoai, ghi_chu FROM nha_cungcap WHERE ma_nhacungcap = ?;";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _providerId);
            
            rs = pstmt.executeQuery();
            while(rs.next()){
                _providerName = rs.getString(1);
                _providerEmail = rs.getString(2);
                _providerNumber = rs.getString(3);
                _providerNote = rs.getString(4);
                
                _tfProviderId.setText(_providerId);
                _tfProviderName.setText(_providerName);
                _tfProviderEmail.setText(_providerEmail);
                _tfProviderNumber.setText(_providerNumber);
                _tfProviderNote.setText(_providerNote);
            }
            
        }
        
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.ProviderController.showSingleProviderData\n" + e);
        }
        
        
    }
    
    @Override
    public boolean addProvider(JTextField providerIdTF, JTextField providerNameTF, JTextField providerMailTF, JTextField providerNumberTF, JTextField providerNoteTF){
        try {
            String providerId, providerName, providerMail, providerNumber, providerNote;

            providerId = providerIdTF.getText();
            providerName = providerNameTF.getText();
            providerMail = providerMailTF.getText();
            providerNumber = providerNumberTF.getText();
            providerNote = providerNoteTF.getText();
            
            return providerModel.addProvider(providerId, providerName, providerMail, providerNumber, providerNote);
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.ProviderController.addProviderData\n" + e);
        }
        
        return false;
    }
    
    @Override
    public  boolean updateProvider(JTextField providerIdTF, JTextField providerNameTF, JTextField providerMailTF, JTextField providerNumberTF, JTextField providerNoteTF){
        String providerId, providerName, providerMail, providerNumber, providerNote;
        
        try {
            providerId = providerIdTF.getText();
            providerName = providerNameTF.getText();
            providerMail = providerMailTF.getText();
            providerNumber = providerNumberTF.getText();
            providerNote = providerNoteTF.getText();
            
            System.out.println(providerId + providerName + providerMail + providerNumber + providerNote);
            
            return providerModel.updateProvider(providerId, providerName, providerMail, providerNumber, providerNote);
        }
        catch (Exception e) {
            System.out.println("Error in management.controllers.categories.ProviderController.updateProviderData\n" + e);
        }
        
        return false;
    }
    
    @Override
    public void showAllProvider(JTable providerTable){
        DefaultTableModel tModel = (DefaultTableModel) providerTable.getModel();
        tModel.setRowCount(0);
        
        String providerId, providerName, providerMail, providerNumber;
        
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            stmt = connection.createStatement();
            query = "SELECT ma_nhacungcap, ten_nhacungcap, diachi_email, so_dienthoai FROM nha_cungcap WHERE ghi_chu NOT LIKE '%Ngừng%';";
            rs = stmt.executeQuery(query);

            
            while (rs.next()){
                providerId = String.valueOf(rs.getString(1));
                providerName = String.valueOf(rs.getString(2));
                providerMail = String.valueOf(rs.getString(3));
                providerNumber = String.valueOf(rs.getString(4));
                
                String providerDataList[] = {providerId, providerName, providerMail, providerNumber};
                
                tModel.addRow(providerDataList);
            }
        }
        catch (Exception e) {
            System.out.println("Error in management.controllers.categories.ProviderController.showAllProviderData\n" + e);
        }
    }
    
    @Override
    public boolean delProvider(JTable providerTable){
        try {
            int row = providerTable.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel)providerTable.getModel();
            
            String providerId = model.getValueAt(row, 0).toString();
            return providerModel.delProvider(providerId);
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.ProviderController.hideProviderData\n" + e);
        }
        
        return false;
    }
    
    @Override
    public void searchProvider(JTextField _tfSearchBar, JTable _tblProvider){
        DefaultTableModel tModel = (DefaultTableModel) _tblProvider.getModel();
        tModel.setRowCount(0);
        
        String providerId, providerName, providerMail, providerNumber;
        
        String keyword = "%" + _tfSearchBar.getText() + "%";
        
        System.out.println(keyword + "\n");
        
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "SELECT * FROM sp_TimNhaCungCap(?);";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, keyword);
            
            rs = pstmt.executeQuery();
            
            while (rs.next()){
                providerId = String.valueOf(rs.getString(1));
                providerName = String.valueOf(rs.getString(2));
                providerMail = String.valueOf(rs.getString(3));
                providerNumber = String.valueOf(rs.getString(4));
                
                String providerDataList[] = {providerId, providerName, providerMail, providerNumber};
                
                tModel.addRow(providerDataList);
            }
        }
        catch (Exception e) {
            System.out.println("Error in management.controllers.categories.ProviderController.searchProvider\n" + e);
        }
    }
}
