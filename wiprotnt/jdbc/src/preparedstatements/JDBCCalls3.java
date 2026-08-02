package preparedstatements;

public class JDBCCalls3 {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage : java JDBCCalls3 <RollNo> <NewFee>");
            return;
        }

        DAOClass3 dao = new DAOClass3();

        int rollno = Integer.parseInt(args[0]);
        double fee = Double.parseDouble(args[1]);

        dao.modifyStudent(rollno, fee);

    }

}