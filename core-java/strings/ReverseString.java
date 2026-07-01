package practicejava;

class Method{
	 static String str = "Hello";
	static String rev = "";
	static void string()
	 {
		 int i;
		 for (i= str.length()-1 ; i>=0 ; i--)
		 {
			 rev+= str.charAt(i);
		 }
	 }
}





public class ReverseString {

	
	
	public static void main(String[] args) {
	         Method.string();
       System.out.println("String character before reversing "+Method.str);
       System.out.println("String character After reversing "+Method.rev);
      
	}

}
