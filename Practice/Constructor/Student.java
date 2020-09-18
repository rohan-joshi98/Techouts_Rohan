//Write a program to print the names of students by creating a Student class. If no name is passed while creating an object of Student class, 
//then the name should be "Unknown", otherwise the name should be equal to the String value passed while creating object of Student class.
public class Student {
	String name;
	Student(){
		this.name="Unknown";
	}
	Student(String s){
		this.name = s; 
	}
}
class StudentMain{
	public static void main(String[] args) {
		Student S1 = new Student();
		Student S2 = new Student ("Rohan");
		
		System.out.println(S1.name);
		System.out.println(S2.name);
		
	}
}
