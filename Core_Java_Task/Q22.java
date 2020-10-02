import java.util.Scanner;
@FunctionalInterface
interface Company{
	public default double calProfit(double CP, double SP) {
		Double profit;
		return profit = CP-SP;
		
	}
	
	
	void getCompDetails(double p, String s);
	
	
	
	public static String companyName(String s) {
		
		System.out.println("s");
		return s;
		
	}


	
}
class NewCompany implements Company{

	@Override
	public void getCompDetails(double p, String s) {
		
	}


}



public class Q22 {

	public static void main(String[] args) {
		NewCompany TechOuts = new NewCompany();
		
		double profit = TechOuts.calProfit(1452.5, 132);
		//System.out.println("Profit: "+profit);
		
		String name = Company.companyName("TechOuts");
		//System.out.println("Name: "+name);
		
		Company comp1 = (p, n)-> {
			System.out.println("The company "+n+" has made "+p+" this financial year");
		};
		
		comp1.getCompDetails(profit, name);
		
		
		
	}
	
}