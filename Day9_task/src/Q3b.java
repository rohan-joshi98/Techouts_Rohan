
public class Q3b implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread T = Thread.currentThread();
		String t = T.getName();
		System.out.println(t+ " is doing its job");
		try {
			Thread.sleep(3000);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println("Priority of "+t+" is "+T.getPriority());
		System.out.println(t+" has just ended its job");
		
		
	}
	
	
}
class Q3bMain{
	public static void main(String[] args) {
		Runnable T1 = new Q3b();
		Thread newThread1 = new Thread(T1);
		
		Runnable T2 = new Q3b();
		Thread newThread2 = new Thread(T2);
		
		Runnable T3 = new Q3b();
		Thread newThread3 = new Thread(T3);
		
		newThread1.setName("Thread1");
		newThread2.setName("Therad2");
		newThread3.setName("Thread3");
		
		newThread3.setDaemon(true);
		newThread2.setPriority(10);
		newThread1.setPriority(5);
		
		newThread1.start();
		newThread2.start();
		newThread3.start();
		

		
		
		
		
		
	}
}
