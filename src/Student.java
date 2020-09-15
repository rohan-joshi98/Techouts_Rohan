public class Student{
	public int studentId;
	public String studentName;
	public int totalMarks;
	public Student() {
		studentId= 000;
		studentName= "Not in the record";
		totalMarks = 20;
	}
	public Student(int id, String name, int age) {
		studentId = id;
		studentName =name;
		totalMarks= age;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public int getStudentID(int id) {
		this.studentId=id;
		return this.studentId;
	}
	
	
	
	
	public String getName() {
		return studentName;
	}
	public String getName(String name) {
		this.studentName = name;
		return this.studentName;
	}
	
	
	
	
	public int getMarks() {
		return totalMarks;
	}
	public int getMarks(int marks) {
		this.totalMarks=marks;
		return totalMarks;
	}
	
	
	
	
	public static void main(String [] args) {
		Student newStudent = new Student();//create a student object using no arg constructor
		System.out.println("Studdent ID is: "+ newStudent.getStudentId());
		System.out.println("Marks earned out of 100: "+ newStudent.getMarks());
		
		
		
		
		Student newStudent2 = new Student(100, "Rohan", 80); //  create a student object using constructor which takes three arguments
		System.out.println("StudentID is "+ newStudent.getStudentID(100) );
		System.out.println("Student name is: "+newStudent2.getName());
		
	}
	
}


