import java.util.ArrayList;
public class Q1 {
	public static void main(String[] args) {
        // One to many association: Company can have many employees. But an employee cannot be part of many companies.
        Company amz = new Company();
        Employee emp1 = new Employee("Rohan", 5, 2020);
        Employee emp2 = new Employee("Neha", 4, 2019);
        Employee emp3 = new Employee("Purva", 5, 2020);

        amz.addEmployee(emp1);
        amz.addEmployee(emp2);
        amz.addEmployee(emp3);

        System.out.println(amz.getEmployee());
}


}	
	class Company {
    private static String companyName;
    private static String description;
    private static int noOfEmployees;
    private static ArrayList<Employee> employeesList;

    static {
        companyName = "Amazon.com";
        description = "E=commerce";
        noOfEmployees = 100;
        employeesList = new ArrayList<>();
    }

    public Company(){
        //
    }

    

    public void addEmployee(Employee employee){
        employeesList.add(employee);
    }

    public ArrayList<Employee> getEmployee(){
        return employeesList;
    }

    public String toString(){
        return companyName;
    }

}
	 class Employee {
	    String name;
	    int rating;
	    int startYear;

	    {
	        rating = 0;
	        startYear = 2020;
	    }

	    public Employee(String name, int rating, int startYear){
	        this.name = name;
	        this.rating = rating;
	        this.startYear = startYear;
	    }

	    public String toString(){
	        return name + " " + rating + " " + startYear;
	    }
	 }
