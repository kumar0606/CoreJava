package Customized_Exception;

public class Tooyoungtest {
	
		public static void main(String[] args)  {
	int age=12;
	if(age<18) {
	throw new TooyoungException("your is too young wait some more time for your marriage  ");
	}
	else if(age>60){
	throw  new TooOldException("your is very old your marraige time aleady gone enthavaraku eam peekav");
	}
	else {
	System.out.println("your successfully registred");
	}
		
		
		
	}
}
