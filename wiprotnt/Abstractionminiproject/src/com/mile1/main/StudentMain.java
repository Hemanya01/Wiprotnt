package com.mile1.main;
import com.mile1.bean.Student;
import com.mile1.service.*;
import com.mile1.exception.*;
public class StudentMain {
	static Student data[] = new Student[4];
    public StudentMain() 
    {
        for (int i = 0; i < data.length; i++) 
        {
            data[i] = new Student();
        }
        data[0] = new Student("Hemanya", new int[] {85,75,95});
        data[1] = new Student(null, new int[] {11,22,33});
        data[2] = null;
        data[3] = new Student("Hemanthi", null);
    }
    public static void main(String[] args) 
    {
        StudentMain obj = new StudentMain();
        StudentReport report = new StudentReport();
        for (int i = 0; i < data.length; i++) 
        {
            try 
            {
                String result = report.validate(data[i]);
                if (result.equals("VALID")) 
                {
                    System.out.println(data[i].getName() + " Grade : "
                            + report.findGrades(data[i]));
                }
            }
            catch (Exception e) 
            {
                System.out.println(e);
            }
        }
        StudentService service = new StudentService();
        System.out.println("Null Marks Array : "
                + service.findNumberOfNullMarksArray(data));
        System.out.println("Null Name : "
                + service.findNumberOfNullName(data));
        System.out.println("Null Objects : "
                + service.findNumberOfNullObjects(data));
    }
}
