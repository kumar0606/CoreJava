package Important_Exceptions;

public class AccountTest {
	public static void main(String[] args) {
		Account a1=new Account(111, "sbi", 200.00);
		Account a2=new Account(222, "icici", 300.00);
		Account a3=new Account(333, "axis", 400.00);
		Account a4=new Account(444, "canara", 500.00);
		int a=111;
		Account ac[] ={a1,a2,a3,a4};
		Account result=null;
		for (Account acc : ac) {
		if(acc.getAcnum()==a) {
			result=acc;
		System.out.println(result);
		}
		}	
		if(result==null)	{
			//System.out.println("enter a person valid account number "+a);
			throw new invalidaccountnumException("enter a person valid account number ");
		}
	

}
}