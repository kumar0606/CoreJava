package Com.Exceptionhandling;

public class Array_Exception {
	public static void main(String[] args) {
		try {
		int ar[]= {4,6};
		try {
 //this is nested try block we can write two try blocks this is used to print the two exceptions
 // we cant write nested try blocks only one exception is printed
 // one try block we can write many catch blocks but 
 // one try block we can write only one finally blocks			
		ar[3]=6/0;
		}catch(ArithmeticException a) {
			a.printStackTrace();
		}
		ar[3]=6;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		
	}		
}
