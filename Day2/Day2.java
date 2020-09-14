import java.util.Scanner;

public class Day2 {
	
	public static void patternOne(int r, int c) {
		for(int i=0;i<r;i++) {
			for(int j=0; j<c;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void patternTwo(int c) {
		int r = c+(c-1);
		System.out.println("Number of Columns= "+c);
		System.out.println("Number of rows= "+r);
		System.out.println();
		for(int i=0;i<=r;i++) {
			if (i<c) {
				for(int j=1;j<=c-i;j++) {
					System.out.print("*");
				}
				for(int j=i; j<=c;j++) {
					System.out.print(" ");
				}
				System.out.println();
			}else {
				for(int j=0;j<=i-c;j++) {
					System.out.print("*");
				}
				for(int j=i; j<=c;j++) {
					System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
	
	
	public static void grade(int m) {
		if(m>50) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
	}
	
	
	public static int findPower() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the base number");
		int base = sc.nextInt();
		System.out.println("Enter the power");
		int power = sc.nextInt();
		int result = 1;
		for(int i=0; i<power;i++) {
			result = base *result;
		}
		System.out.println("The answer is "+ result);
		sc.close();
		return result;
	}
	
	public static void reverese() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to revese");
		int n = sc.nextInt();
		int reverse = 0;
		sc.close();
		while(n!=0) {
			reverse = reverse * 10;
			reverse = reverse + n%10;
			n = n/10; 
			
		}
		System.out.print(reverse);
		
	}
	
	
	
	public static void main(String[] args) {
//		Day2.patternOne(7, 15);
//		Day2.patternTwo(5);
//		Day2.grade(50);
//		Day2.findPower();
		Day2.reverese();
		
		
		
	}

}



