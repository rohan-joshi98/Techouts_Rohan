import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Q25 {
	
	
	
	Consumer<ArrayList<Integer>> doubleNumber = list->list.forEach(a-> System.out.print(a+a+" "));
	

  	
	Consumer<ArrayList<Integer>> dispList = 
			list -> list.stream().forEach(a -> System.out.print(a + " ")); 


			
			
			
}
class Q25Main{
	public static void main(String[] args) {
		Q25 Obj = new Q25();
		ArrayList<Integer> intList = new ArrayList<>();
		for(int i=1;i<11;i++) {
			intList.add(i);
		}
		try {
			
			Obj.doubleNumber.accept(intList);
			
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
}