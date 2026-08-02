package preparedstatements;

public class JDBCCalls {
	public static void main(String[] args) {
        DAOClass dao = new DAOClass();
        int option = Integer.parseInt(args[0]);
        switch(option) 
        {
        case 1:
            dao.insert(
                    Integer.parseInt(args[1]),
                    args[2],
                    args[3],
                    Integer.parseInt(args[4]));
            break;
        case 2:
            dao.delete(
                    Integer.parseInt(args[1]));
            break;
        case 3:
            dao.modify(
                    Integer.parseInt(args[1]),
                    Integer.parseInt(args[2]));
            break;
        case 4:
            if(args.length==1)
                dao.display();
            else
                dao.display(
                        Integer.parseInt(args[1]));
            break;
        default:
            System.out.println("Invalid Option");
        }
    }
}
