package Numberformat_Exception;

public class Numberformat {
public static void main(String[] args) {
	
	String s="ravi";
	try {		
		int i=Integer.parseInt(s);
		System.out.println("int value: "+i);
		}
		catch(NumberFormatException n) {
			n.printStackTrace();
			System.out.println("String does not converted into integer");
			
		}
}
}
