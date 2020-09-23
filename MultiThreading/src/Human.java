

public class Human {
	String name;
	public Human(String name) {
		this.name= name;
	}
	
}
class Walk extends Human implements Runnable {
	public Walk(String name){
		super( name);
		
	}
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
			System.out.println(this.name+" is walking");
		}
	}
	
}
class Talk extends Human implements Runnable{

	public Talk(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		for(int j=0;j<10;j++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
			System.out.println(this.name+" is talking");
		}
		
	}
	
}
class TalkNWalk{
	public static void main(String[] args) {
		Runnable Obj1= new Walk("Rohan");
		Thread walk= new Thread(Obj1);
		
		Runnable Obj2 = new Talk("Rohan");
		Thread talk= new Thread(Obj2);
		
		talk.start();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		walk.start();
	}
}
