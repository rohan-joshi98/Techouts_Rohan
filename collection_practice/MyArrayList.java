package collection_practice;
import java.util.*;

public class MyArrayList {
	ArrayList<Integer> Al= new ArrayList<>();
	public void addToList(int a, int b, int c, int d) {//Add new elements to the ArrayList
		Al.add(a);
		Al.add(b);
		Al.add(c);
		Al.add(d);
			
	}
	public void change(int i, int c) {//Change an element at particular index with some other element
		Al.set(i,c);
		System.out.println(Al);
	}
	public int getItem(int i) {//get an element from particular index
		
		return Al.get(i);
	}
	public void remove(int i) {//remove an element at certain index
		Al.remove(i);
		System.out.println(Al);
	}

	
}
class Main{
	public static void main(String[] args) {
		MyArrayList Mal = new MyArrayList();
		Mal.addToList(20,30, 40, 50);
		Mal.getItem(1);
		Mal.change(1, 100);
		Mal.remove(3);
	}
}
