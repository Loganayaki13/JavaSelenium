package javaOops;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee(1, "Logu", "Anand", 30000);
		System.out.println("ID: " + emp.getID());
		System.out.println("First name :" + emp.getfirstName());
		System.out.println("Last name :" + emp.getlastName());
		System.out.println("Full name :" +emp.getName());
		System.out.println("Salary :" + emp.getSalary());
		emp.setSalary(30000);
		System.out.println("Annual Salary :" + emp.getAnnualSalary());
		System.out.println("Raised :" + emp.raiseSalary(30));
		System.out.println("All Value :" + emp.toString());

	}

	static int id;
	static String firstName;
	static String lastName;
	static int salary;

	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	// id
	public static int getID() {
		return id;
	}
	// firstName

	public static String getfirstName() {
		return firstName;
	}
	// lastName

	public static String getlastName() {
		return lastName;
	}
	// fullName

	public static String getName() {
		return firstName + lastName;
	}
	// salary

	public static float getSalary() {
		return salary;
	}
	// setSalary

	public static void setSalary(int sal) {
		salary = sal;
	}

	// annualSalary
	public static int getAnnualSalary() {
		return salary * 12;

	}

	// raisedSalary
	public static int raiseSalary(int rs) {
		return (((salary * 30)) / 100) + salary;

	}

	// string
	public String toString() {
		return "Employee[id = " + id +","+ " name = " + firstName + lastName +","+ " salary =" + salary + "]";

	}

}
