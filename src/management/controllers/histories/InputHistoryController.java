package management.controllers.histories;

import management.database.DB;

import management.models.histories.InputHistory;

import java.text.SimpleDateFormat;

import java.sql.DriverManager;

import com.toedter.calendar.JDateChooser;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

interface IIntputHistoryController{
    void showAllInputHistory(JTable inputHistoryTable);
    boolean addInputHistory(JTextField inputHistoryIdTF, JDateChooser inputDateChooser, JTextField inputTimeTF, JTextField providerIdTF, JTextField inputHistoryNoteTF);
    boolean hideInputHistory(JTable inputHistoryTable);
}

public class InputHistoryController extends DB implements IIntputHistoryController{
    private final InputHistory inputHistory = new InputHistory();

    public InputHistoryController(){}
    
    @Override
    public void showAllInputHistory(JTable inputHistoryTable){
        DefaultTableModel tModel = (DefaultTableModel)inputHistoryTable.getModel();
        tModel.setRowCount(0);

        String inputHistoryId, inputDateTime, providerId, totalWeight, totalCost;
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            stmt = connection.createStatement();
            query = "SELECT ma_lohang, CONCAT(thoigian_nhap, ' ', ngay_nhap), nha_cungcap, tong_khoiluong, tong_chiphi FROM lichsu_nhapkho WHERE ghi_chu NOT LIKE '%Hủy%'";
            rs = stmt.executeQuery(query);
            
            while (rs.next()){
                System.out.println("This worked");
                
                inputHistoryId = rs.getString(1);
                inputDateTime = rs.getString(2);
                providerId = rs.getString(3);
                totalWeight = String.valueOf(rs.getFloat(4));
                totalCost = String.valueOf(rs.getFloat(5));
                
                String inputHistoryList[] = {inputHistoryId, inputDateTime, providerId, totalWeight, totalCost};
                
                tModel.addRow(inputHistoryList);
            }
                        
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.histories.IntputHistoryController.showAllInputHistory\n" + e);
        }
        
    }
    
    @Override
    public boolean addInputHistory(JTextField inputHistoryIdTF, JDateChooser inputDateChooser, JTextField inputTimeTF, JTextField providerIdTF, JTextField inputHistoryNoteTF){
        try {
            String inputHistoryId, inputDate, inputTime, providerId, inputHistoryNote;
        
            SimpleDateFormat desiredFormat = new SimpleDateFormat("dd/MM/yyyy");

            inputHistoryId = inputHistoryIdTF.getText();
            inputDate = desiredFormat.format(inputDateChooser.getDate());
            inputTime = inputTimeTF.getText();
            providerId = providerIdTF.getText();
            inputHistoryNote = inputHistoryNoteTF.getText();

            inputHistory.addInputHistory(inputHistoryId, inputDate, inputTime, providerId, inputHistoryNote);
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.histories.IntputHistoryController.addInputHistory\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean hideInputHistory(JTable inputHistoryTable){
        try {
            int row = inputHistoryTable.getSelectedRow();
            DefaultTableModel tModel = (DefaultTableModel)inputHistoryTable.getModel();

            String inputId = tModel.getValueAt(row, 0).toString();
            return inputHistory.delInputHistory(inputId);
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.histories.IntputHistoryController.hideInputHistory\n" + e);
        }
        
        return false;
    }
    
}
