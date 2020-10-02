import java.util.Scanner;

public class InvalidUserName extends Exception{
	InvalidUserName(String s){
		super(s);
	}
}
class TestException{
	public void validateUserName(String s) throws InvalidUserName{
		if(s.length()<10 || s.contains("&")) {
			throw new InvalidUserName("Not a valid username");
		}
		else {
			System.out.println("Welcom "+ s);
		}
	}
}
class newtest{
	public static void main(String[] args) throws InvalidUserName {
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter your username");
		String s = Sc.next();
		Sc.close();
		TestException newClass = new TestException();
		newClass.validateUserName(s);
	}
}
