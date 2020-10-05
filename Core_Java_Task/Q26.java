import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Q26 {
	
	
	public void getSorted(int[] x) {
		Arrays.parallelSort(x);
		
	}
}
class Main{
	public static void main(String[] args) {
		Q26 q26 = new Q26();
		int [] A1 = {4,5,6,74,78,34,66,73,9,2};
		Arrays.parallelSort(A1);
		System.out.println("After Sorting");
		for(int i:A1) {
			System.out.print(i+" ");
		
		}
		System.out.println("");
		System.out.println("---------------------------");
		StringJoiner joiner = new StringJoiner(",");
		joiner.add("Rohan").add("Vineeth").add("Manasvi").add("Dhwani").add("Aakas");
		System.out.println(joiner);
		
		System.out.println("");
		System.out.println("---------------------------");
		
		
		StringJoiner joiner2 = new StringJoiner(" ","[","]");
		joiner2.add("India").add("is").add("a").add("beautifuli").add("country");
		System.out.println(joiner2);
		System.out.println("");
		System.out.println("---------------------------");
		
		ArrayList<String> Obj = new ArrayList<String>();
		Obj.add("Rohan");
		Obj.add("Purva");
		Obj.add("Neha");
		String Concat = Obj.stream().collect(Collectors.joining(","));
		System.out.println(Concat);
		
		
		System.out.println("");
		System.out.println("---------------------------");
		ArrayList<String> Operation2 = (ArrayList<String>) Obj.stream().collect(Collectors.toList());
		System.out.println(Operation2);
	}
}
