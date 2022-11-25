
public class Encapsulation {
	private String bankname="SBI";
	private String branchname="PALAKONDA";
	private String accountnumber;
	private String accountholdername;
	private double accountbalance;
	
	public Encapsulation(String accountnumber, String accountholdername, double accountbalance) {
		super();
		
		if(accountnumber.length()==10) {
			this.accountnumber = accountnumber;
			this.accountholdername = accountholdername;
			this.accountbalance = accountbalance;
		
			System.out.println("valid account number");
			System.out.println("please continue your transactions");
		}
		else{
			System.out.println("invalid account number");
			System.out.println("please enter valid account number");
		}
		
	
	
	}
public void displaydata() {
	System.out.println("*****ACCOUNT DETAILS*****");
	System.out.println("BANK NAME: "+bankname);
	System.out.println("BRANCH NAME: "+branchname);
	System.out.println("ACCOUNT NUMBER:"+accountnumber);
	System.out.println("ACCOUNT HOLDER NAME:"+accountholdername);
	System.out.println("ACCOUNT BALANCE:"+accountbalance);
}
public String getAccountnumber() {
	return accountnumber;
}
public void setAccountnumber(String accountnumber) {
	this.accountnumber = accountnumber;
}
public String getAccountholdername() {
	return accountholdername;
}
public void setAccountholdername(String accountholdername) {
	this.accountholdername = accountholdername;
}
public double getAccountbalance() {
	return accountbalance;
}
public void setAccountbalance(double accountbalance) {
	this.accountbalance = accountbalance;
}

}
