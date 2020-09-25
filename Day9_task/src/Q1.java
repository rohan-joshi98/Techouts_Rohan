public class Q1 {
	String str;
	public Q1(String s){
		this.str=s;
	}
	public void replaceFirst() {
		String t = this.str.replaceFirst("PHP", "Java");
		System.out.println(t);
	}
	
}
class Q1Main{
	public static void main(String[] args) {
		Q1 replace = new Q1("PHP is one of the programming languages commonly used. PHP follows OOPS concept in it.\n" + 
				"Java is very well known for its as a platform independent language.");
		replace.replaceFirst();

	}
}
