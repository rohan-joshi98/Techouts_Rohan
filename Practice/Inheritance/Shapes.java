/*Create a class named 'Shape' with a method to print "This is This is shape". Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, 
 * both having a method to print "This is rectangular shape" and "This is circular shape" respectively. Create a subclass 'Square' of 'Rectangle' having a method 
 * to print "Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.*/
public class Shapes {
	public void print() {
		System.out.println("This is shape");
	}
	
}
class Rect extends Shapes{
	public void printRect() {
		System.out.println("This is Rectangle");
	}
}
class Circle extends Shapes{
	public void printCircle() {
		System.out.println("This is Circle");
	}
	
}
class Sqr extends Rect{
		public void printSquare() {
			System.out.println("Square is a rectangle");
		}
}
class ShapeMain{
	public static void main(String[] args) {
		Sqr Sqr = new Sqr();
		Sqr.printRect();
		Sqr.printSquare();
		
	}
}