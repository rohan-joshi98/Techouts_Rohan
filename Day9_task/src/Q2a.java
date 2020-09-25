
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Q2a {
	String str;
	String replace;
	public Q2a(String s, String r){
		this.str= s;
		this.replace= r;
	}
	public void searchCaseIn() {
		Pattern pattern = Pattern.compile(this.replace,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(this.str);
		boolean matchFound = matcher.find();
		if(matchFound) {
			System.out.println("Match Found");
			
		}else {
			System.out.println("No match found");
		}
	}
}
class Q2aMain{
	public static void main(String[] args) {
		Q2a Str = new Q2a("A regular expression is a sequence of characters that forms a search pattern. \n" + 
				"When you search for data in a text, you can use this search pattern to describe what you are searching for.","search");
		Str.searchCaseIn();
	}
}