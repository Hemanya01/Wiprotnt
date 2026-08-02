package preparedstatements;

import java.sql.*;

public class DAOClass4 {

    Connection con;

    public DAOClass4() {

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
    public void display() {

        try {

            PreparedStatement ps =
                    con.prepareStatement("SELECT * FROM STUDENT1");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getInt("ROLLNO") + "\t" +
                        rs.getString("STUDENTNAME") + "\t" +
                        rs.getString("STANDARD") + "\t" +
                        rs.getDate("DATE_OF_BIRTH") + "\t" +
                        rs.getDouble("FEES"));

            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
    public void display(int rollno) {

        try {

            PreparedStatement ps =
                    con.prepareStatement(
                            "SELECT * FROM STUDENT1 WHERE ROLLNO=?");

            ps.setInt(1, rollno);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println(
                        rs.getInt("ROLLNO") + "\t" +
                        rs.getString("STUDENTNAME") + "\t" +
                        rs.getString("STANDARD") + "\t" +
                        rs.getDate("DATE_OF_BIRTH") + "\t" +
                        rs.getDouble("FEES"));

            } else {

                System.out.println("Student Not Found");

            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}