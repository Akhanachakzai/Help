package practice;

public class Main {

	public static void main(String[] args) 
	{
		String first,last;
		char grade;
		int wrkhrs,slry;
	
		student[] students=new student[10];
		worker[] workers = new worker[10];


		for(int x =0 ;x<=9;x++){
			first = "Aurangkhan"+x;
			last = "Achakzai"+x;
			grade = 'a';
			students[x]= new student(first, last, grade);
		
	students[x].showstudentgrade();	
		}}

}
