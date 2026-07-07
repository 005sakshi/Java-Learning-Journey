package wrapperclasss;



//Access modifiers define where is the scope of the method, classes and variables.There are four type - 1.Public -> Protected -> 3.Default -> 4.Private
// Public can we access outside the package , public keyword is used. Protected - outside the package but by inheritance,protected keyword used . Default -
//within the package. No keyword used. Private - within the class.
//Type of class - user define 2. Built in - Here to access build in classes we need to import the class in which package it is present.For example If there is any 
// any class that is present in another package then we have to define Packagename.classname;
// How to create sub package - Packagename.subpackagename.classname.






public class AccessModifire {
	 
	private int x = 100;
	
	private void m1() 
	{
		System.out.println("This is my message.");
	}
	
	
	
	public static void main(String []args) {
		
		AccessModifire obj = new AccessModifire();
		obj.m1();
		System.out.println(obj.x);
		
		
		
		
		
	}

}
