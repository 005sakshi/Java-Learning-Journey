package ExceptionHandling;

public class FinallyBlock {

	 public static void main(String []args) {
		 
		 System.out.println("The program is started.");
		 
		 String s = "Welcome";
		 
		 try {
			 System.out.println(s.length());
		 }
         catch(Exception e) 
		 {
        	System.out.println("Catch block handled exception.");
            System.out.println(e.getMessage());	 
         }
		 finally //This block always execute.Always write after the catch block(Optional). 
		 {
			 System.out.println("You entered into finally block.This finally block always execute.");
		 }
		 
		 
		 }
}
