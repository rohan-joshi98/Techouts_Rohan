
public class PlayerOne extends Thread{
	String playerOne;
	PlayerOne (String p1){
		super();
		this.playerOne=p1;
	}
	
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(4000);
			}catch(Exception e) {
				e.getMessage();
			}
			System.out.println(this.playerOne +" is playing");
		}
	}
}
class PlayerTwo extends Thread{
	String playerTwo;
	PlayerTwo(String p2){
		super();
		this.playerTwo=p2;
	}
	
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(4000);
			}catch(Exception e) {
				e.getMessage();
			}
			System.out.println(this.playerTwo +" is playing");
		}
	}
	
	
}
class Play{
	public static void main(String[] args) {
		PlayerOne P1= new PlayerOne("Rohan");
		P1.setPriority(5);
		P1.setName("Rohan");
		P1.setDaemon(false);
		PlayerTwo P2 = new PlayerTwo("Noor");
		P2.setPriority(4);
		P2.setName("Rohan");
		P2.setDaemon(false);
		
		P1.start();
		try {
			Thread.sleep(400);
		}catch(Exception e) {
			e.getMessage();
		}
		P2.start();
		
		
		
	}
}