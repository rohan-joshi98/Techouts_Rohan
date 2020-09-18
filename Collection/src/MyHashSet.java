import java.util.*;
public class MyHashSet {
	public static void main(String[] args) {
		HashSet<String> Hs= new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5;i++) {
			System.out.println("Please Enter the text");
			Hs.add(sc.nextLine());
			
		}
		sc.close();
		System.out.println("Elements are not order as they are inserted");
		System.out.println(Hs);
		System.out.println(Hs.clone());//returns a shallow copy of the hashset
		
		System.out.println(Hs.contains("Rohan"));//Returns true is the specified object is present in the Hashset
		System.out.println(Hs.isEmpty());//Returns true if the hashset is empty
		System.out.println(Hs.size());//Returns the size of the hashset
		System.out.println(Hs.remove("rh"));//Removes the specified object from the hashset
		System.out.println(Hs);
	}
}