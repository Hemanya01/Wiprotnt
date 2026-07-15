package streamAPI;

public class Employee {
	int empNo;
    String name;
    int age;
    String location;
    public Employee(int empNo, String name, int age, String location) 
    {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }
    public String toString() 
    {
        return "Employee No : " + empNo +
               "\nName : " + name +
               "\nAge : " + age +
               "\nLocation : " + location +
               "\n";
    }
}
