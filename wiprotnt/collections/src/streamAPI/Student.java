package streamAPI;

public class Student {
	int rollNo;
    String name;
    int marks;
    public Student(int rollNo, String name, int marks) 
    {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    public String toString() 
    {
        return "Roll No : " + rollNo +
               "\nName : " + name +
               "\nMarks : " + marks + "\n";
    }
}
