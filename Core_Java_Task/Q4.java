
public class Q4 {
	String name;
	
	Q4(String name){
		this.name= name;
	}
}
class Q4Main{
	public static void main(String[] args) {
		Integer x = 13;
		
		
		Q4 Obj1 = new Q4("Rohan"); //Created One object with value Rohan
		Q4 Obj2 = new Q4("Rohan");//Created Another Object with the same value
		boolean result1= Obj1.equals(Obj2); //Checked if the values are EQUAL not same,
		System.out.println("result 1 "+result1); // Not equal 
		
		Q4 Obj3 = (Q4) Obj1;// But when Object 2 is typecasted
		boolean result2= Obj1.equals(Obj3);
		System.out.println("result 2 "+result2); //two objects are equal
		System.out.println();
		System.out.println("---------------------------");
		System.out.println();
		
		System.out.println("Hashcode of the Obj1 "+Obj1.hashCode());//
		System.out.println("Hashcode of the Obj2 "+Obj2.hashCode());
		System.out.println("Hashcode of the Obj3 "+Obj3.hashCode());
		System.out.println("Here we can notice that the hashcoed of Obj1 and Obj3 are same");
		
		System.out.println();
		System.out.println("---------------------------");
		System.out.println();
		
		System.out.println("String representation of Integer");
		String stringRep1 = x.toString();
		System.out.println(stringRep1);
		String stringRep2 = Integer.toString(14);
		System.out.println(stringRep2);
		
		
		System.out.println();
		System.out.println("---------------------------");
		System.out.println();
		
		// a great way of typecasting is by using parseInt method
		
		int intRep1 = Integer.parseInt("43");
		System.out.println(intRep1);
		
		
	}

}

