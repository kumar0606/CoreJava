package Com.Exceptionhandling;

public class DemoException {
	public static void main(String[] args) {
		int i,j,k=0;
		System.out.println("welcome to exception handling");
		try {
		i=6;
		j=0;
		k=i/j;
		System.out.println(k);
		}
			catch(ArithmeticException r) {
			System.out.println("this is arithemetic exception");
			
		}
		finally {
			System.out.println("kumar");
		}
				System.out.println("hi ravi.............");
		String a[]= {"ravi","kumar","kalavala"};
		System.out.println(a[5]);
		
	}
}
