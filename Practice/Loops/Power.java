import java.util.Scanner;

public class Power{
	int m;
	int n;
	Power(int m, int n){
		this.m=m;
		this.n=n;
	}
	public void findPower() {
		int r=1;
		while(n!=0) {//while loop
			
			r=r*m;
			n--;
		}
		
		System.out.println("The solution is "+r);
	}

}
class PowerMain{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the number");
		int m = sc.nextInt();
		System.out.println("Please enter the Power");
		int n = sc.nextInt();
		sc.close();
		
		Power P = new Power(m,n);
		P.findPower();
	}
}
