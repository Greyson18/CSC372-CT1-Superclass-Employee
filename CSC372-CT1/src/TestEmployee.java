
public class TestEmployee {

	public static void main(String[] args) {
		ManagerInfo manager = new ManagerInfo(); //Creates a manager object 
		//Sets all of the attributes for the earlier setter methods
		manager.setFirstName("Peter");
		manager.setLastName("Parker");
		manager.setEmployeeID(5249754);
		manager.setDepartment("Research and Development");
		manager.employeeSummary(); //Method to print all attributes
	}
}
