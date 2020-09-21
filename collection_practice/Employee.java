package collection_practice;
import java.util.*;
public class Employee {
	HashMap<String, String> E = new HashMap<>();
	
	
}
final class Admin extends Employee{
	Employee Emp = new Employee();
	Scanner sc = new Scanner(System.in);
	
	
	public void add() {
		
			int n=1;
			while(n>0) {
				int k = E.size()+1;
				String key = "EMP"+k;
				System.out.println("Enter the Employee Name");
				String value = sc.next();
				if(value.equals("end")) {
					break;
				}
				E.put(key, value);	
				System.out.println("added");		
			}
		
		System.out.println(E);	
	}
	
	
	public void getAllNames() {
		for(String i:E.values()) {
			System.out.println(i);
		}
	}
	
	public void remove() {
		String key = sc.next();
		E.remove(key);
	
	}
	public void clear() {
		E.clear();
	}
	
	
	

	
	
}
class Office{
	public static void main(String[] args) {
		
		Admin Ad = new Admin();
		Ad.add();
		Ad.getAllNames();
	}
}
