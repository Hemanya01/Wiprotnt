package streamAPI;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentMain {
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        System.out.println("Enter details of 5 Students");
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("\nStudent " + i);
            System.out.print("Roll Number: ");
            int rollNo = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Marks: ");
            int marks = sc.nextInt();
            students.add(new Student(rollNo, name, marks));
        }
        long count = students.stream()
                             .filter(student -> student.marks >= 50)
                             .count();
        System.out.println("\nNumber of students who cleared the test = " + count);
        sc.close();
    }
}
