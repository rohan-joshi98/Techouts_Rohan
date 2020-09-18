//Hierarchial Inheritance
public class Animal {
	public int legs = 4;
	public int tail = 1;
	
	public void bite() {
		System.out.println("Bite");
	}
}
class Cat extends Animal{
	public void sound() {
		System.out.println("Meoow");
	}
	
}
class Dog extends Animal{
	public void sound() {
		System.out.println("Woof");
	}
	
}
class AnimalMain{
	public static void main(String[] args) {
		Cat SnowBell = new Cat();
		System.out.println("Snowbell is a Cat");
		System.out.println("SnowBell has "+SnowBell.legs+" legs and "+SnowBell.tail+" tail");
		SnowBell.sound();
		
		Dog Scooby = new Dog();
		System.out.println("Scooby is a Dog");
		System.out.println("Scooby has "+Scooby.legs+ " And "+Scooby.tail+" tail");
			

	}
}
