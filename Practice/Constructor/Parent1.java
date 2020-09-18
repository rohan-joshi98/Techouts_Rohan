
public class Parent1 {
	Parent1(){
		System.out.println("This is Parent 1");
	}
}
class Child1 extends Parent1{
	Child1(){
		super();
		System.out.println("This is child 1");
	}
	
}
class Child2 extends Parent1{
	Child2(){
		super();
		System.out.println("This is Child 2");
	}
}
class ParentMain{
	public static void main(String[] args) {
		Child2 C2 = new Child2();
		Child1 C1= new Child1();
	}
}