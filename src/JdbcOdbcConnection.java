import java.sql.*;
public class JdbcOdbcConnection {
    public static void main(String[] args) throws Exception
    {
        Connection con= DriverManager.getConnection("jdbc:odbc:demodsn1","scott","tiger");
        if( con== null)
        {
            System.out.println("Connection is  not established");
        }
        else
            System.out.println("Connection established successfully");
    }
}
