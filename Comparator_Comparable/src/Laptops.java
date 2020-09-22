import java.util.*;
public class Laptops{
	private String brand;
	private String model;
	private int ram;
	private int price;
	
	@Override
	public String toString() {
		return "Laptops [brand=" + brand + ", model=" + model + ", ram=" + ram + ", price=" + price + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Laptops(String brand,String model,int ram,int price){
		this.brand = brand;
		this.model = model;
		this.ram =ram;
		this.price =price;
	}

	
	
}
class SortByPrice implements Comparator<Laptops>{

	@Override
	public int compare(Laptops o1, Laptops o2) {
		if(o1.getPrice()>o2.getPrice()) {
			return 1;
			
		}else if(o1.getPrice()<o2.getPrice()) {
			return -1;
			
		}else return 0;
	}
	
}
class SortByRam implements Comparator<Laptops>{

	@Override
	public int compare(Laptops o1, Laptops o2) {
		if(o1.getRam()>o1.getRam()) {
			return 1;
		}else if(o1.getRam()<o2.getRam()) {
			return -1;
		}else return 0;
	}
	
}

class Compare{
	public static void main(String[] args) {
		ArrayList<Laptops> al = new ArrayList<>();
		al.add(new Laptops("Microsoft","Surface Pro",12,870));
		al.add(new Laptops("Acer","Chromebook",8,629));
		al.add(new Laptops("Dell","inspiron",8,600));
		al.add(new Laptops("HP","Thinkpad",12,800));
		al.add(new Laptops("Apple","MacBook pro",8,2000));
		
		
		Collections.sort(al,new SortByPrice());
		
		System.out.println();
		System.out.println("Sort by Price");
		for(Laptops l: al) {
			System.out.println(l.getPrice()+" "+l.getBrand()+" "+l.getModel()+" "+l.getRam());
		}
		
		System.out.println();
		System.out.println("Sort By Ram");
		Collections.sort(al,new SortByRam());
		for(Laptops l: al) {
			System.out.println(l.getPrice()+" "+l.getBrand()+" "+l.getModel()+" "+l.getRam());
		}
	}
}
