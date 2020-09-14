import java.util.Scanner;

public class Java{
	
	public static String getOopsDescription(String c) {
		
		String inheritance= "It is the mechanism of java in which java allows sub class to inherit the features of super class.\n"+
				"Subclass can inherit fields and methods of the supper class in addition to its own. Methods and fields.\n" + 
				"Super class: The class whose features are inherited is called as superclass.\n" + 
				"Sub class: the class that inherits other class is known as subclass.\n"+
				"class Vehicle {\n" + 
				"  protected String brand = \"Ford\";        // Vehicle attribute\n" + 
				"  public void honk() {                    // Vehicle method\n" + 
				"    System.out.println(\"Tuut, tuut!\");\n" + 
				"  }\n" + 
				"}\n" + 
				"\n" + 
				"class Car extends Vehicle {\n" + 
				"  private String modelName = \"Mustang\";    // Car attribute\n" + 
				"  public static void main(String[] args) {\n" + 
				"\n" + 
				"    // Create a myCar object\n" + 
				"    Car myCar = new Car();\n" + 
				"\n" + 
				"    // Call the honk() method (from the Vehicle class) on the myCar object\n" + 
				"    myCar.honk();\n" + 
				"\n" + 
				"    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class\n" + 
				"    System.out.println(myCar.brand + \" \" + myCar.modelName);\n" + 
				"  }\n" + 
				"}\n"+
				"\n"+
				"Referred from W3School, Java Inheritance, https://www.w3schools.com/java/java_inheritance.asp";
		String polymorphism= "The world polymorphism means “many forms”. It’s the ability of an object to take many forms.\n"+
				"The most common use of polymorphism in OOPS occurs when parent class reference is user to refer to a child \n"+
				"class object. Any Java object that can pass more than one IS-A test is considered to be polymorphic. \n"+
				"class Animal {\n" + 
				"  public void animalSound() {\n" + 
				"    System.out.println(\"The animal makes a sound\");\n" + 
				"  }\n" + 
				"}\n" + 
				"\n" + 
				"class Pig extends Animal {\n" + 
				"  public void animalSound() {\n" + 
				"    System.out.println(\"The pig says: wee wee\");\n" + 
				"  }\n" + 
				"}\n" + 
				"\n" + 
				"class Dog extends Animal {\n" + 
				"  public void animalSound() {\n" + 
				"    System.out.println(\"The dog says: bow wow\");\n" + 
				"  }\n" + 
				"} \n"+
				"\n"+
				"Referred from W3School, Java Polymorphism, https://www.w3schools.com/java/java_polymorphism.asp";
		String encapsulation= "Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) \n"+
				"together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed \n"+
				"only through the methods of their current class.\n"+
				"public class Person {\n" + 
				"  private String name; // private = restricted access\n" + 
				"\n" + 
				"  // Getter\n" + 
				"  public String getName() {\n" + 
				"    return name;\n" + 
				"  }\n" + 
				"\n" + 
				"  // Setter\n" + 
				"  public void setName(String newName) {\n" + 
				"    this.name = newName;\n" + 
				"  }\n" + 
				"}\n"+
				"\n"+
				"Referred from W3School, Java Encapsulation, https://www.w3schools.com/java/java_encapsulation.asp";
		String abstaction= "Data abstraction is the process of hiding certain details and showing only essential information to the user.\n"+
				"Abstraction can be achieved with either abstract classes or interfaces. \n" +
				"abstract class Animal {\n" + 
				"  public abstract void animalSound();\n" + 
				"  public void sleep() {\n" + 
				"    System.out.println(\"Zzz\");\n" + 
				"  }\n" + 
				"} \n"+
				"\n"+
				"Referred from W3School, Java Abstraction , https://www.w3schools.com/java/java_abstract.asp";
		
		switch (c) {
			case "inheritance":
				System.out.println(inheritance);
				break;
			case "polymorphism":
				System.out.println(polymorphism);
				break;
				
			case "Encapsulation":
				System.out.println(encapsulation);
				break;
			case "abstraction":
				System.out.println(abstaction);
				break;
			default: System.out.println("We currently do not have any information on this topic");
		}
		return c;
		
		
	}
	
	public static void main(String [] args) {
		Java.getOopsDescription("inheritance");
	}
	
	
}
