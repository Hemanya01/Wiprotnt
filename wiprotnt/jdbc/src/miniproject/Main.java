package miniproject;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        UserDAO dao = new UserDAO();

        
        System.out.println("===== SCENARIO 1 =====");
        System.out.println("User Type : " + dao.getUserType("AB1001"));

   
        System.out.println("\n===== SCENARIO 2 =====");
        System.out.println(dao.getIncorrectAttempts("AB1001"));

        
        System.out.println("\n===== SCENARIO 3 =====");
        System.out.println(dao.changeUserType("TA1002"));

     
        System.out.println("\n===== SCENARIO 4 =====");
        System.out.println("Lock Status Count : " + dao.getLockStatus());

        
        System.out.println("\n===== SCENARIO 5 =====");
        System.out.println(dao.changeName("AB1001", "Ramesh"));

        
        System.out.println("\n===== SCENARIO 6 =====");
        System.out.println(dao.changePassword("12345"));

      
        System.out.println("\n===== SCENARIO 7 =====");

        UserBean bean1 = new UserBean();
        bean1.setUserID("MK1004");
        bean1.setPassword("MK1004");
        bean1.setName("Mahesh");
        bean1.setIncorrectAttempts(0);
        bean1.setLockStatus(0);
        bean1.setUserType("Employee");

        System.out.println(dao.addUser_1(bean1));

   
        System.out.println("\n===== SCENARIO 8 =====");

        UserBean bean2 = new UserBean();
        bean2.setUserID("AR1005");
        bean2.setPassword("AR1005");
        bean2.setName("Arun");
        bean2.setIncorrectAttempts(0);
        bean2.setLockStatus(0);
        bean2.setUserType("Employee");

        System.out.println(dao.addUser_2(bean2));

      
        System.out.println("\n===== SCENARIO 9 =====");

        ArrayList<UserBean> employees = dao.getUsers("Employee");

        for(UserBean b : employees)
        {
            System.out.println(
                    b.getUserID() + " " +
                    b.getPassword() + " " +
                    b.getName() + " " +
                    b.getIncorrectAttempts() + " " +
                    b.getLockStatus() + " " +
                    b.getUserType());
        }

      
        System.out.println("\n===== SCENARIO 10 =====");

        ArrayList<UserBean> all = dao.storeAllRecords();

        for(UserBean b : all)
        {
            System.out.println(
                    b.getUserID() + " " +
                    b.getPassword() + " " +
                    b.getName() + " " +
                    b.getIncorrectAttempts() + " " +
                    b.getLockStatus() + " " +
                    b.getUserType());
        }

    
        System.out.println("\n===== SCENARIO 11 =====");

        String[] names = dao.getNames();

        for(String s : names)
        {
            System.out.println(s);
        }
    }
}