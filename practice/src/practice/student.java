package practice;

public class student extends person {
	private char grade;
	private String name;
	private String last;
	public student(String Name,String Lastname,char grad){
		super ( Name , Lastname ) ;
		grade = grad;
		name = Name;
		last =Lastname;
	}
	public void showstudentgrade(){
		System.out.println(name+last+"\nGrade is"+grade);
	}

}
