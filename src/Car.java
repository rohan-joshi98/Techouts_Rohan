//Hierarchical  Inheritance

public class Car{
	public void start(String s) {
		System.out.println("Vroom");
	}
	
}
class Honda extends Car{
	public void goFast() {
		System.out.println("vroooom");
	}
}
class Farrari extends Car{
	public void goFaster() {
		System.out.println("Vrooooommmmmmm");
	}
}
class MainClass{
	public static void main(String [] args) {
		Car newCar = new Car();
		Honda newHonda= new Honda();
		Farrari newFarrari= new Farrari();
		
		newCar.start("Start");
		newHonda.goFast();
		newFarrari.goFaster();
		
	}
}