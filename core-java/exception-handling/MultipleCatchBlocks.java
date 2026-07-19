package ExceptionHandling;

public class MultipleCatchBlocks {

	public static void main(String []args)
	{
		System.out.println("Progrma is started.");
		
		String s = null;
		
		try {
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Handle Exception..");
			System.out.println(e.getMessage()); //Get message is part of this exception classes.
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Handle Exception..");
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Handle Exception..");
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Handle Exception.."); //This catch block only execute only when their is AirthmeticException in the code.
		    System.out.println(e.getMessage());
		}
		catch(Exception e)//to limit the exception use.
		{
		System.out.println("If we are not using the type of exception or to reduce the defining particular exception we use this block..");
		}
	}
}
