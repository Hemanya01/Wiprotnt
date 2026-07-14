package list;

public class EmployeeMain {
	public static void main(String[] args) {
        EmployeeDB db = new EmployeeDB();
        Employee e1 = new Employee(4790, "Hemanthi", "hemanthi@gmail.com", "Female", 85000);
        Employee e2 = new Employee(4767, "Gowri", "gowri@gmail.com", "Female", 60000);
        Employee e3 = new Employee(4704, "Hemanya", "hemanya@gmail.com", "Female", 100000);
        db.addEmployee(e1);
        db.addEmployee(e2);
        db.addEmployee(e3);
        System.out.println("Employee Details");
        db.displayAllEmployees();
        System.out.println(db.showPaySlip(4767));
        System.out.println("\nDeleting Employee 4790");
        if(db.deleteEmployee(4790))
            System.out.println("Employee Deleted Successfully");
        else
            System.out.println("Employee Not Found");
        System.out.println("\nRemaining Employees");
        db.displayAllEmployees();
    }
}
