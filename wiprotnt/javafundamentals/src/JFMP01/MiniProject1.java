package JFMP01;

public class MiniProject1 {
	public static void main(String[] args) 
	{
		int[] empno={1001, 1002, 1003, 1004, 1005, 1006, 1007};
        String[] empnames={"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
        String[] joindates={"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013",
                          "16/07/2005", "01/01/2000", "12/06/2006"};
        char[] dsgcodes={'e', 'c', 'k', 'r', 'm', 'e', 'c'};
        String[] depts={"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
        int[] basic={20000, 30000, 10000, 12000, 50000, 23000, 29000};
        int[] hra={8000, 12000, 8000, 6000, 20000, 9000, 12000};
        int[] it={3000, 9000, 1000, 2000, 20000, 4400, 10000};
        if (args.length<1) 
        {
            System.out.println("Employee ID is required.");
            return;
        }
        int empId=Integer.parseInt(args[0]);
        int pos = -1;
        for (int i=0;i<empno.length; i++) 
        {
            if (empno[i]==empId) 
            {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("No employee found with empid : " + empId);
            return;
        }
        String role;
        int da;
        switch (dsgcodes[pos]) 
        {
        case 'e': 
        	role = "Engineer";     
        	da = 20000; 
        	break;
        case 'c': 
        	role = "Consultant";   
        	da = 32000; 
        	break;
        case 'k': 
        	role = "Clerk";        
        	da = 12000; 
        	break;
        case 'r': 
        	role = "Receptionist"; 
        	da = 15000; 
        	break;
        case 'm': 
        	role = "Manager";      
        	da = 40000; 
        	break;
        default:  
        	role = "Unknown";      
        	da = 0;
        }
        int salary = basic[pos] + hra[pos] + da - it[pos];
        System.out.printf("%-7s %-10s %-16s %-15s %-8s\n","Emp No" ,"Emp Name","Department","Designation","Salary");
        System.out.printf("%-7d %-10s %-16s %-15s %-8d\n", empno[pos], empnames[pos], depts[pos], role, salary);
	}
}
