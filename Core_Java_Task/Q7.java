import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Q7 {
	int [] intarray = {1,2,3,4,4,5,6,7,8};
	HashMap<Integer, String> Duplicates = new HashMap<>();
	
	
	
	public HashMap<Integer, String> getDups() {
		int j=2;
		for(Integer i: intarray) {
			
			if(Duplicates.containsKey(i)) {
				Duplicates.put(i,"Duplicate");
			}
			else {
				Duplicates.put(i,"Unique");
			}
		}
		return Duplicates;
	}
	
	
}
class Q7Main{
	public static void main(String[] args) {
		
		Q7 q7 = new Q7();
		HashMap<Integer, String> Dups = q7.getDups();
		System.out.println(Dups);
		
		
		
		
	}
}
