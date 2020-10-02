
public class Earth {
	 static Earth earth = new Earth();
	 public String x;
	 private Earth() {
		 
		 x = "The Earth is Oval";
		 
	 }
	 public static Earth getSingleInstance() {
		 return earth;
	 }
}
class Human{
	public static void main(String[] args) {
		//Earth Obj = new Earth(); // this statement will not work as I have made the constructor private 
		Earth Obj = Earth.getSingleInstance();
		Earth Obj2 = Earth.getSingleInstance();
		Earth Obj3 = Earth.getSingleInstance();
		
		
		System.out.println("To check if all the objects are referencing to the same instance of the object,");
		
		System.out.println();
		System.out.println("---------------------------");
		System.out.println();
		Obj.x= "The Earth is Spherical";
		System.out.println("Object 1 says"+ Obj.x);
		System.out.println("Object 2 says"+ Obj2.x);
		System.out.println("Object 3 says"+ Obj3.x);
		System.out.println();
		System.out.println("---------------------------");
		System.out.println();
		Obj3.x= "The Earth is flat";
		System.out.println("Object 1 says"+ Obj.x);
		System.out.println("Object 2 says"+ Obj2.x);
		System.out.println("Object 3 says"+ Obj3.x);
	
	
	}
}
