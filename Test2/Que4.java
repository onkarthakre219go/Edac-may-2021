class Student {
	int Roll_no;
	String Name;
    int mark;
    String div;
    void show(int Roll_no,String Name)
    {
    	this.Roll_no=Roll_no;
    	this.Name=Name;
    	
        System.out.println("Student Details:\nRoll_No:"+Roll_no+" Name of student:"+Name);
    }
}
class Marks extends Student {
    void show(int mark)
    {   this.mark=mark;
        System.out.println("Student Marks: "+mark+"%");
    }
}
class Result extends Marks{
	void show(String div)
	{   this.div=div;
		System.out.println("Result of student: "+div);
	}
}

class Que4 {
    public static void main(String[] args)
    {
        
        Student obj1 = new Student();
        obj1.show(10,"onkar Thakre");
        
        Marks obj2 = new Marks();
        obj2.show(85);
  
        Result obj3 = new Result();
        obj3.show("First class");
    }
}