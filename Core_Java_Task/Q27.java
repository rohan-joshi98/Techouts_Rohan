
public class Q27 {
	double[] a= new double [5];
	public void addToArray(int k) {
		for(int i=0;i<k;i++ ) {
		 a[i]=20/i;
	 }
	 
	}
	public void printArray() {
		for(Double d:a) {
			System.out.println(d);
		}
	}
 
}
class Q27main extends Q27{
	public static void main(String[] args) {
		Q27 q27 = new Q27();
		try {
			q27.addToArray(7);
			q27.printArray();
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("The process ends here");
		}
		
	}
}