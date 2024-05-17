package management.controllers.histories;

import management.database.DB;

import management.models.details.OutputDetail;

import java.sql.DriverManager;

import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


interface IOutputDetailController{
    void showAllOutputDetail(JTable outputDetailTable, String outputHistoryId);
    boolean addOutputDetail(JTextField _tfOutputId, JTextField _tfStorageId, JTextField _tfIncomPerCost, JTextField _tfWeight, JTextField _tfOutputNote);
    boolean delOutputDetail(JTextField _tfOutputId, JTable _tblOutputDetail);
    void searchOutputDetail(JTextField _tfSearchBar, JTable _tblOutputDetail);
}

public class OutputDetailController extends DB implements IOutputDetailController{
    private final OutputDetail outputDetail = new OutputDetail();
    
    public OutputDetailController(){};
    
    @Override
    public void showAllOutputDetail(JTable outputDetailTable, String outputHistoryId){
        DefaultTableModel tModel = (DefaultTableModel)outputDetailTable.getModel();
        tModel.setRowCount(0);
        
        String outputDetailId, storageId, weight, income, incomePerWeight;
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            stmt = connection.createStatement();
            query = "SELECT so_thutu, ma_kho, khoi_luong, doanh_thu, doanhthu_theodv FROM chitiet_xuatkho WHERE ghi_chu NOT LIKE '%Hủy%' AND ma_xuatkho = '" + outputHistoryId + "';";
            System.out.println(query);
            rs = stmt.executeQuery(query);
            
            while (rs.next()){
                outputDetailId = rs.getString(1);
                storageId = rs.getString(2);
                weight = String.valueOf(rs.getFloat(3));
                income = String.valueOf(rs.getFloat(4));
                incomePerWeight = String.valueOf(rs.getFloat(5));
                
                String outputDetailData[] = {outputDetailId, storageId, weight, income, incomePerWeight};
                
                tModel.addRow(outputDetailData);
            }
                        
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.histories.OutputDetailController.showAllOutputDetail\n" + e);
        }
    }
   
    @Override
    public boolean addOutputDetail(JTextField _tfOutputId, JTextField _tfStorageId, JTextField _tfIncomPerCost, JTextField _tfWeight, JTextField _tfOutputNote){
        try {
            String _outputId = _tfOutputId.getText();
            String _storageId = _tfStorageId.getText();
            float _incomePerCost = Float.parseFloat(_tfIncomPerCost.getText());
            float _weight = Float.parseFloat(_tfWeight.getText());
            String _outputNote = _tfOutputNote.getText();
            
            return outputDetail.addOutputDetail(_outputId, _storageId, _incomePerCost, _weight, _outputNote);
            
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.histories.OutputDetailController.addOutputDetail\n" + e);
        }
        return false;
    }
    
    @Override
    public boolean delOutputDetail(JTextField _tfOutputId, JTable _tblOutputDetail){
        
        try {            
            int[] rows = _tblOutputDetail.getSelectedRows();
            DefaultTableModel dtModel = (DefaultTableModel)_tblOutputDetail.getModel();
            
            String _outputId = _tfOutputId.getText();
            int _outputNum;
            
            for (int i = 0; i < rows.length; i++){
                _outputNum = Integer.parseInt(dtModel.getValueAt(rows[i], 0).toString());
                
                outputDetail.delOutputDetail(_outputId, _outputNum);
            }
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.histories.OutputDetailController.addOutputDetail\n" + e);
        }
        return false;
    }  
    
    @Override
    public void searchOutputDetail(JTextField _tfSearchBar, JTable _tblOutputDetail){
    }

}
