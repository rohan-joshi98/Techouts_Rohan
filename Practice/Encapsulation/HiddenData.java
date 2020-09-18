//Encapsulation + Inheritance
public class HiddenData {
	private String hiddentext="This is a very private message";
	public String getHidden() {
		return hiddentext;
	}
	
}
class OpenData extends HiddenData{
	
	
}
class HiddenDataMain{
	public static void main(String[] args) {
		OpenData OD = new OpenData();
		System.out.println(OD.getHidden());
	}
}