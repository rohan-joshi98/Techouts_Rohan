import java.util.*;
public class MyLinkedList {
	public static void main(String [] args) {
		LinkedList<String> Ll = new LinkedList<String>();
		Ll.add("John");
		Ll.add("Jack");
		Ll.add("Rachel");
		Ll.add("Monica");
		
		System.out.println(Ll);
		Ll.add("Joyee");//adds an element to the list
		System.out.println(Ll);
		Ll.addFirst("Amanda");//adds an element to the first
		System.out.println(Ll);
		Ll.addLast("Rohan");//adds an element to the last
		System.out.println(Ll);
		Ll.removeFirst();//removes the first element 
		System.out.println(Ll);
		Ll.removeLast();//removes element from the last
		System.out.println(Ll);
		System.out.println(Ll.getFirst());
		System.out.println(Ll.getLast());
		
	}
}
