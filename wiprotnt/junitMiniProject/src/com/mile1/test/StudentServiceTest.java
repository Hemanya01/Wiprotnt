package com.mile1.test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import com.mile1.bean.Student;
import com.mile1.service.StudentService;
public class StudentServiceTest 
{
    StudentService service;
    Student[] students;
    public void setUp() 
    {
        service = new StudentService();
        students = new Student[5];
        students[0] = new Student("Hemanya", new int[] {91, 89, 90});
        students[1] = new Student(null, new int[] {77, 80, 87});
        students[2] = null;
        students[3] = new Student("Hemanthi", null);
        students[4] = new Student("Gowri", new int[] {56, 72, 81});
    }
    public void testFindNumberOfNullName() 
    {
        assertEquals(1, service.findNumberOfNullName(students));
    }
   
    public void testFindNumberOfNullObjects() 
    {
        assertEquals(1, service.findNumberOfNullObjects(students));
    }
   
    public void testFindNumberOfNullMarksArray() 
    {
        assertEquals(1, service.findNumberOfNullMarksArray(students));
    }
}