
public class Array {
	int [] a = new int[7];
	
	public void loadA() {
		
		for(int i=0;i<7;i++) {//For Loop
			a[i]=i;
		}
	}
	public void unloadA() {
		for(int j:a) {//For each Loop
			System.out.print(a[j]);
		}
	}
}
class Main{
	public static void main(String[] args) {
		Array A = new Array();
		A.loadA();
		A.unloadA();
	}
}