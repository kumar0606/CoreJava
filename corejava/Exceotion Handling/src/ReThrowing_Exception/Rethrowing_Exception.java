package ReThrowing_Exception;



public class Rethrowing_Exception {
	public static void main(String[] args) {
		try {
		int result=10/0;
		System.out.println(result);
		}
		catch(ArithmeticException a) {
			a.printStackTrace();
			throw new NullPointerException();
		}
	}

}
