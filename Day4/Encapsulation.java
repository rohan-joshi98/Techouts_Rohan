
public class Encapsulation {
	private int SSN = 1234567809; //read-only variable
	private int accountNum = 2134866; //read-only variable
	private int balance; //Read and Write
	
	//In this example we would not want user to change or modify SSN and Account number
	//this is the reason we are making these fields as read only fields
	//However the balance of the account needs to be updated 
	
	public int getSSN(){
		return SSN;
	}
	public int getAccountNumber() {
		
		return accountNum;
	}
	public void setBalance(int bal) {
		this.balance=bal;
	}
	public int getBalance() {
		return balance; 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation Obj= new Encapsulation();
		Obj.setBalance(3000);
		System.out.println("The Balance of the Account "+ Obj.getAccountNumber()+" is "+ Obj.getBalance() );
		System.out.println("The SSN of the Account holder is "+Obj.getSSN());
	}

}
