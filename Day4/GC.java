
public class GC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GC Obj=new GC();  
		Obj=null;
		System.gc();

	}
	/* Here the Obj is referencing to null, hence it is of our no user. This is where 
	 * garbage collector will come in the picture and get rid of such useless objects
	 */

}
