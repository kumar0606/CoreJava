package Arrays;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("enter the number");
		int number=S.nextInt();
		
		int org_number=number;
		int reverse=0;
		while(number!=0) {
			reverse=reverse*10+number%10;
			 number=number/10;
			
		}
		System.out.println("reverse number is :"+reverse);
		if(org_number==reverse) {
			
			System.out.println("this is palindrome number");
		}else {
			System.out.println("this is not palindrome numner");
		}
	}
	
	
}
	
	


