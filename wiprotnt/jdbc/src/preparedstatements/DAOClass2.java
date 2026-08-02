package preparedstatements;

import java.sql.*;

public class DAOClass2 {
    Connection con;
    public DAOClass2() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//127.0.0.1:1521/xepdb1",
                    "hr",
                    "hr");
        }
        catch(Exception e) 
        {
            System.out.println(e);
        }
    }
    public void deleteStudent(int rollno) {
        try {
            PreparedStatement ps1 =
                    con.prepareStatement(
                    "SELECT ROLLNO,STUDENTNAME,STANDARD FROM STUDENT1 WHERE ROLLNO=?");

            ps1.setInt(1, rollno);
            ResultSet rs = ps1.executeQuery();
            if(rs.next()) {
                PreparedStatement ps2 =
                        con.prepareStatement(
                        "INSERT INTO STUDENTLOG VALUES(?,?,?,SYSDATE)");
                ps2.setInt(1, rs.getInt("ROLLNO"));
                ps2.setString(2,
                        rs.getString("STUDENTNAME"));
                ps2.setString(3,
                        rs.getString("STANDARD"));
                ps2.executeUpdate();
                PreparedStatement ps3 =
                        con.prepareStatement(
                        "DELETE FROM STUDENT1 WHERE ROLLNO=?");
                ps3.setInt(1, rollno);
                int i = ps3.executeUpdate();
                if(i>0)
                    System.out.println("Student Deleted Successfully");

                else
                    System.out.println("Deletion Failed");

                ps2.close();
                ps3.close();

            }
            else 
            {
                System.out.println("Student Not Found");
            }
            rs.close();
            ps1.close();
        }
        catch(Exception e) 
        {
            System.out.println(e);
        }
    }
}