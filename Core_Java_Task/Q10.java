
public class Q10 extends Thread{
	
	
	
	
	@Override
	public void run() {
		
		System.out.println("name: "+ this.getName());
		System.out.println("ID: "+this.getId());
		System.out.println("Priority: "+this.getPriority());
		System.out.println("State: "+this.getState());
		System.out.println("If Deamon: "+this.isDaemon());
		
		
		
	}
	
	
}
class Q10Main{
	
	public static void main(String[] args) {
		Q10 t1 = new Q10();
		Q10 t2 = new Q10();
		Q10 t3 = new Q10();
		
		t1.setName("Rohan");
		t1.setDaemon(true);
		System.out.println("State"+t1.getState());
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("State"+t1.getState());
		System.out.println("State"+t2.getState());
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("State"+t2.getState());
		System.out.println("State"+t3.getState());
		t3.start();
		System.out.println("State"+t3.getState());
	}
	
	
	
	
	
}
