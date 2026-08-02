package preparedstatements;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class InsertStudent {
	 public static void main(String[] args) 
	 {
	        Connection con = null;
	        PreparedStatement ps = null;
	        try 
	        {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            con = DriverManager.getConnection(
	                    "jdbc:oracle:thin:@//127.0.0.1:1521/xepdb1",
	                    "hr",
	                    "hr");
	            ps = con.prepareStatement(
	                    "INSERT INTO STUDENT1 VALUES(?,?,?,?,?)");
	            ps.setInt(1,1001);
	            ps.setString(2,"AJITH");
	            ps.setString(3,"X");
	            ps.setDate(4,
	                java.sql.Date.valueOf("2008-05-20"));
	            ps.setDouble(5,45000);
	            int i = ps.executeUpdate();
	            if(i>0)
	                System.out.println("Record Inserted Successfully");
	            else
	                System.out.println("Insertion Failed");
	            ps.close();
	            con.close();
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }
	    }
}
