/*
Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively. 
Its constructor having parameters for length and breadth is used to initialize length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' 
class with its constructor having a parameter for its side (suppose s) calling the constructor of its parent class as 'super(s,s)'. 
Print the area and perimeter of a rectangle and a square.*/
public class Rectangle {
	int length;
	int breadth;
	
	public Rectangle(int l, int b) {
		this.breadth= b;
		this.length= l;
		
	}
	
	public int area() {
		int area = this.length*this.breadth;
		System.out.println("Area: "+area);
		return area;
	}
	public int perimeter() {
		int perimeter = 2*(this.length*this.breadth);
		System.out.println("Perimeter: "+perimeter);
		return perimeter;
	}
}
class Square extends Rectangle{
	public Square(int s){
		super(s,s);
	}
}
class Area{
	public static void main(String[] args) {
		Rectangle R= new Rectangle(2,6);
		R.area();
		R.perimeter();
		
		Square S= new Square(5);
		S.area();
		S.perimeter();
	}
}
