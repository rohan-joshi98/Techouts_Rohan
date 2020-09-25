import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar; 




public class Day10 {
	
	public void stringConvert(String s1) {
		Double result1 = Double.valueOf(s1);
		System.out.println("The result after converting String to Double "+result1);
	}
	public void integerToString(Integer i1) {
		String result2 = String.valueOf(i1);
		System.out.println("The result after converting Integer to String "+result2);
	}
	public void dateToString(Date d) {
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("mm-dd-yyyy");
		String result3 =  dateFormat.format(d);
		System.out.println("The result after converting Date to a String "+result3);
	}
	public void stringToDate(String s) throws ParseException {
		Date date = new SimpleDateFormat("MM dd, yyyy").parse(s);
		System.out.println(s+"\t"+date);
	}
}


class BoxingRing{
	ArrayList<Integer> Al = new ArrayList<Integer>();
	public void autoBoxingUnboxingIntegr() {//Autoboxing
		Scanner Sc = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			System.out.println("Enter Numbers");
			int a = Sc.nextInt();
			Integer A = Integer.valueOf(a);
			Al.add(A);
		}
		Sc.close();
	}
	public void printBoxed() {//Auto unboxing
		for(int i=0;i<10;i++) {
			int j = Al.get(i);
			System.out.println(j);
		}
	}
	
}

class CamelToSnake{
	public String camelToSnake(String s) {
		String result4 = "";
		char c = s.toLowerCase().charAt(0);
		result4 = result4+c;
		
		for(int i=1;i<s.length();i++) {
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch)) {
				result4= result4+"_";
				result4= result4 + Character.toLowerCase(ch);
			}else {
				result4=result4+ch;
			}
		}
		return result4;
	}
}

class StringAppend{
	public void appendString() {
		Scanner Sc = new Scanner(System.in);
		StringBuilder result5 =new StringBuilder("  ");
		
		System.out.println("Enter the String");
		
		
		boolean hasNext = true;
		
		while(hasNext) {
			String rec =Sc.nextLine();
			if(rec.equals("end")) {
				System.out.println("Output :"+ result5);
				hasNext = false;
			}else {
				result5.append(rec);
			}
		}
		Sc.close();

	}
}

class StringAtOdd{
	StringBuffer result = new StringBuffer();
	Scanner Sc = new Scanner(System.in);
	
	
	public void printAtOdd(){
		System.out.println("Enter the String Here");
		String k = Sc.nextLine();
		Sc.close();
		result.append(k);
		int length =k.length();
		System.out.println(result);
		for(int i=0;i<length+length;i++) {
			if(i%2!=0) {
				result.insert(i,"!");
			}
		}
		System.out.println(result);
	}
	
}

class StringAtEven{
	
	StringBuffer result = new StringBuffer();
	Scanner Sc = new Scanner(System.in);
	
	public void printAtEven(){
		System.out.println("Enter the String Here");
		String k = Sc.nextLine();
		System.out.println(k);
		Sc.close();
		System.out.println(k.length());
		int length =k.length();
		result.append(k);
		System.out.println(result);
		for(int i =0;i<length+length;i++) {
			if(i%2==0) {
				result.insert(i,"!");
			}
		}
		System.out.println(result);
	}

}

class ChangeOrder{
	
	public void changeOrder() {
		StringBuffer Sb = new StringBuffer();
		StringBuffer k = new StringBuffer();
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the String Here");
		String input = Sc.next();
		Sc.close();
		k.append(input);
		String p1 = k.substring(0,10);
		System.out.println(p1);
		String p2 = k.substring(10,12);
		System.out.println(p2);
		String p3= k.substring(12);
		Sb.append(p3);
		Sb.append(p2);
		Sb.append(p1);
		System.out.println(Sb);
		
		
	}
	
}







class Main{
	public static void main(String[] args) throws ParseException {
		Day10 Obj1 = new Day10();
		Obj1.stringConvert("112.45");
		Obj1.integerToString(34);
		Obj1.stringToDate("09 25, 2020");
		
		System.out.println();
		
		BoxingRing Bx = new BoxingRing();
		Bx.autoBoxingUnboxingIntegr();
		Bx.printBoxed();
		
		CamelToSnake cts = new CamelToSnake();
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = Sc.next();
		System.out.println(cts.camelToSnake(s));
		Sc.close();
		
		
		StringAppend SA = new StringAppend();
		SA.appendString();// type end when you are done appending your String
		
		
		StringAtEven Sae = new StringAtEven();
		Sae.printAtEven();
		
		
		StringAtOdd Sao = new StringAtOdd();
		Sao.printAtOdd();
		
		ChangeOrder Co = new ChangeOrder();
		Co.changeOrder();
		
		
	}
	
}
