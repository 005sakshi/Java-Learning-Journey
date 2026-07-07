package wrapperclasss.pack2;
import wrapperclasss.pack1.Test1;

public class Test2 extends Test1{

	public static void main(String[] args) {
		
		int x = 100;
		System.out.println("This is my Test 1 class.");
		
		Test2 obj = new Test2();
		obj.m1();
		System.out.println(obj.x);
		System.out.println(x);

	

	}

}
