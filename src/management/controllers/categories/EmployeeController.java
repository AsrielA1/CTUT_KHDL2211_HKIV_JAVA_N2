package management.controllers.categories;

import management.database.DB;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.HashMap;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;

import management.views.categories.employee.UpdateEmployeeJFrame;
import management.models.categories.Employee;
import management.configs.PropertiesController;

interface IEmployeeController{
    void setEditable(JTextField employeeNameTF, JTextField employeeNumberTF, JTextField employeeNoteTF, boolean b);
    void showSingleEmployee(String employeeId, JTextField employeeIdTF, JTextField employeeNameTF, JTextField employeeNumberTF, JTextField employeeNoteTF);
    void showAllEmployee(JTable employeeTable);
    boolean addEmployeeData(JTextField TFemployeeId, JTextField TFpassword, JTextField TFemployeeName, JTextField TFemployeeNumber, JTextField TFemployeeNote);
    boolean delEmployee(JTable _tblEmployee);
    boolean updateEmployeeData(JTextField TFemployeeId, JTextField TFemployeeName, JTextField TFemployeeNumber, JTextField TFemployeeNote);
    void searchEmployee(JTextField _tfSearchBar, JTable _tblEmployee);
}

public class EmployeeController extends DB implements IEmployeeController{
    private final Employee employeeFunction = new Employee();
        
    public void EmployeeController(){}
    
    @Override
    public void setEditable(JTextField employeeNameTF, JTextField employeeNumberTF, JTextField employeeNoteTF, boolean b){
        employeeNameTF.setEditable(b);
        employeeNumberTF.setEditable(b);
        employeeNoteTF.setEditable(b);
    }
    
    @Override
    public void showSingleEmployee(String employeeId, JTextField employeeIdTF, JTextField employeeNameTF, JTextField employeeNumberTF, JTextField employeeNoteTF){

        String employeeName, employeeNumber, employeeNote;
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            stmt = connection.createStatement();
            query = "SELECT ho_ten, so_dienthoai, ghi_chu FROM nhan_vien WHERE ma_nhanvien = '" + employeeId + "'";
            rs = stmt.executeQuery(query);
            
            while (rs.next()){
                employeeName = String.valueOf(rs.getString(1));
                employeeNumber = String.valueOf(rs.getString(2));
                employeeNote = String.valueOf(rs.getString(3));
                
                employeeIdTF.setText(employeeId);
                employeeNameTF.setText(employeeName);
                employeeNumberTF.setText(employeeNumber);
                employeeNoteTF.setText(employeeNote);
            }
            
            
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.EmployeeController.showSingleEmployee\n" + e);
        }
    }
    
    
    @Override
    public void showAllEmployee(JTable employeeTable){
        DefaultTableModel tModel = (DefaultTableModel) employeeTable.getModel();
        tModel.setRowCount(0);
        
        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;
        String query = null;
        
        String employeeId, employeeName, employeeNumber, employeeNote;
        
        try {            
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            stmt = connection.createStatement();
            query = "SELECT ma_nhanvien, ho_ten, so_dienthoai, ghi_chu FROM nhan_vien WHERE ghi_chu NOT LIKE '%Nghỉ%';";
            rs = stmt.executeQuery(query);
            
            while (rs.next()){
                employeeId = String.valueOf(rs.getString(1));
                employeeName = String.valueOf(rs.getString(2));
                employeeNumber = String.valueOf(rs.getString(3));
                employeeNote = rs.getString(4);
                
                String employeeDataList[] = {employeeId, employeeName, employeeNumber, employeeNote};
                
                tModel.addRow(employeeDataList);
            }
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.EmployeeController.showAllEmployee\n" + e);
        }
    }
    
    @Override
    public boolean addEmployeeData(JTextField TFemployeeId, JTextField TFpassword, JTextField TFemployeeName, JTextField TFemployeeNumber, JTextField TFemployeeNote){
        try {
        
            String employeeId, password, employeeName, employeeNumber, employeeNote;

            employeeId = String.valueOf(TFemployeeId.getText());
            password = String.valueOf(TFpassword.getText());
            employeeName = String.valueOf(TFemployeeName.getText());
            employeeNumber = String.valueOf(TFemployeeNumber.getText());
            employeeNote = String.valueOf(TFemployeeNote.getText());

            return employeeFunction.addEmployee(employeeId, password, employeeName, employeeNumber, employeeNote);
        }
        catch (Exception e){
            System.out.println("Error in Error in management.controllers.categories.EmployeeController.addEmployeeData\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean delEmployee(JTable _tblEmployee){
        try{
            int row = _tblEmployee.getSelectedRow();
            DefaultTableModel dtModel = (DefaultTableModel)_tblEmployee.getModel();
            
            String _employeeId = dtModel.getValueAt(row, 0).toString();
            
            return employeeFunction.delEmployee(_employeeId);
        }
        catch(Exception e){
            System.out.println("Error in Error in management.controllers.categories.EmployeeController.delEmployee\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean updateEmployeeData(JTextField TFemployeeId, JTextField TFemployeeName, JTextField TFemployeeNumber, JTextField TFemployeeNote){
        try{
            String employeeId, employeeName, employeeNumber, employeeNote;

            employeeId = String.valueOf(TFemployeeId.getText());
            employeeName = String.valueOf(TFemployeeName.getText());
            employeeNumber = String.valueOf(TFemployeeNumber.getText());
            employeeNote = String.valueOf(TFemployeeNote.getText());

            return employeeFunction.updateEmployee(employeeId, employeeName, employeeNumber, employeeNote);
        }
        catch (Exception e){
            System.out.println("Error in Error in management.controllers.categories.EmployeeController.updateEmployeeData\n" + e);
        }
        
        return false;
    }

    @Override
    public void searchEmployee(JTextField _tfSearchBar, JTable _tblEmployee){
        DefaultTableModel tModel = (DefaultTableModel) _tblEmployee.getModel();
        tModel.setRowCount(0);
        
        String employeeId, employeeName, employeeNumber, employeeNote;
        
        String _keyword = "%" + _tfSearchBar.getText() + "%";
        
        try {            
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "SELECT * FROM sp_TimNV(?);";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _keyword);
            
            rs = pstmt.executeQuery();            
            while (rs.next()){
                employeeId = String.valueOf(rs.getString(1));
                employeeName = String.valueOf(rs.getString(2));
                employeeNumber = String.valueOf(rs.getString(3));
                employeeNote = rs.getString(4);
                
                String employeeDataList[] = {employeeId, employeeName, employeeNumber, employeeNote};
                
                tModel.addRow(employeeDataList);
            }
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.EmployeeController.showAllEmployee\n" + e);
        }
    }
    
    public boolean checkValidEmployeeId(String _employeeId){
        
        try {            
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            query = "SELECT * FROM nhan_vien WHERE ma_nhanvien = ?;";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _employeeId);
            
            rs = pstmt.executeQuery();
            while(rs.next()){
                return false;
            }
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.EmployeeController.checkValidEmployeeId\n" + e);
        }
        
        return false;
    }
    
    public boolean register(JTextField _tfEmployeeId, JTextField _tfName, JTextField _tfNumber, JTextField _tfPassword, JTextField _tfRetypePassword){
        
        try {
            String _employeeId = _tfEmployeeId.getText();
            if (!checkValidEmployeeId(_employeeId)){
                return false;
            }
            
            String _name = _tfName.getText();
            String _number = _tfNumber.getText();
            String _password = _tfPassword.getText();
            String _retypePassword = _tfRetypePassword.getText();
            
            if (_password.length() < 8)
                return false;
            
            if (!_password.equals(_retypePassword))
                return false;
            
            employeeFunction.addEmployee(_employeeId, _retypePassword, _name, _number, "");
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.EmployeeController.register\n" + e);
        }
        
        return false;
    }
    
    public boolean logIn(JTextField _tfEmployeeId, JTextField _tfPassword){
        String _employeeId = _tfEmployeeId.getText();
        String _password = _tfPassword.getText();
           
        Connection connection;
        PreparedStatement pstmt;
        ResultSet rs;
        String query;
        
        try {              
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
                      
            query = "SELECT * FROM nhan_vien WHERE ma_nhanvien = ? AND mat_khau = ?;";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, _employeeId);
            pstmt.setString(2, _password);
            
            rs = pstmt.executeQuery();
            while(rs.next()){
                return true;
            }
            
            return false;
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.categories.EmployeeController.logOut\n" + e);
        }
        
        return false;
    }
    
}
    
