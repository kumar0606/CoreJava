package ravi;

public class Atm_money_count {
    public static void main(String[] args) {
    	int amount=19652;
    	if(amount>=500) {
    		int note500=amount/500;
    		amount= amount-(note500*500);
    		System.out.println("note 500 :"+note500);
    	}
    	if(amount>200) {
    		int note200=amount/200;
    		amount=amount-(note200*200);
    		System.out.println("notes 200 :"+note200);
    	}
    		if(amount>=100) {
    			int note100=amount/100;
    			amount=amount-(note100*100);
    			System.out.println("notes 100 : "+note100);
    		}
    		if(amount>=50) {
    			int note50=amount/50;
    			amount=amount-note50*50;
    			System.out.println("note 50 : "+note50);
    		}
    		if(amount>=1) {
    			int note1=amount/1;
    			amount=amount-note1*1;
    			System.out.println("note1 : "+note1);
    		}
    	}
	
}

