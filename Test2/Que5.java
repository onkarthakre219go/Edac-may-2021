import java.util.*;
class Employee{
  int Id;
  String name;
 public Employee(int EmpId,String Empname ){
   Id=EmpId;
   name=Empname;
 }	
}
class Que5
{
   public static void main(String args[])
   {
     Employee e1=new Employee(121,"Onkar Thakre");
     Employee e2=new Employee(122,"Om Thakre");
     
     ArrayList<Employee> Emp = new ArrayList<Employee>();
     Emp.add(e1);
     Emp.add(e2);
     for(Employee a:Emp) {
    	   System.out.println(" your Id: ="+a.Id);
    	   System.out.println("Your Name: ="+a.name);
    	 }
  }
}