
public class Hidden {
	private int hiddenNumber=1234;
	
	public int gethiddenNumber() {
		return hiddenNumber;
	}
	public void printHiddenNumber() {
		System.out.println(hiddenNumber + " is the hidden Number");
	}
}
class HiddenMain{
	public static void main(String[] args) {
		Hidden V = new Hidden();
		System.out.println(V.gethiddenNumber());
		V.printHiddenNumber();
	}
}