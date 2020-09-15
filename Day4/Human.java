
public interface Human {
	public void language();
	public void height();
	
	
}
interface Man extends Human{
	public void identify();
		
}
class Adam implements Man{
	public void identify() {
		System.out.println("Hi I am adam and I am a man");
	}
	public void language() {
		System.out.println("I speak English");
	}
	public void height() {
		System.out.println("I have very tall");
	}
}
class Run{
	public static void main(String [] args) {
		Adam adam = new Adam();
		adam.identify();
		adam.language();
		adam.height();
	}
}