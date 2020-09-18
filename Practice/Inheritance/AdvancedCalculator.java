
//Multilevel Inheritance

import java.util.Scanner;

public class AdvancedCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a number");
		float a = sc.nextInt();
		System.out.println("please enter next number");
		float b = sc.nextInt();
		basicCalculator1 B1 = new basicCalculator1();
		basicCalculator2 B2 = new basicCalculator2();
		basicCalculator3 B3 = new basicCalculator3();
		
		//methods from their respective classes
		System.out.println("methods from their respective classes");
		
		
		System.out.println("result of addition "+B1.add(a, b));
		System.out.println("Result of Subtraction "+B1.sub(a, b));
		System.out.println("Result of Multiplication "+B2.mul(a, b));
		System.out.println("Result of Division "+B2.div(a, b));
		System.out.println("Result of Percentage "+B3.percent(a, b));
		
		
		System.out.println("-----------------------------");
		
		
		
		
		//all methods accessed from the basicCalculator3 class
		System.out.println("all methods accessed from the basicCalculator3 class");
		System.out.println("result of addition "+B3.add(a, b));
		System.out.println("Result of subtraction "+B3.sub(a, b));
		System.out.println("Result of Multiplication "+B3.mul(a, b));
		System.out.println("Result of Division "+B3.mul(a, b));
		System.out.println("Result of Percent "+B3.percent(a, b));
		
		
	}
}
class basicCalculator1{
	public float add(float a, float b) {
		return a+b;
	}
	public float sub(float a, float b) {
		return a-b;
	}
	
}
class basicCalculator2 extends basicCalculator1{
	
	public float mul(float a, float b) {
		return a * b;
	}
	public float div(float a, float b) {
		return a/b;
	}
}
class basicCalculator3 extends basicCalculator2{
	public float percent(float a, float total) {
		return (mul(div(a,100),total));
	}
}