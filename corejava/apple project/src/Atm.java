import java.util.Scanner;

public class Atm {
public static void main(String[]args) {
	int balance=1000, withdraw=0, diposit;
	Scanner Sc=new Scanner(System.in);
	while (true) {
		System.out.println("enter 1 for withdraw");
		System.out.println("enter 2 for diposit");
		System.out.println("enetr 3 for balance");
		int m=Sc.nextInt();
		switch(m){
		case 1:
			System.out.println("enetr money to be withdraw");
			withdraw=Sc.nextInt();
			if(balance>=withdraw) {
				balance=balance-withdraw;
				System.out.println("collect your money");
				
			}
			else {
				System.out.println("insufficient balance");
				
			}
			System.out.println(" ");
			break;
		case 2:
			System.out.println("enter money diposited");
			diposit=Sc.nextInt();
			diposit=balance+diposit;
			System.out.println("money is diposited");
		System.out.println(" ");
		break;
		case 3:
			System.out.println("balance :"+balance);
		System.out.println(" ");
		break;
		case 4:
			System.out.println(" ");
			break;
		}
	}
}
}
