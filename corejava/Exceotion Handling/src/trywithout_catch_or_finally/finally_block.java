package trywithout_catch_or_finally;

public class finally_block {
public static void main(String[] args) {
	try {
		
		System.out.println("ravi");
	System.exit(0);//this line of code is used to doesn"t execute the finally block code
	
	int a=10/0;
	System.out.println(a);
	
	}
	catch(Exception e) {
		
		System.out.println("kalavala");
		
		e.printStackTrace();
		//System.exit(0);
		}
	finally {  //after finally block you write a code cant be executed
		System.out.println("kumar");
	
	}
	
}
}
