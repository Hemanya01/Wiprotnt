package callableStatement;

public class JDBCCalls {

    public static void main(String args[]) 
    {
        DAOClass dao = new DAOClass();
        dao.getNetSalary(Integer.parseInt(args[0]));
    }
}
