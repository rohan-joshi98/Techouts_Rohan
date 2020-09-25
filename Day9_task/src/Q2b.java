import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Q2b {
	String str;
	String search;
	public Q2b(String str, String s ){
		this.str= str;
		this.search = s;
		
	}
	public long searchCaseSen() {
		Pattern pattern = Pattern.compile(this.search);
		Matcher matcher = pattern.matcher(this.str);
		boolean matchFound = matcher.find();
		if(matchFound) {
			System.out.println("match found");
			long i= matcher.results().count();
			return i;
		}else {
			System.out.println("No match found");
			return -1;
		}
		
	}
}
class Q2bMain{
	public static void main(String[] args) {
		Q2b search = new Q2b("A regular expression is a sequence of characters that forms a search pattern. \n" + 
				"When you search for data in a text, you can use this search pattern to describe what you are searching for.","search");
		System.out.println("Count :"+ search.searchCaseSen());
	}
}