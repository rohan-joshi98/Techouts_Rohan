
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;


public class Q23 {
	

	IntStream a = IntStream.of(1,2,3,4,5,6,7,8,9);
	IntStream b = IntStream.of(1,2,3,4,5,6,7,8,9);
	IntStream c = IntStream.of(1,2,3,4,5,6,7,8,9);
	IntStream d = IntStream.of(1,2,3,4,5,6,7,8,9);
	IntStream e = IntStream.of(1,2,3,4,5,6,7,8,9);
	
	public void average() {
		
		OptionalDouble Obj= a.average();
		if(Obj.isPresent()) {
			System.out.println("The Average of the stream is "+ Obj.getAsDouble());
		}
		a.close();
	}
	
	public void add() {
		
		int Obj2 = b.sum();
		System.out.println("The Sum pf the stream is "+Obj2);
		b.close();
	}
	
	public void min() {
		
		OptionalInt Obj3 = c.min();
		System.out.println("The minimum element in the stream is "+Obj3.getAsInt());
		c.close();
	}
	
	public void max() {
		
		OptionalInt Obj4 = d.max();
		System.out.println("The maximum elemnt in the stream is "+Obj4.getAsInt());
		d.close();
	}
	public void count() {
		
		long Obj5 = e.count();
		System.out.println("There are total "+Obj5+" elemtns in the strem");
		e.close();
	}
	
	
}
class Q23Main{
	
	public static void main(String[] args) {
		Q23 q23 = new Q23();
		q23.add();
		q23.average();
		q23.min();
		q23.max();
		q23.count();
		
	}
	
}
