import java.util.Scanner;

class AssertionError extends Exception{
	AssertionError(String s){
		super(s);
	}
}


class Operations{
	
	


	
	public double calculate() throws AssertionError {
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("WHat would you like to caluclate today");
		System.out.println("");
		int a = Sc.nextInt();
		String o = Sc.next();
		int b = Sc.nextInt();
		
		
		switch(o) {
		case "+": 
			final double plus= (double) a+b;
			return plus;
		case "-":
			final double minus = a-b;
			return minus;
		case"*": 
			final double multiply = a*b;
			return multiply;
		case"/":
			final double divide = a/b;
			return divide;
		default: throw new AssertionError("Not a valid input");
		}
		
		
		
	}
	
	
}


public class Q21 extends Operations{
	public static void main(String[] args) throws AssertionError {
		Operations O = new Operations();
		System.out.println(O.calculate());
		
		
		
	}

}
