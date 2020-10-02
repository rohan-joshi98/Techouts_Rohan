import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Q9Q20 {
	
	public static void main(String[] args) {
		int i=0;
		ArrayList<Integer> I = new ArrayList<>();
		I.add(2);
		I.add(4);
		I.add(6);
		I.add(7);
		I.add(8);
		I.add(9);
		
		ArrayList<Integer> J = new ArrayList<>();
		J.add(2);
		J.add(4);
		J.add(6);
		J.add(7);
		J.add(8);
		J.add(9);
		
		
		Iterator IT = I.iterator();
		Iterator JI = J.iterator();
		
		try {
			while(IT.hasNext()) {
				System.out.println(IT.next());

			}
			
			if(JI.next()==I.get(2)) {
				System.out.println("Match Found");
				
			}else {
				System.out.println("No match found");
			}
			
			
			
			
			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
		
		
		
		
	}
	
	
	
}
