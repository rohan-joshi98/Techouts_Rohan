
public class Q9 {
	
	
	
}
class Add extends Q9 implements Runnable{
	int [] array = {1,2,4,5,6,7,8,9};
	
	
	int result =0;
	
	@Override
	public void run() {
		
		for(Integer i: array) {
			 result = result+i;
			 
		}
		Thread t = Thread.currentThread();
		t.getName();
		t.setName("Rohan");
		
		
	}
	
}



class Avg extends Add implements Runnable{
	double avg = 0.0;
	@Override
	public void run() {
		avg = result/array.length;
	}
	
}





class Display extends Avg implements Runnable{
	
	@Override
	public void run() {
		
		System.out.println("The addition of the Array is "+ this.result);
		System.out.println("The average of the Array is "+ this.avg);
		
	}
	
}
class Q9Main{
	public static void main(String[] args) throws InterruptedException {
		Runnable t1 = new Add();
		Thread Addition = new Thread(t1);
		
		Runnable t2 = new Avg();
		Thread Average = new Thread(t2);
		
		Runnable t3 = new Display();
		Thread Print= new Thread(t3);
		
		
		Addition.start();
		Average.start();
		
		Print.start();
		Average.join();
		Addition.join();
		Print.join();
		
		
		
		
		
		
		
		
		
		
	}
}
