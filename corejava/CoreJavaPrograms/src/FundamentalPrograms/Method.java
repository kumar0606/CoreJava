package FundamentalPrograms;

public class Method {
	public String fullName(String firstname,String lastname) {
		return firstname+" "+lastname;
		
	}
	public static void main(String[] args) {
		Method ravi=new Method();
		System.out.println(ravi.fullName(null, null));
	}

}
