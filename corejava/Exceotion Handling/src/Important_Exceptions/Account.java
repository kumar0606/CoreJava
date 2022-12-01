package Important_Exceptions;

public class Account {
	 private int Acnum;
	private String Acname;
	private double balance;
	public Account(int acnum, String acname, double balance) {
		super();
		Acnum = acnum;
		Acname = acname;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [Acnum=" + Acnum + ", Acname=" + Acname + ", balance=" + balance + "]";
	}
//	public  double deposit (double Amount) {
//		if(Amount<0) {
//			System.out.println(" your deposited invalid amount ");
//			
//		}
//		balance+=Amount;
//		return Amount;
//	}
//	public double withdraw(double Amount) {
//		if(Amount<0) {
//			System.out.println("your entered invalid withdraw amount");
//		}
//		if(balance<0) {
//			System.out.println("insufficient amount");
//		}
//		balance-=Amount;
//		return Amount;
//	}
	public int getAcnum() {
		return Acnum;
	}
	public void setAcnum(int acnum) {
		Acnum = acnum;
	}
	public String getAcname() {
		return Acname;
	}
	public void setAcname(String acname) {
		Acname = acname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
