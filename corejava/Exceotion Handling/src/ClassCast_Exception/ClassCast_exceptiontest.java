package ClassCast_Exception;

public class ClassCast_exceptiontest {
	public static void main(String[] args) {
		Animal a=new Animal();
		Animal dog=new dog();
		Animal cat=new cat();
		try {
		cat c=(cat)dog;//child to child it gives the class cast exception
//		cat c1=(cat)cat;//same child classes code executed
//		System.out.println("cat");
		}catch(ClassCastException ce) {
			ce.printStackTrace();
		}
		
		System.out.println("class cast exception is handled");
}
}