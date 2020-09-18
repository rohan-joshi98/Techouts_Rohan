
public class Inheritance {
	public int var =20;
	public void print(){
		System.out.println("Value of the variable var is "+ var);
	}
	
}
class InheritanceMain{
	public static void main(String [] args) {
		Inheritance Obj1 = new Inheritance();
		Obj1.print();
	}
}
