import java.util.*;
public class MyArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
		for(int i=0;i<11;i++) {
			alist.add(i); // add element 
		}
		System.out.println(alist);
		
		alist.add(3,55);//add element at a specific index
		
		
		try {
			
			System.out.println(alist);//view list
			System.out.println(alist.get(10));// get element at 10th index
			System.out.println(alist.contains(55));//returns true if value is present in the list
			System.out.println(alist.isEmpty());//returns if the list is empty
			System.out.println(alist.indexOf(55));//returns the index of an object
			System.out.println(alist.remove(3));//Removes first occurrence of of the given element
			System.out.println(alist.size());//Returns the size of the list
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(a.getMessage());
			System.out.println("Try Again");
			
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("Try Again");
			
		}

		
		
	}
}
