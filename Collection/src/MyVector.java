import java.util.*;
public class MyVector {
	public static void main(String[] args) {
		Vector<Integer> V= new Vector<Integer>();
		Vector<Integer> V1= new Vector<>();
		Scanner Sc= new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter a number");
			V.add(Sc.nextInt());
		}
		Sc.close();
		Iterator<Integer> i = V.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		try {
			System.out.println(V);
			
			//V1.addAll(1,V);
			System.out.println(V1);
			System.out.println(V1.capacity());
			V1.addAll(V);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
		finally {
			System.out.println(V1);
		}
	}
}
