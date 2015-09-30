package practice;

public class worker extends person {
	private char grade;
	private String name;
	private String last;
	int w,s;
	public worker(String Name,String Lastname,int workhours,int salary){
		super ( Name , Lastname ) ;
		name = Name;
		last =Lastname;
		w = workhours;
		s = salary;
	}
	public void showworker(){
		System.out.println(name+last+"\nworkshours"+w+"salary"+s);
	}
}
