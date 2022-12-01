package switch_case_excecises;

import java.util.Scanner;

public class atm {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int balance=10000, withdraw=0, diposit;
		while (true) {
			System.out.println("choose 1 for withdraw : ");
			System.out.println("choose 2 for diposit : ");
			System.out.println("choose 3 for balance");
			int n=Sc.nextInt();
			switch(n) {
			case 1:
				System.out.println("enter money to be withdraw");
				withdraw=Sc.nextInt();
				if (balance>=withdraw) {
				balance=balance-withdraw;
				System.out.println("collect your money");
			}
				else {
					System.out.println("insufficient balance");
				}
				System.out.println("  ");
			break;
			case 2:
				System.out.println("diposit");
				diposit=Sc.nextInt();
				balance=balance+diposit;
				System.out.println("successfully diposited ");
				System.out.println(" ");
				break;
			case 3:
				System.out.println("avialable balance "+balance);
				break;
		}
		}			
	}

}
