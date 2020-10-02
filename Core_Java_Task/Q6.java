import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Q6 {
	
	LocalDate today = LocalDate.now();
	
	public boolean checkEarlier(String d) {
		LocalDate input = LocalDate.parse(d);
		if(input.isBefore(today)) {
			return true;
		}else {
			return false;
		}
	}
	public boolean checkAfter(String d2) {
		LocalDate input2 = LocalDate.parse(d2);
		if(input2.isAfter(today)) {
			return true;
		}else {
			return false;
		}
	
	}
}
class Q6Main{
	public static void main(String[] args) {
		Scanner Sc =new Scanner(System.in);
		Q6 Obj1 = new Q6();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssZ");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		String today = LocalDate.now().format(format2);
		
		System.out.println("Enter the Date you want to check");
		String d = Sc.next();
		
		System.out.println(Obj1.checkEarlier(d));
		
		System.out.println("Enter the Date you want to check");
		String d2 = Sc.next();
		
		System.out.println(Obj1.checkAfter(d2));
		
		
		
	}
}
