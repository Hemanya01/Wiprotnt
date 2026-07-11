package wrapperclasses;

public class Test4 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1 = new Employee(101, "Hemanya", 90000);
        Employee e2 = (Employee) e1.clone();
        e1.empId = 102;
        e1.name = "Gowri";
        e1.salary = 60000;
        System.out.println("Original Employee");
        e1.display();
        System.out.println("Cloned Employee");
        e2.display();
	}
}
