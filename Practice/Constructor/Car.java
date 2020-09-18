//Constructors
public class Car {
	String brand;
	Car(String b){
		this.brand= b;
	}
	public void getBrand() {
		System.out.println(brand);
	}
	public void run() {
		System.out.println("the car is running");
		
	}
}
class RunMain{
	public static void main(String[] args) {
		Car Polo = new Car("Ford");
		Polo.getBrand();
	}
}
