	package practicejava;
	
	class Animal{
		
		 int color = 100;	
		int print() {
			System.out.println(color);
			return color;
		}
		

	}
	
	class Dog extends Animal{
		
		int color = 200;
		int print() {
			System.out.println(super.color);
			return color;
		}
	}
	
	
	
	
	public class TestSuper {
	
		public static void main(String[] args) {
			Animal dg = new Animal();
			
			
		System.out.print(dg.print());
	
		}
	
	}
