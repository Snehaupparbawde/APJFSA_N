package java_programs;

public class EmployeeBean implements java.io.Serializable {

	// Private fields for employee details
	private int empId;
	private String empName;
	private int empAge;
	private double empSalary;

	// Constructor with no arguments
	public EmployeeBean() {
	}

	// Constructor with arguments
	public EmployeeBean(int empId, String empName, int empAge, double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}

	// Getters and setters for employee details
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public static void main(String[] args) {
		// Create EmployeeBean object
		EmployeeBean obj = new EmployeeBean();

		// Set employee ID
		int id1 = 101;
		obj.setEmpId(id1);

		// Set employee name
		obj.setEmpName("Sneha Upparbawde");

		// Set employee age
		obj.setEmpAge(20);

		// Set employee salary
		obj.setEmpSalary(50000.0);

		// Display employee details
		System.out.println("Employee ID: " + obj.getEmpId());
		System.out.println("Employee Name: " + obj.getEmpName());
		System.out.println("Employee Age: " + obj.getEmpAge());
		System.out.println("Employee Salary: " + obj.getEmpSalary());
	}
}         
             /* Output
                Employee ID: 101
                Employee Name: Sneha Upparbawde
                Employee Age: 20
                Employee Salary: 50000.0 */
