/*
1)WAP to demonstrate (2.45pm to 3.30)
a)class, object
b)array of object
c)different method
d)constructor
e)constructor /method overloading
f)static variable, method
*/

public class test {
	static int Id;               //static variable
	static String name;
	static String address;
	test(int Id1,String name)   //constructor with parameter 
	{
		 Id=Id1;
		 this.name=name;
	
		System.out.println("\nstudent Id:"+Id+"  student name:"+name);
	}
	
	
	test(int Id2,String name1,String address)
	{
	 Id=Id2;
	 name=name1;
	 this.address=address;
	 System.out.println("\nstudent Id:"+Id+"  student name:"+name+"  Student address:"+address);
	}
	
	 static void display()         //static Method 
	    {
	        System.out.println("\nStudent id is: " + Id + "  " + "and Student name is: " + name);
	        System.out.println("This is Static Method");
	    }

	public static void main(String[] args)
	{
		test obj = new test(10,"onkar");
		obj.display();       //different method calling
		
	    test obj2 = new test(20,"Aman","nagpur");  //method overloading with constructor
	    obj2.display();
	    
		test[] obj1 = new test[2];  //array of object
		obj1[0] = new test(2000,"thakre");
		System.out.println("Student data in test arr 0: ");
		obj1[0].display();         
				
	}
}