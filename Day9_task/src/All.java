
public class All {
	String str;
	public All(String s){
		this.str = s;
	}
	public void replaceAll() {
		String t = this.str.replace("PHP","Java");
		System.out.println(t);
	}
	
}
class AllMain{
	public static void main(String[] arg) {
		All replace = new All("PHP is one of the programming languages commonly used. PHP follows OOPS concept in it.\n" + 
				"Java is very well known for its as a platform independent language.");
		replace.replaceAll();
	}
}