package wrapperclasses;

public class Employee implements Cloneable {
	int empId;
    String name;
    double salary;
    Employee(int empId, String name, double salary) 
    {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
    public Object clone() throws CloneNotSupportedException 
    {
        return super.clone();
    }
    void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Salary      : " + salary);
        System.out.println();
    }
}
