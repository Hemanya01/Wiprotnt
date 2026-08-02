package preparedstatements;
import java.sql.*;
public class DAOClass {
	Connection con;
    public DAOClass() 
    {
        try 
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//127.0.0.1:1521/xepdb1",
                    "hr",
                    "hr");
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
    public void insert(int rollno, String name, String dob, int fee) {
        try 
        {
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO STUDENT VALUES(?,?,TO_DATE(?,'DD-MON-YYYY'),?)");
            ps.setInt(1, rollno);
            ps.setString(2, name);
            ps.setString(3, dob);
            ps.setInt(4, fee);
            int i = ps.executeUpdate();
            if(i > 0)
                System.out.println("Record Inserted");
        } 
        catch(Exception e) 
        {
            System.out.println(e);
        }
    }
    public void delete(int rollno) {
        try 
        {
            PreparedStatement ps = con.prepareStatement(
                    "DELETE FROM STUDENT WHERE ROLLNO=?");
            ps.setInt(1, rollno);
            int i = ps.executeUpdate();
            if(i > 0)
                System.out.println("Record Deleted");
        } 
        catch(Exception e) 
        {
            System.out.println(e);
        }
    }
    public void modify(int rollno, int fee) {
        try 
        {
            PreparedStatement ps = con.prepareStatement(
                    "UPDATE STUDENT SET FEE=? WHERE ROLLNO=?");
            ps.setInt(1, fee);
            ps.setInt(2, rollno);
            int i = ps.executeUpdate();
            if(i > 0)
                System.out.println("Record Updated");
        } 
        catch(Exception e) 
        {
            System.out.println(e);
        }
    }
    public void display() {
        try 
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(
                    "SELECT * FROM STUDENT");
            while(rs.next()) 
            {
                System.out.println(
                        rs.getInt(1)+" "+
                        rs.getString(2)+" "+
                        rs.getDate(3)+" "+
                        rs.getInt(4));
            }
        } 
        catch(Exception e) 
        {
            System.out.println(e);
        }
    }
    public void display(int rollno) {
        try 
        {
            PreparedStatement ps = con.prepareStatement(
                    "SELECT * FROM STUDENT WHERE ROLLNO=?");
            ps.setInt(1, rollno);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) 
            {
                System.out.println(
                        rs.getInt(1)+" "+
                        rs.getString(2)+" "+
                        rs.getDate(3)+" "+
                        rs.getInt(4));
            }
        } 
        catch(Exception e) 
        {
            System.out.println(e);
        }
    }
}
