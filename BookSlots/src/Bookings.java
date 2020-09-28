
class Booking{
	public static void main(String[] args) {
//		BookSlot Bs = new BookSlot();
//		Bs.initSlots();
//		Bs.printAvailableBadminton();
		
		TakeInputs Ti = new TakeInputs();
		Ti.initSlots();

		
	
		Runnable T1 = new TakeInputs();
		Thread Input = new Thread(T1);

		Input.start();
//		
	}
}