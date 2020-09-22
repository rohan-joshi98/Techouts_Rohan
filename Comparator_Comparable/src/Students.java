import java.util.ArrayList;
import java.util.Collections;

public class Students implements Comparable<Students> {
	int rollNumber;
	String name;
	String address;
	
	Students(int r, String n, String a){
		this.rollNumber=r;
		this.name = n;
		this.address = a;
		
	}
	public void print() {
		System.out.println(this.rollNumber+" "+this.name+" "+this.address);
	}
	@Override
	public int compareTo(Students o) {
		if(this.rollNumber>o.rollNumber) {
			return 1;
		}else {
			return -1;
		}
	}
	public String toString() {
		return this.rollNumber+" "+this.name+" "+this.address;
		
	}
}

class ClassRoom{
	public static void main(String[] args) {
		ArrayList<Students> al= new ArrayList<>();
		al.add(new Students(19,"Rohan","Boston"));
		al.add(new Students(2,"Neha","Seattle"));
		al.add(new Students(37,"Purva","houston"));
		
		Collections.sort(al);
		
		for(Students s:al) {
			System.out.println(s.toString());
		}
	}
}
