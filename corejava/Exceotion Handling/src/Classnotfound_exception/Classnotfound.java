package Classnotfound_exception;

public class Classnotfound {
	public static void main(String[] args) {
		try {
			Class.forName("Com.Exceptionhandling.copy.Classnot");
			System.out.println("file is presented in your system");
 //in class not found exception packagename.classname its  both are same does not give any exception
 //but if any letter miss in package or class it gives Class not found exception		
		} catch (ClassNotFoundException e) {
			System.out.println("file is not presented in your system");
			e.printStackTrace();
			
		}
		
		
	}

}
