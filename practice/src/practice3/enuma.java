package practice3;

public enum enuma{ 
Days1(Sat), Days2(Sun);// Mon, Tue, Wed, Thu, (Fri);
//Inside some method
Days day1, day2;
int day3;
day1 = Days.Sat;
day2 = Days.Tue;
day3 = (int) Days.Fri;
Console.WriteLine(day1);
Console.WriteLine(day2);
Console.WriteLine(day3);


}
