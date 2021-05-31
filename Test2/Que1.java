import java.util.*;
interface A
{
	void dispTime_InSec();
	void dispTime_Inhrs();
}
class Time implements A
{  	 Scanner in=new Scanner(System.in);
	int a;
	public void dispTime_InSec()
	{  
		System.out.println("Time in Seconds:"+a*60);
	}
	public void dispTime_Inhrs()
	{  
		System.out.println("Time in Hours:"+a/60);
	}
	public void Accept_min() {
	
		System.out.println("Enter The Minute:");
		a=in.nextInt();
	}
}
public class Que1 {

	public static void main(String[] args) {
		Time t=new Time();
		t.Accept_min();
		t.dispTime_InSec();
		t. dispTime_Inhrs();
		

	}

}