package Important_Exceptions;

public class Bank {
 private int accountnumber;
 private String bankname;
 private double balance;
public Bank(int accountnumber, String bankname, double balance) {
	super();
	this.accountnumber = accountnumber;
	this.bankname = bankname;
	this.balance = balance;
}
@Override
public String toString() {
	return "Bank [accountnumber=" + accountnumber + ", bankname=" + bankname + ", balance=" + balance + "]";
}
 public double deposit(double amount) {
	 try {
	 if(amount<=0) {
		 System.out.println("you entered  deposit insufficient amount");
//		 throw new IllegalArgumentException("you entered insufficient amount");
	 }
	 }catch(IllegalArgumentException il) {
		 throw new IllegalArgumentException("you entered insufficient deposit amount");		
	
	 }
	 
	 balance+=amount;
	 return amount;
 }
 public double withdraw(double amount) {
	try { 
		if(amount<=0) {
		 System.out.println("you entered insufficient withdraw amount");
	}}catch(IllegalArgumentException il) {
		 throw new IllegalArgumentException("you entered insufficient withdraw amount please check the balance");
	}
	  balance-=amount;
	 return amount;
 }
 public double balance(double amount) {
	 if(balance<=0) {
		 System.out.println("insufficient amount");
		 throw new IllegalArgumentException("insufficient amount");
	 }
	 balance-=amount;
	 return amount;
 }
public int getAccountnumber() {
	return accountnumber;
}
public void setAccountnumber(int accountnumber) {
	this.accountnumber = accountnumber;
}
public String getBankname() {
	return bankname;
}
public void setBankname(String bankname) {
	this.bankname = bankname;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
 
}
