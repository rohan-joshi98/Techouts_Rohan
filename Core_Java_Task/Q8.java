import java.util.TreeSet;

public class Q8 {
	String s;
	int i;
	double d;
	float f;
	Q8(String s){
		this.s= s;
	}
	Q8(float f){
		this.f = f;
	}
	Q8(int i){
		this.i = i;
		
	}
	Q8(double d){
		this.d=d;
	}
}
class Q8Main{
	public static void main(String[] args) {
		TreeSet<Q8> tSet = new TreeSet<>();
		try {
			tSet.add(new Q8("Rohan"));
			tSet.add(new Q8(45));
			tSet.add(new Q8(56.98));
			tSet.add(new Q8(4.6));
			tSet.add(new Q8("joshi".toUpperCase()));
			tSet.add(new Q8("SUNIL".toLowerCase()));
			
		} catch(Exception e) {
		System.out.println("Can not add elements of varied datatypes as they are not compareable");
		}

		
	}
	
	
	
}
