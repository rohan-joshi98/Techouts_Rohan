import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteCSV {
	public static void main(String[] args) throws IOException {
		FileOutputStream fo =new FileOutputStream("Employee.csv", true);
		PrintWriter pw = new PrintWriter(fo);
		pw.println("Name,Age,WorkEx,Designation");
		pw.println("Rohan,26,2,Developer");
		pw.println("Neha,25,2,Developer");
		
		pw.close();
		fo.close();
		System.out.println("CSV created");
		
		
	}
}
