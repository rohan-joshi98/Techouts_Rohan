import java.util.Scanner;

public class DoWhile {
	int k;
	DoWhile(int k){
		this.k=k;
	}
	DoWhile(){
		
	}
	public void leastOne() {
		int num=32;
		do {
			System.out.println(num);
			num--;
			k--;
			
		}while(k>0);
	}

}
class DowhileMain{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Iteration you eant to perform");
		int k = sc.nextInt();
		sc.close();
		
		DoWhile D= new DoWhile(k);
		D.leastOne();
	}
}
