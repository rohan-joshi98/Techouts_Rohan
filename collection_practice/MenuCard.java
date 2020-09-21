package collection_practice;
import java.util.*;
public class MenuCard {
	double [] prices={14.99, 18.99,15,9.99,10.99};
	LinkedHashSet<String> items = new LinkedHashSet<>();
	LinkedHashSet<String> orderKey = new LinkedHashSet<>();
	LinkedHashSet<String> codes = new LinkedHashSet<>();
	HashMap<Object, Object> Mmc = new HashMap<>();
	HashMap<Object,Double> Vmc = new HashMap<>();
	
	
}
class Init extends MenuCard{
	
	
	
	public void add() {
		Init i = new Init();
		i.addToList();
		i.addKey();
	}
	private void addToList() {
		items.add("Chicken Tikka Masala");
		items.add("Chicken Biryani");
		items.add("Veg Biryani");
		items.add("Idli Sambar");
		items.add("Chicken clear soup");	
		System.out.println("Menucard Initialized");
	}
	
	private void addKey() {
		codes.add("CHTM");
		codes.add("CHBIR");
		codes.add("VGBIR");
		codes.add("IDSAM");
		codes.add("CHCLSP");	
		System.out.println(codes);
	}	
	
	public void showManager() {
		
		Object[] temp1 = codes.toArray(); 
		System.out.println(codes);
		Object[] temp2 = items.toArray();
		for(int i =0;i<temp1.length;i++) {
			Object key = temp1[i];
			System.out.println("key" + key);
			Object value = temp2[i];
			Mmc.put(key, value);
			System.out.println("Added");
		}
		
		for (Object i : Mmc.keySet()) {
			  System.out.println( i + " value: " + Mmc.get(i));
			}
		
	}
	
	
}


class Manager extends Init{
	
	public void initMenuCard() {
		Init i = new Init();
		i.add();
	}
	
	

	
	
}

class Guest extends Init{
public void showVisitor() {
		
		Object[] temp = items.toArray(); 
		for(int i =0;i<prices.length;i++) {
			Object key = temp[i];
			double value = prices[i];
			Vmc.put(key, value);
		}
		
		for (Object i : Vmc.keySet()) {
			  System.out.println( i + " value: " + Vmc.get(i));
			}
		
	}
	
}




class Restaurent {
	public static void main(String[] args) {
		
		
		try {
			Manager mg = new Manager();
			mg.initMenuCard();
			mg.showManager();
			
//			Guest g = new Guest();
//			g.showVisitor();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
			
	}
}