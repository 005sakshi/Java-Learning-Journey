package ExceptionHandling;
import java.util.Scanner;
import java.util.Scanner.*;

public class HandleException {
	
	public static void main(String []args)
	{
		System.out.println("Programs is started.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number.");
		int num = sc.nextInt();
		
		try
		{
			System.out.println(100/num);
		}
		catch(ArithmeticException e) 
		{
			System.out.println("The program is an error. "); //This catch block only execute only when their is exception in the code.
		}
		
		System.out.print("Program completeds.\n");
		System.out.println("Program exited...");
		
	}

}
