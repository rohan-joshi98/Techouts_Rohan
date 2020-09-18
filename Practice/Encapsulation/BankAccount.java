
public class BankAccount {
	private int SSN;
	private String name;
	private String accountNumber;
	private int  balance;
	

	
	
	
	public void setSSN(int ssn) {
		this.SSN= ssn;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAccountNumber(String ac) {
		this.accountNumber= ac;
	}
	public void setBalance(int b) {
		this.balance=b;
	}
	
	
	
	public int getSSN() {
		System.out.println(SSN);
		return SSN;
	}
	public String getName() {
		return name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public int getBalance() {
		System.out.println(balance);
		return balance;
	}
	

	
}
class AccountMain{
	public static void main(String[] args){
		BankAccount C = new BankAccount();
		

		
		C.setAccountNumber("12345");
		C.setBalance(3000);
		C.setName("John Doe");
		C.setSSN(123456234);
		
		
		System.out.println("Account Number: "+C.getAccountNumber());
		System.out.println("Balance: "+C.getBalance());
		System.out.println("Name: "+C.getName());
		System.out.println("SSN: "+C.getSSN());
		
		
		
		
	}
}
