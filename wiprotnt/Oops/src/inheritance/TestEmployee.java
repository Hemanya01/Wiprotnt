package inheritance;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee("Hemanya", 100000, 2024, "NI67890");
		System.out.println("Employee Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());
	}

}
