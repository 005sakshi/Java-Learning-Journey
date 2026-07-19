//Exception handling is an event that cause program termination. It cause due to user mistake.
//Types of exception.1.Checked exception 2.Unchecked Exception.
//Checked - Exception identified by java compiler,eg -IOException,FileNotFound,InteruptedException. Unchecked - not identified by the java compiler.Airthmatic, 
 //NullPointer.Generally this thype of exception handled by the dev.. It is not catched by the compiler.
//Error - It is of two type - 1.Syntax, 2.logical .These both error occur by the developer mistake.
//Syntax - Writing mistake in the program it can be java syntax of spelling mistake.We can't execute our program.
// Logical Error - It execute the program but the output is not correct.


package ExceptionHandling;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		System.out.println("Entered number is "+num);
		 
		int result = 100/num;
		
		System.out.println("This is the result "+result); //Arithmetic Exception this occur due to num value 0.
		
		
		int numberarr[] = new int[5];
		System.out.println("Enter the position for the array."); //Here we want to assign number at any index of array.
		int pos = sc.nextInt();
		
		System.out.println("Enter the value");
		int value = sc.nextInt();
		numberarr[pos] = value;   //if we enter the value at 5th pos then it show exception ArrayOutOfBoundException.	
		
		
		String s = "545";
		int num2 = Integer.parseInt(s);	//NumberFormatException. Here we try to convert the character into integer value.
		System.out.println("This number is converted from the string value to integer."+num2);
		
		String value1 = null; // NullPointerException
		System.out.println(value1.length()); //when we perform some operation on a null value NullPointerException.
		
		
		
		// TODO Auto-generated method stub

	}

}
