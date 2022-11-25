package ravi;

import java.util.Scanner;

public class Atm_program_in_scanner_class {
	public static void main(String[] args) {
		
		int balance=10000 , withdraw=0, deposit;
		Scanner Sc=new Scanner(System.in);
		while(true) {
	        System.out.println("Automated teller machine");
	        System.out.println("Bnaking ");
			System.out.println("choose 1 for withdraw");
			System.out.println("choose 2 for deposit");
			System.out.println("choose 3 for check balance");
			System.out.println("choose 4 for exit");
			System.out.println("choose 5 for other operations");
			int m=Sc.nextInt();
			switch(m) {
			case 1:
				System.out.println("enter money to be withdraw : ");
				withdraw=Sc.nextInt();
				if(balance>=withdraw) {
	//withdraw=Sc.nextInt(); (the scanner class gives after "if" condition it gives negative value)
					 balance =balance-withdraw;
					System.out.println("please collect youur money");
				}
				else {
					System.out.println("insufficient balance : ");
				}
				System.out.println(" ");
				break;
			case 2:
				System.out.println("enter money to be deposited : ");
				deposit=Sc.nextInt();
				balance=balance + deposit;
				System.out.println("your money successfully deposited");
				System.out.println(" ");
				break;
			case 3:
				System.out.println("balance : "+balance);
				System.out.println(" ");
				break;
			case 4:
				System.out.println(" ");
			
		}
	}

}}
