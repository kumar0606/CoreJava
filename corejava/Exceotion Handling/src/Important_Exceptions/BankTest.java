package Important_Exceptions;

public class BankTest {
public static void main(String[] args) {
	Bank b=new Bank(111, "sbi", 300.00);
	Bank b1=new Bank(112, "icici", 400.00);
	Bank b2=new Bank(113, "canara",500.00);
    Bank bb[]= {b,b1,b2};
    for (Bank bank : bb) {
    	
    	
    	//b.deposit(0);
    	//
//    	b2.withdraw(0);
//		System.out.println(b2);
		
				
	}
 
 //b.deposit(0.0);
 //
    b.withdraw(0.0);
// b.balance(0);
    System.out.println(b);
}

}
