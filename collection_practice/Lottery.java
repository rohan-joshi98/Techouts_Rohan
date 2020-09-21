package collection_practice;
import java.util.*;
public class Lottery {
	HashSet<String> Lucky = new HashSet<>();
	
	
}
class Draw extends Lottery{
	Lottery L = new Lottery();
	Scanner sc = new Scanner(System.in);
	Object[] winners=new String[3];
	public void addNames() {
		for(int i=1;i<11;i++) {
			System.out.println("Enter participant number "+i);
			String name= sc.next();
			Lucky.add(name);
		}
		
		System.out.println("-------------------------");
		sc.close();
	}
	
	public void pickDraw() {
		HashSet<String> temp = new HashSet<>();
		for(String i: Lucky) {
			temp.add(i);
		}
		Object[] temp2 = temp.toArray();
		
		for(int i=0;i<3;i++) {
			winners[i]=temp2[i];
		}
	}
	
	
	public void displayWinners() {
		System.out.println(winners[0]+" has won the First prize of $10000");
		System.out.println(winners[1]+" has won the Second prize of $7000");
		System.out.println(winners[2]+" has won the Third prize of $3000");
	}
	
	
}
class MainLottery{
	public static void main(String[] args) {
		Draw D = new Draw();
		D.addNames();
		D.pickDraw();
		D.displayWinners();
	}
}
