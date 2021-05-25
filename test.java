/*
1)WAP to demonstrate (2.45pm to 3.30)
a)class, object
b)array of object
c)different method
d)constructor
e)constructor /method overloading
f)static variable, method
*/


public class test 
{
	int Id;
	String name;
	String address;
	test(int Id1,String name)
	{
		 Id=Id1;
		 this.name=name;
		System.out.println("this is constructor method with two parameter");
	}
	test(int Id2,String name1,String address)
	{
	 Id=Id2;
	 name=name1;
	 this.address=address;
	 System.out.println("this is constructor method with three parameter");
	}
	
	 public void display()
	    {
	        System.out.println("Student id is: " + Id + "  " + "and Student name is: " + name);
	        System.out.println();
	    }

	public static void main(String[] args)
	{
		test obj = new test(10,"onkar"); 
	test obj = new test(20,"Aman","nagpur"); 
		test[] obj1 = new test[2];  //array of bject
		obj1[0] = new test(2000,"thakre");
		
		obj.display();

	}
}
 