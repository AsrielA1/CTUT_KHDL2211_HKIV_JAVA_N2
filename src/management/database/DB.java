package management.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class DB {
    protected String url = "jdbc:postgresql://localhost:5432/postgres";
    protected String dbUsername = "admin";
    protected String dbPassword = "admin";
    
    protected Connection connection;
    protected PreparedStatement pstmt;
    protected Statement stmt;
    protected ResultSet rs;
    protected String query;
}
