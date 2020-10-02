import java.util.ArrayList;
import java.util.function.Consumer;

public class Q24 {
	
	Consumer<ArrayList<Integer>> modify = (n) -> {
        for(int num: n) {
            if (!(num > 3 && num < 7)) {
                System.out.println(num);
            }
        }
    };
   
	
}
class Q24Main{
	public static void main(String[] args) {
		Q24 Obj = new Q24();
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for(int i=1;i<11;i++) {
			newList.add(i);
		}
		
		Obj.modify.accept(newList);
		
		
	}
}

