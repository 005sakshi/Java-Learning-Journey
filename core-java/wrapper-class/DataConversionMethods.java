package wrapperclasss;

// Wrapper class used to convert the datatype into object. For every primitive data type their is a wrapper class.Wrapper class used in collection and arraylist

//  conversion - String to other data type like - string to integer , string to double, string to boolean,

// conversion =  From other data type to string conversion.


 class otherDataTypeToString
 {  //11this 
	 
	 Boolean s = true;
	 int i = 4543;
	 char c = 'e';
	 double d= 232.4;
	 
 void printing()
	 {
		 
	 System.out.println(String.valueOf(s));
	 System.out.println(String.valueOf(i));
	 System.out.println(String.valueOf(d));
	 System.out.println(String.valueOf(c));
	 
	 
	 }
	 
	
}

public class DataConversionMethods {
	
	   void stringToInteger()
	      {
		   
		String val = "123456987"; //String val = "Welcome"; This can't be convert bz here we trying to convert the character into numerical format.
		int change = Integer.parseInt(val);
		
		System.out.println(change);
	   }
	
	
	    
	   void additionOfValues()
	    {
	    
	    String obj1 = "90";
	    String obj2 = "80";
	    
	    int obj3 = 90;
	    int obj4 = 80;
	    
	    System.out.println( Integer.parseInt(obj1)  + Integer.parseInt(obj2));
	    System.out.println( obj3  + obj4);
	    }
	
	   void stringToBoolean() {
		   
		   
		   String s = "true"; // if we use other than "true" we always get 
		   System.out.println(Boolean.parseBoolean(s));
	   }
	   
	   
	   void stringToDouble()
	   {
		   String d = "10.555";
		   System.out.println(Double.parseDouble(d));
	   }
	
	
	
	public static void main(String args[]) {
		
		DataConversionMethods obj = new DataConversionMethods();
		otherDataTypeToString obj2 = new otherDataTypeToString();
		
		obj2.printing();
		
		obj.stringToInteger();
		
		obj.additionOfValues();
		
		obj.stringToBoolean();
		
		obj.stringToDouble();
		
	}

}
