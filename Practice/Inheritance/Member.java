//Hierarchical Inheritance

/*Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. 
The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. 
Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.*/
public class Member {
	
		String name;
		int age;
		String phoneNumber;
		String address;
		int salary;
		
		public void printSalary() {
			System.out.println("The salary of "+name+" is "+salary);
		}

}
class Employee extends Member{
	
	String specialization;
	
	
	
}
class Manager extends Member{
	String department;
	
}
class HumanResources{
	public static void main(String [] args) {
		Employee John = new Employee();
		John.name="John Doe";
		John.age= 28;
		John.phoneNumber="1232344567";
		John.address="2, tremont street, boston";
		John.salary=7000;
		John.specialization="Java";
		
		John.printSalary();
		
		Manager Rachel = new Manager();
		Rachel.name="Rachel Gale";
		Rachel.age=28;
		Rachel.phoneNumber="2344567123";
		Rachel.address="1176 Boylston Street, Boston MA";
		Rachel.salary=9000;
		Rachel.department="Integration";
		
		Rachel.printSalary();
	}
}
