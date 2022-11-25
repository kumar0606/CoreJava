package ravi;

public class Atm_withdraw_and_availabale_balance {
	
	public static void main(String[] args) {
		int withdrawamount=19852;
		int note500=50;
		int note200=25;
		int note100=20;
		int note50=10;
		int note10=6;
		int note20=5;
		int coin5=3;
		int coin1=2;
		int total=note500*500+note200*200+note100*100+note50*50+note10*10+note20*20+coin5*5+coin1*1;
		System.out.println("total amont : "+total);
		System.out.println("avilable balance : " +(total-withdrawamount));
		
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
		if(withdrawamount>=1) {
			coin1=withdrawamount/1;
			withdrawamount=withdrawamount-coin1*1;
			System.out.println("coin1 : "+ coin1);
		}
	}

}
