package practicejava;

class ABC{
	 void m1(int a)
	{
	System.out.println("method with the single variable");
	
	}
	 void m2 () {
		 System.out.println("Method from the ABC");
		}
 
}

class XYZ extends ABC {
	
	void m1(int a,int b)
	{
	System.out.println("method with two variable.");
	
	}
	
	void m2 () {
		System.out.println("Method from the XYZ class.");
	}
}


 class Demo {
	public static void main(String []args)
	{
	 ABC obj = new ABC();
	 obj.m2();
	}

}
