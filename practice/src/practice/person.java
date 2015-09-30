package practice;

abstract public class person {
	private String Name;
	private String LastName;
public  person(String nme,String lastname){
	Name = nme;
	LastName = lastname;
}
public void showname(){
	System.out.println(Name+LastName);
}
}
