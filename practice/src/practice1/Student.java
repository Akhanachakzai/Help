package practice1;

public class Student extends people {
	private String Name;
	public Student(String studentname ){
		super("Class1",studentname);
	}
	public void teachername(){
		System.out.println(Name+"Fromclass :"+"Class1");
	}
}
