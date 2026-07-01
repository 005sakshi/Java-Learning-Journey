package practicejava;

public class PalindromeNumber {
                static String str = "867";
                static String rev ="";
                
                static void number() {
                	 for(int i= str.length()-1; i >= 0; i--)
                	 {
                		 rev += str.charAt(i);
                	 }
                     if(str.equals(rev))
                     {
                    	 System.out.println("The string is matched.");
                     System.out.println(str + " string matched with " +rev);
                     }
                     else
                    	 System.out.println("String doesn't match.");
                }
                
                
	public static void main(String[] args) {
	     number();

	}

}
