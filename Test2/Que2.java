import java.util.*;
public class Que2 {
 static Scanner in =new Scanner(System.in);
 
	private static void ArithmeticException()
	{
		  try {
	            int a = 30, b = 0;
	            int c = a / b;
	            System.out.println("Result = " + c);
	        }
	        catch (ArithmeticException e) {
	            System.out.println("Can't divide a number by 0");
	        }
	    }
	
	
	private static void simpleException() {
		System.out.println("Enter a number");
		try {
			int no = in.nextInt();
			System.out.println("The value: " + no);
		}catch(InputMismatchException miss)
		{
			System.err.println("Expected a number as input within the range of " + Integer.MIN_VALUE + " and " + Integer.MAX_VALUE); 
		}
	}
	
	private static void arrayIndex() {
		
			        try {
			            int a[] = new int[5];
			            a[6] = 9; 
			       
			        }
			        catch (ArrayIndexOutOfBoundsException e) {
			            System.out.println("Array Index is Out Of Bounds");
			        }		
	}
	
	private static void nullPointer() {
			   try {
			            String a = null; 
			            System.out.println(a.charAt(0));
			        }
			        catch (NullPointerException e) {
			            System.out.println("NullPointerException..");
			        }
			    }
			
	public static void main(String[] args) {
		
		 ArithmeticException();
		// simpleException();
		// arrayIndex();
		// nullPointer();
	}

}