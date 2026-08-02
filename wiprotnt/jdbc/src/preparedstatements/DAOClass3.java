package preparedstatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DAOClass3 {

    Connection con;

    public DAOClass3() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//127.0.0.1:1521/xepdb1",
                    "hr",
                    "hr");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void modifyStudent(int rollno, double fees) {

        try {

            PreparedStatement ps = con.prepareStatement(
                    "UPDATE HR.STUDENT1 SET FEES=? WHERE ROLLNO=?");

            ps.setDouble(1, fees);
            ps.setInt(2, rollno);

            int i = ps.executeUpdate();

            if (i > 0) {
                System.out.println("Student Fee Updated Successfully");
            } else {
                System.out.println("Student Not Found");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}