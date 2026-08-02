package preparedstatements;

public class JDBCCalls4 {

    public static void main(String args[]) {

        DAOClass4 dao = new DAOClass4();

        if (args.length == 0) {

            dao.display();

        } else {

            dao.display(Integer.parseInt(args[0]));

        }

    }

}