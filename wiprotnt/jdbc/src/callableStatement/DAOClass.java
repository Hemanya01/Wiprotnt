package callableStatement;
import java.sql.*;
public class DAOClass {

    Connection con;

    public DAOClass() {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            con=DriverManager.getConnection(
                    "jdbc:oracle:thin:@//127.0.0.1:1521/xepdb1",
                    "hr",
                    "hr");

        }

        catch(Exception e)
        {
            System.out.println(e);
        }

    }

    public void getNetSalary(int empid)
    {

        try
        {

            CallableStatement cs=
                    con.prepareCall("{call NETSALARY(?,?,?)}");

            cs.setInt(1,empid);

            cs.registerOutParameter(2,Types.VARCHAR);

            cs.registerOutParameter(3,Types.DOUBLE);

            cs.execute();

            System.out.println("Employee ID : "+empid);

            System.out.println("Employee Name : "+cs.getString(2));

            System.out.println("Net Salary : "+cs.getDouble(3));

            cs.close();

            con.close();

        }

        catch(Exception e)
        {
            System.out.println(e);
        }

    }


}
