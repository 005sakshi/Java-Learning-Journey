//Checked exception can be handled by 2 ways.
// 1.Using throws keyword.It is method level.eg - FileNotFoundException, InterrruptedException
// 2. Using try-catch block.It is statement level.eg - interruptedException
//We know in program which type of exception it is going to throws. Bz it start showing error to fix that we use the exception type with the throws keyword.

package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
	public static void main(String []args) throws InterruptedException, FileNotFoundException  {
		System.out.println("Program started");
	   
		try   
		{
		Thread.sleep(5000);//Error throws unhandled interruptedException.
		}
		catch(InterruptedException e)
		{
			System.out.println("This is statement level.");
		}
		
		System.out.println("Program inprogress..");
		
		Thread.sleep(5000);
		
		FileInputStream file = new FileInputStream("c:\\Text.txt");
		
	    System.out.println("Program finished.");
	}
	

}
