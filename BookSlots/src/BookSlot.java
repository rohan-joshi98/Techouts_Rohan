import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;



public class BookSlot extends Thread{
	HashMap<String, LocalTime> Badminton = new HashMap<>();
	HashMap<String, LocalTime> Football = new HashMap<>();
	HashMap<String, LocalTime> BoxCricket = new HashMap<>();
	ArrayList<LocalTime> BadmintonSlots = new ArrayList<>();
	ArrayList<LocalTime> FootballSlots = new ArrayList<>();
	ArrayList<LocalTime> BoxCricketSlot = new ArrayList<>();
	ArrayList<String> SlotNames = new ArrayList<>();
	ArrayList<String> BadmintonTimeSlots = new ArrayList<String>();
	
	
	HashMap<String, LocalTime> TempBadminton = new HashMap<>();
	HashMap<String, LocalTime> TempFootball =new HashMap<>();
	HashMap<String, LocalTime> TempBoxCricket;
	
	
	DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm");
	String now = LocalTime.now().format(time);
	LocalTime rightNow = LocalTime.parse(now);
	LocalDate today = LocalDate.now();
	LocalTime STARTTIME = LocalTime.parse("10:30");
	LocalDateTime START = LocalDateTime.parse(today+"T"+"10:00");


	public void initSlots(){
		SlotNames.add("A");
		SlotNames.add("B");
		SlotNames.add("c");
		SlotNames.add("D");
		SlotNames.add("E");
		SlotNames.add("F");
		SlotNames.add("G");
		SlotNames.add("H");
		SlotNames.add("I");
		SlotNames.add("J");
		SlotNames.add("K");
		SlotNames.add("L");
		SlotNames.add("I");
		SlotNames.add("M");
		SlotNames.add("N");
		SlotNames.add("O");
		SlotNames.add("P");
		SlotNames.add("Q");
		SlotNames.add("R");
		SlotNames.add("S");
		
		
		for(int i=0;i<10;i++) {
			Badminton.put(SlotNames.get(i), STARTTIME.plusHours(i));
		}
		
		for(int i=0;i<20;i++) {
			Football.put(SlotNames.get(i), STARTTIME);
			STARTTIME=STARTTIME.plusMinutes(30);
		}
		for(int i=0;i<5;i++) {
			BoxCricket.put(SlotNames.get(i), STARTTIME);
			STARTTIME=STARTTIME.plusHours(2);
		}	
		
		
	}


}







