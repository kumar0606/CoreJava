package Com.Exceptionhandling;

public class Nested {
	public static void main(String[] args) {
		try {
			
		int a[]= {10,20};
		 try {
		 a[2]=10/0;
		
		//System.out.println(a);
		}
		catch(ArithmeticException b) {
			b.printStackTrace();
			System.out.println("this is Arithmetic eexception 10 can't divided by 0");
		} a[3]=10;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("this is finally block ");
		}
	}

}
