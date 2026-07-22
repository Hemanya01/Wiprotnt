package com.mile1.test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
public class StudentTest 
{
    StudentReport report;
    @Before
    public void setUp() 
    {
        report = new StudentReport();
    }
    @Test
    public void testGradeA() 
    {
        Student s = new Student("Hemanya", new int[] {91, 89, 90});
        assertEquals("A", report.findGrades(s));
    }
    @Test
    public void testGradeD() 
    {
        Student s = new Student("Hemanthi", new int[] {50, 45, 40});
        assertEquals("C", report.findGrades(s));
    }
    @Test
    public void testGradeF() 
    {
        Student s = new Student("Gowri", new int[] {10, 60, 70});
        assertEquals("F", report.findGrades(s));
    }
    @Test(expected = NullStudentObjectException.class)
    public void testNullStudentObject()
            throws NullStudentObjectException,
                   NullNameException,
                   NullMarksArrayException {

        report.validate(null);
    }
    @Test(expected = NullNameException.class)
    public void testNullName()
            throws NullStudentObjectException,
                   NullNameException,
                   NullMarksArrayException {

        Student s = new Student(null, new int[] {50, 60, 70});
        report.validate(s);
    }
    @Test(expected = NullMarksArrayException.class)
    public void testNullMarks()
            throws NullStudentObjectException,
                   NullNameException,
                   NullMarksArrayException {
        Student s = new Student("John", null);
        report.validate(s);
    }
}