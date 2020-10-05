import java.util.ArrayList;
import java.util.Iterator;

public class Q2 {


	    public static void main(String[] args){
	        Trainee trainee1 = new Trainee("Rohan", 01);
	        Trainee trainee2 = new Trainee("Neha", 02);
	        //System.out.println(trainee1.getName());
	        StudyMaterial studyMaterial1 = new StudyMaterial("SAT Maths", 1);
	        StudyMaterial studyMaterial2 = new StudyMaterial("SAT English", 2);

	        trainee1.addStudyMaterial(studyMaterial1);
	        trainee1.addStudyMaterial(studyMaterial2);

	        studyMaterial1.addTrainee(trainee1);
	        studyMaterial1.addTrainee(trainee2);

	        studyMaterial2.addTrainee(trainee1);
	        studyMaterial2.addTrainee(trainee2);

	        System.out.println(trainee1.getName() + "\n----------");
	        trainee1.getStudyMaterials();

	        System.out.println();

	        System.out.println(studyMaterial1.getName() + "\n---------");
	        studyMaterial1.getTrainees();
	    }
	

}


class Trainee {
    private String name;
    private int id;
    private ArrayList<StudyMaterial> studyMaterials;
    {
    	studyMaterials = new ArrayList<>();
    }

    public Trainee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getID(){
        return id;
    }

    public void addStudyMaterial(StudyMaterial studyMaterialObj){
        studyMaterials.add(studyMaterialObj);
    }

    public void getStudyMaterials(){
        Iterator<StudyMaterial> i = studyMaterials.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }

    public String toString(){
        return name;
    }
}






class StudyMaterial {
    private String name;
    private int id;
    private ArrayList<Trainee> trainees;

     {
        name = "ABCD";
        id = 1;
        trainees = new ArrayList<>();
    }
    public StudyMaterial(String name, int id) {
    	this.name= name;
    	this.id=id;
    }
    public String getName(){
        return name;
    }

    public int getID(){
        return id;
    }

    public void addTrainee(Trainee traineeObj){
        trainees.add(traineeObj);
    }

    public void getTrainees(){
        Iterator<Trainee> i = trainees.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }

    public String toString(){
        return name;
    }
}






