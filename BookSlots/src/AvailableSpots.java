import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;

class AvailableSpots extends BookSlot{
	
	public AvailableSpots(){
		super();
	}

	
	public void printAvailableBadminton() {
		System.out.println(today);

		
		if(STARTTIME.compareTo(rightNow)>=0) {
			TempBadminton.putAll(Badminton);
			TempBadminton.forEach((key, value) -> System.out.println(key + " : " + value));	
		}else {
			int Minutes = rightNow.getMinute();
			
			if(Minutes<30) {
				Minutes = (30 -Minutes)+Minutes;
				STARTTIME = rightNow.plusMinutes(Minutes);
				//activate another thread
			}else if(Minutes>30) {
				Minutes = (60 -Minutes)+Minutes;
				STARTTIME = rightNow.plusMinutes(Minutes);
				System.out.println(TempBadminton);
				//activate another thread
		}
		TempBadminton.forEach((key, value) -> System.out.println(key + " : " + value));		
	}
	}
	public void printAvailableFootball() {
		System.out.println(today);
		TempFootball.putAll(Football);
		TempFootball.forEach((key, value) -> System.out.println(key + " : " + value));	
	}
	public void printAvailableBoxCricket() {
		System.out.println(today);
		TempBoxCricket.putAll(BoxCricket);
		TempBoxCricket.forEach((key, value) -> System.out.println(key + " : " + value));	
	}
	
}

