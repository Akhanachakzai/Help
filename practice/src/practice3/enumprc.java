package practice3;

public enum enumprc {
aurang("Mechatronics","18"),Zirak("Software","20"),Kaka("Surgeon","30"),Arehman("School","12");
private String occupation;
private String age;
 enumprc(String work,String agE){
	occupation = work;
	age = agE;
}
public void gethistory(){
	System.out.println(occupation+age);
}
}
