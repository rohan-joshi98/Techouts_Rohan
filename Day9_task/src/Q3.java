
public class Q3 extends Thread{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		
		System.out.println(t.getName()+" has started");
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.getMessage();
		}
		System.out.println(t.getName()+" has ended");
		
	}
}
class Q3Main{
	public static void main(String[] args) {
		Q3 newThread1 = new Q3();
		Q3 newThread2 = new Q3();
		Q3 newThread3 = new Q3();
		
		newThread1.setName("Thread1");
		newThread2.setName("Thread2");
		newThread3.setName("Thread3");
		
		newThread1.start();
		try {
			newThread1.join();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		newThread2.start();
		try {
			newThread2.join();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		newThread3.start();
		try {
			newThread2.join();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
