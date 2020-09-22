import java.util.*;
public class Cars implements Comparable<Cars> {
	
	private String brand;
	private String name;
	private int price;
	
	
	Cars(String brand, String name, int price){
		this.brand= brand;
		this.name= name;
		this.price= price;
	}
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Cars [brand=" + brand + ", name=" + name + ", price=" + price + "]";
	}


	@Override
	public int compareTo(Cars o) {
		if(this.getPrice()>o.price) {
			return 1;
		}else if(this.getPrice()<o.price) {
			return -1;
			
		}else {
			return 0;
		}
	}
	

}
class Main{
	
	public static void main(String[] args) {
		ArrayList<Cars> al = new ArrayList<>();
		
		al.add(new Cars("Honda", "City", 20000));
		al.add(new Cars("Audi", "Q7", 30000));
		al.add(new Cars("Toyota", "Corolla", 21000));
		
		
		Collections.sort(al);
		
		
		for(Cars c: al) {
			System.out.println(c);
		}
		
		
		
	}
}
