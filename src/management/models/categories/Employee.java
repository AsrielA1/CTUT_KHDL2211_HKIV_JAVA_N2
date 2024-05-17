package management.models.categories;

import management.database.DB;

import java.sql.DriverManager;


interface IEmployee{
    boolean addEmployee(String employeeId, String employeePassword, String employeeName, String employeeNumber, String employeeNote);
    boolean delEmployee(String employeeId);
    boolean updateEmployee(String employeeId, String employeeName, String employeeNumber, String employeeNote);
}

public class Employee extends DB implements IEmployee{
    private String employeeId;
    private String password;
    private String employeeName;
    private String employeeNumber;
    private String employeeNote;

    public Employee(){}

    public Employee(String employeeId, String password, String employeeName, String employeeNumber) {
        this.employeeId = employeeId;
        this.password = password;
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
    }
        
    @Override
    public boolean addEmployee(String employeeId, String employeePassword, String employeeName, String employeeNumber, String employeeNote){

        try {
            Class.forName("org.postgresql.Driver");
            
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            String query = "INSERT INTO nhan_vien VALUES (?, ?, ?, ?, ?);";
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, employeeId);
            pstmt.setString(2, employeePassword);
            pstmt.setString(3, employeeName);
            pstmt.setString(4, employeeNumber);
            pstmt.setString(5, employeeNote);
            
            pstmt.executeUpdate();
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.models.catagories.Employee.addEmployee\n" + e);
        }
        
        return false;
    }
    
    @Override
    public boolean delEmployee(String employeeId){
  
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            String query = "UPDATE nhan_vien SET ghi_chu = 'Nghỉ' WHERE ma_nhanvien = '" + employeeId + "';";
            stmt = connection.createStatement();
            stmt.executeUpdate(query);
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.models.catagories.Employee.delEmployee\n" + e);
        }
        
        return false;
    }
    
    
    @Override
    public boolean updateEmployee(String employeeId, String employeeName, String employeeNumber, String employeeNote){

        try {
            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            String query = "UPDATE nhan_vien "
                    + "SET ho_ten = ?, so_dienthoai = ?, ghi_chu = ? "
                    + "WHERE ma_nhanvien = ?;";
            
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, employeeName);
            pstmt.setString(2, employeeNumber);
            pstmt.setString(3, employeeNote);
            pstmt.setString(4, employeeId);
            
            pstmt.executeUpdate();
            
            return true;            
        }
        catch (Exception e){
            System.out.println("Error in management.models.catagories.Employee.updateEmployee\n" + e);
        }
        
        return false;
    }

}
