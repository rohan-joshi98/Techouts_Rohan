package collection_practice;
import java.util.*;


public class MyArrayList2 {// Create the ArrayList
	ArrayList<Integer> newAl = new ArrayList<>();
	
}
class HandleInputs extends MyArrayList2{//Initialize Variables
	int index ;
	int replace;
	int[] input = {1,2,3,4,5,6,8};
	String action;
	HandleInputs(int index){
		this.index= index;
	}

	HandleInputs(int [] inputs){
		this.input=inputs;
	}
	HandleInputs(String action, int index){
		this.action = action;
		this.index = index;
	}
	HandleInputs(String action, int index, int replace){
		this.action= action;
		this.index = index;
		this.replace= replace;
	}
	
	
	
}
class Child extends HandleInputs{ //handle and execute methods

	Child(int index) {
		super(index);

	}
	
	Child(int[] input){
		super(input);
	}
	Child(String action, int index){
		super(action, index);
		
	}
	Child(String action, int index, int replace){
		super(action, index,replace);
	}
	
	
	public void addInput() {
		int len =this.input.length;
		int i =0;
		while(len!=0) {
			newAl.add(this.input[i]);
			i++;
			len--;
		}
	}
	
	
	public void perform() {
		if(this.action.equals("get")) {
			System.out.println(newAl.get(this.index));
			
		}else if(this.action.equals("remove")) {
			newAl.remove(this.index);
			System.out.println(newAl);
		}else if(this.action.equals("replace")) {
			newAl.set(this.index, this.replace);
			System.out.println(newAl);
		}
		
	}
	
	

	
	
}
class AlMain{
	public static void main(String[] args) {
		boolean done=false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the action");
		
		String action = sc.nextLine();
		
		while(!done) {
			try {
				if(action.equals("get")) {
					System.out.println("Enter the index");
					int index = sc.nextInt();
					Child newChild = new Child(action,index);
					newChild.addInput();
					newChild.perform();
				}else if(action.equals("replace")) {
					System.out.println("Enter the index");
					int index = sc.nextInt();
					System.out.println("enter the replacement");
					int replace = sc.nextInt();
					Child newChild = new Child(action,index,replace);
					newChild.addInput();
					newChild.perform();
				}else if(action.equals("remove")) {
					System.out.println("Enter the index");
					int index = sc.nextInt();
					Child newChild = new Child(index);
					newChild.addInput();
					newChild.perform();
					
				}else if(action.equals("")){
					System.out.println("No action selected");
				}
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		
			
			
		}
		
		
		
		
		sc.close();
		
		
		
		
	}
}
