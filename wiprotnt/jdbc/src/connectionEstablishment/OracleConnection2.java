package connectionEstablishment;
import java.sql.Connection;
import java.sql.DriverManager;
public class OracleConnection2 {

	public static void main(String[] args) {
		Connection con = null;
        try 
        {
            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//127.0.0.1:1521/xepdb1",
                    "hr",
                    "hr");   
            if(con != null)
                System.out.println("Connection Established successfully");
            else
                System.out.println("Connection could not be established");
            con.close();
        }
        catch(Exception e) 
        {
            System.out.println(e);
        }
	}
}
