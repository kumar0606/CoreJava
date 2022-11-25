package Methods;

public class AfterMethods {
	public String fullName(String firstName,String lastName) {
	return firstName+" "+lastName;
	 
	}
	public static void main(String[] args) {
		AfterMethods ravi=new AfterMethods();
		
		System.out.println(ravi.fullName("ravi", "kalavala"));
		System.out.println(ravi.fullName("kuamt", "n"));
	}

}
