//Extends the EmployeeInfo class
public class ManagerInfo extends EmployeeInfo {
	private String department; //adds a field specifically for this class
	
	//getter and setter methods
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	//This will override the employeeSummary method to print all attributes for superclass and subclass
	@Override
	public void employeeSummary() {
		super.employeeSummary();
		System.out.println("Department: " + this.department);
	}
}


	
