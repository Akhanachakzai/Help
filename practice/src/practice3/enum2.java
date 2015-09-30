package practice3;

public enum enum2 {
	Mon("Monday","Boring"),Tue("Tuesday","so-so"),Wed("Wednesday","better"),Thurs("Thursday","Not bad"),
	Fri("Friday","Partaay"),Sat("Saturday","Partaaaaay"),Sun("Sunday","OMG!");
private String Day;
private String Mood;

 enum2(String day,String mood){
	Day = day;
	Mood =mood;
	
}
public void gethistory(){
	System.out.println(Day+Mood);
}

}
