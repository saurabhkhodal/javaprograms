package WrappperClass;

public class WrapperClass {
public static void main(String[] args) {
	
	char ch = 'd';
	
	//Autoboxing: directly assigning the value of the char to character. It automatically gets assigned
	
	Character a = ch;
	
	//Unboxing: Here compiler auto assign Wrapper object to the primitive data type
	char c = a;
	
	
	//byte data type
	byte b  =1;
	Byte byteobj = new Byte (b);     //method 1
    Byte byteObj = Byte.valueOf(b);  //method 2
    Byte B = b;                      //method 3
    
    System.out.println(byteobj.compareTo(byteObj));
    
    //Integer data type
    int i = 1;
    Integer intobj = new Integer(i);
    Integer intObj = Integer.valueOf(i);
    Integer I = i;
    
    //String to Integer
    String s1 = "25";
    String s2 = "40";
    System.out.println(s1+s2);
    System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
    
    //int, double, bool, char ------String
    
    int x =10;
    double d = 12.5;
    char s = 'm';
    boolean g = true;
    
    System.out.println(String.valueOf(x));
    System.out.println(String.valueOf(g));
    System.out.println(String.valueOf(s));
    System.out.println(String.valueOf(d));
    
    
    
 
    
    
    
	
	
	
}

	
	
}
