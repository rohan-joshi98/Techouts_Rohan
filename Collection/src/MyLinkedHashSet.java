import java.util.*;
public class MyLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<Integer> Lhs = new LinkedHashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter a number");
			Lhs.add(sc.nextInt());
			
		}
		sc.close();
		System.out.println(Lhs);
		System.out.println("Elements are entered in the order as thet are inserted");
		
		Lhs.remove(14);
		System.out.println(Lhs);
		System.out.println(Lhs.contains(17));
		System.out.println(Lhs.isEmpty());
		System.out.println(Lhs.size());
		
	}
}
