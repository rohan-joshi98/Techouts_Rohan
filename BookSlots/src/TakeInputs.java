import java.util.Scanner;


class TakeInputs extends AvailableSpots implements Runnable{
	

	public void run() {
		
		
		AvailableSpots As = new AvailableSpots();
		
	
			synchronized (this) {
				System.out.println("Enter Your Name");
				Scanner Sc = new Scanner(System.in);
				String user = Sc.nextLine();
				System.out.println("Which sport you are interested in?");
				String sport = Sc.nextLine();
				try {
					
					switch(sport) {
					case "Badminton":
						As.printAvailableBadminton();
						break;
					case "Football":
						As.printAvailableFootball();
						break;
					case "BoxCricket": 
						As.printAvailableBoxCricket();
						break;
					default :
						System.out.println("Please Enter a valid Sport");
						
					}
					System.out.println("Choose a slot");
					String slot = Sc.nextLine();
					
					//wait this thread and start another 
					
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				
				Sc.close();
			}
	}
	
	
}
