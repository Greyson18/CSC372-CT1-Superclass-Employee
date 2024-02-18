public class EmployeeInfo {
	private String firstName;
	private String lastName;
	private int employeeID;
	 private double salary;
	
	public EmployeeInfo() {
	}
	
	//getter and setter methods for the above variables
	public void setSalary (double salary) {
		this.salary = 0; //constructor setting salary equal to 0
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	public int getEmployeeID() {
		return this.employeeID;
	}
	
	//This is to print all the attributes
	public void employeeSummary() {
		System.out.println("Employee Name: " + this.firstName + " " + this.lastName);
		System.out.println("Employee's ID: " + this.employeeID);
		System.out.println("Employee's Salary:$" + this.salary);
	}
}
