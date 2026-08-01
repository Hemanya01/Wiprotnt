package connectionEstablishment;
import java.sql.Connection;
import java.sql.DriverManager;

public class OracleConnection {

	public static void main(String[] args) {
		Connection con = null;
        try 
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//127.0.0.1:1521/xepdb1",
                    "hr",
                    "hr");   
            if(con != null)
                System.out.println("Connection Established successfully");
            else
                System.out.println("Connection could not be established");

        }
        catch(Exception e) 
        {
            System.out.println(e);
        }
	}
}
