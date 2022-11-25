package ravi;

import java.util.Scanner;

public class Atm_withdraw_available_balance_in_scannerclass {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter withdraw amount");
		
		int withdrawamount=Sc.nextInt();
		int note500=50;
		int note200=25;
		int note100=30;
		int note50=20;
		int note10=10;
		int coin=19;
		int total=note500*500+note200*200+note100*100+note50*50+note10*10+coin*10;
		System.out.println("total balnce : " +total);
		System.out.println("available balnce : " +(total-withdrawamount));
		if(withdrawamount>=500) {
			 note500=withdrawamount/500;
			withdrawamount=withdrawamount-note500*500;
			System.out.println("note500 : " +note500);
		}
		if(withdrawamount>=200) {
			 note200=withdrawamount/200;
			withdrawamount=withdrawamount-note200*200;
			System.out.println("note200 : " +note200);
		}
		if(withdrawamount>=100) {
			 note100=withdrawamount/100;
			withdrawamount=withdrawamount-note100*100;
			System.out.println("note100 : " +note100);
		}
		if(withdrawamount>=50) {
			 note50=withdrawamount/50;
			withdrawamount=withdrawamount-note50*50;
			System.out.println("note50 : " +note50);
		}
		if(withdrawamount>=10) {
			 note10=withdrawamount/10;
			withdrawamount=withdrawamount-note10*10;
			System.out.println("note10 : " +note10);
		}
		if(withdrawamount>=1) {
			 coin=withdrawamount/1;
			withdrawamount=withdrawamount-coin*1;
			System.out.println("coin : " +coin);
		}
	}

}
