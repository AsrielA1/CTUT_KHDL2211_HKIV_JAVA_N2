package management.models.histories;

import management.database.DB;

import management.models.details.InputDetail;

import java.sql.DriverManager;


interface IInputHistory{
    boolean addInputHistory(String supplyId, String inputDate, String inputTime, String providerId, String inputNote);
    boolean delInputHistory(String supplyId);
    
}

public class InputHistory extends DB implements IInputHistory{
    
    private final InputDetail iDetailModel = new InputDetail();
            
    private String supplyId;
    private String inputDate;
    private String inputTime;
    private float totalWeight;
    private float totalCost;
    private String providerId;
    private String inputNote;

    public InputHistory(){}

    public InputHistory(String supplyId, String inputDate, String inputTime, float totalWeight, float totalCost, String providerId, String inputNote) {
        this.supplyId = supplyId;
        this.inputDate = inputDate;
        this.inputTime = inputTime;
        this.totalWeight = totalWeight;
        this.totalCost = totalCost;
        this.providerId = providerId;
        this.inputNote = inputNote;
    }
    
    @Override
    public boolean addInputHistory(String supplyId, String inputDate, String inputTime, String providerId, String inputNote){

        try {
            Class.forName("org.postgresql.Driver");
            
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            String query = "INSERT INTO lichsu_nhapkho VALUES (?, ?, ?, ?, ?, ?, ?);";
            pstmt = connection.prepareStatement(query);
            
            pstmt.setString(1, supplyId);
            pstmt.setString(2, inputDate);
            pstmt.setString(3, inputTime);
            pstmt.setString(4, providerId);
            pstmt.setFloat(5, 0);
            pstmt.setFloat(6, 0);
            pstmt.setString(7, inputNote);
            
            pstmt.executeUpdate();
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.models.histories.InputHistory.addInputHistory\n" + e);
        }
        
        return false;
    }
    
    //Không xóa nhà cung cấp trong bất kỳ tình huống nào
    @Override
    public boolean delInputHistory(String supplyId){

        String _supplyId;
        int _inputNum;
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            String query = "UPDATE lichsu_nhapkho SET ghi_chu = 'Hủy' WHERE ma_lohang = '" + supplyId + "';";
            stmt = connection.createStatement();
            stmt.executeUpdate(query);
            
            query = """
                    SELECT ma_lohang, so_thutu
                    FROM chitiet_nhapkho
                    WHERE ghi_chu NOT LIKE '%Hủy%';
                    """;
            rs = stmt.executeQuery(query);
            
            while(rs.next()){
                _supplyId = rs.getString(1);
                _inputNum = rs.getInt(2);
                
                iDetailModel.delInputDetail(supplyId, _inputNum);
            }
            
            return true;
        }
        catch (Exception e){
            System.out.println("Error in management.models.histories.Supply.delSupply\n" + e);
        }
        
        return false;
    }
}
