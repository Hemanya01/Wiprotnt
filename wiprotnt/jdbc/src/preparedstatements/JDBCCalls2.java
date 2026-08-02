package preparedstatements;

public class JDBCCalls2 {
		 public static void main(String[] args) {
		        DAOClass2 dao = new DAOClass2();
		        dao.deleteStudent(Integer.parseInt(args[0]));
		    }
}
