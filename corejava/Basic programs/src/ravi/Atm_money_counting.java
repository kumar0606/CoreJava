package ravi;

public class Atm_money_counting {
	public static void main(String[] args) {
		  int amount = 19651;
	      int note500=50;
		  int note200=20;
		  int note100=10;
		  int note50=5;
		  int note10=5;
		  int note1=2;
		  int total=note500*500+note200*200+note100*100+note50*50;
			System.out.println("total amount : " +total);
			System.out.println("availabale balance : " +(total-amount));
		
		if(amount>=500) {
			 note500=amount/500;
			amount=amount-note500*500;
		    System.out.println("note 500 : "+note500);
		}
		if(amount>=200) {
			  note200=amount/200;
			amount=amount-note200*200;
			System.out.println("note 200 : "+note200);
		}
		if(amount>=100) {
			 note100=amount/100;
			amount=amount-note100*100;
		System.out.println("note 100 :" +note100);
		}
		if(amount>=10) {
		 note10=amount/10;
			amount=amount-note10*10;
			System.out.println("note 10 :"+note10);
	}
		if(amount>=1) {
			 note1=amount/1;
			amount=amount-note1*1;
			System.out.println("note 1 :"+1);
		}
			}
}
