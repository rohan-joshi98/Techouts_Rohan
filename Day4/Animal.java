//Abstraction
abstract class Animal {
	public abstract void sound();
	public void walk() {
		System.out.println("Walking");
	}
}
class Dog extends Animal{
	public void sound() {
		System.out.println("Woof");
	}
}
class MainClass{
	public static void main(String [] args) {
		Dog Obj = new Dog();
		Obj.sound();
		Obj.walk();
	}
}
