import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;



class Employee implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String empName;
	String empID;
	int empAge;
	int empWorkEx;
	String designation;
	Date startYear;
	int rating;
	Employee(String n, String i, int a, int ex, String designation, Date y, int r){
		this.empAge= a;
		this.empID =i;
		this.empName = n;
		this.empWorkEx = ex;
		this.designation = designation;
		this.startYear= y;
		this.rating = r;
	}
	
	
	
	public void empWriteFile(String fileName) throws IOException {
		FileOutputStream empWriteFile = new FileOutputStream(fileName);
		ObjectOutputStream Objout= new ObjectOutputStream(empWriteFile);
		
		Objout.writeObject(this);
		Objout.close();
		empWriteFile.close();
		System.out.println("File successully written");
		
	}
	
	public Employee empReadFile(String location) throws IOException, ClassNotFoundException {
		Employee e = null;
		FileInputStream empRead = new FileInputStream(location);
		ObjectInputStream ObjIn = new ObjectInputStream(empRead);
		e = (Employee) ObjIn.readObject();
		ObjIn.close();
		empRead.close();
		return e;
	}
	
	
	 public boolean createFile(String p) throws IOException {
		 File  newFile = new File(p);
		 if(newFile.createNewFile()) {
			 
			 System.out.println("The File is created and the canonical path is " + newFile.getCanonicalPath());
			 System.out.println("The File is created and the absolute path is "+newFile.getAbsolutePath());
			 return true;
		 }else {
			 return false;
		 }
	 }




	
	

	
}
class SortByRating implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.rating>o2.rating) {
			return 1;
		}else {
			return -1;
		}
		
	}
	
}
class SortByYear implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.startYear.after(o2.startYear)) {
			return 1;
		}else {
			return -1;
		}
	}
	
}





class Manager extends Employee{
	
	Manager(String n, String i, int a, int ex, String designation, Date y, int r){
		super(n,i,a,ex,designation,y,r);
	}
	public void deleteFile(Path p) throws IOException {
		
		if(Files.deleteIfExists(p)) {
			System.out.println("The file is succesfully deleted");
		}else {
			System.out.println("Failed to delete the file");
		}
		
	}
	
	
}


public class Q14 {
	public static void main(String[] args) throws IOException, ClassNotFoundException, ParseException {
		DateFormat df = new SimpleDateFormat("yyyy");
		
		
		Employee Rohan = new Employee("Rohan","001",26,2,"Developer",df.parse("2015"),2);
		Employee Neha = new Employee("Neha","002",25,1,"Developer",df.parse("2016"),5);
		Manager Purva = new Manager("Meena","005",28,4,"Manager",df.parse("2012"),4);
		Employee Prasad = new Employee("Prasad","003",25,3,"BA",df.parse("2013"),3);
		
		
		ArrayList<Employee> empArray = new ArrayList<>();
		empArray.add(Rohan);
		empArray.add(Neha);
		empArray.add(Purva);
		empArray.add(Prasad);
		
		
		System.out.println("Sorted by year");
		Collections.sort(empArray, new SortByYear());
		for(Employee e:empArray) {
			System.out.println(e.empID+"\n"+e.empName+"\n"+e.empAge+"\n"+e.empWorkEx+"\n"+e.startYear+"\n"+e.rating);
		}
		
		System.out.println("==================================");
		
		System.out.println("Sorted by Rating");
		Collections.sort(empArray, new SortByRating());
		for(Employee e:empArray) {
			System.out.println(e.empID+"\n"+e.rating);
		}
		
		
		
		Rohan.empWriteFile("rohan.txt");
		System.out.println(Neha.empReadFile("rohan.txt").startYear);
		Path p = Path.of("Rohan.txt");
		//Purva.deleteFile(p);
		
	}
}