package switch_case_excecises;

import java.util.Scanner;

public class Customercare_language_selections {
	public static void main(String[] args) {
		System.out.println("language selections in customer care");
		Scanner Sc=new Scanner(System.in);
		
		 while(true) {
			 System.out.println("choose 1 for telugu");
			 System.out.println("choose 2 for english");
			 System.out.println("choose 3 for hindi");
		 int languages=Sc.nextInt();
		switch (languages)
		{
		case 1:
			System.out.println("telugu");
			break;
		case 2:
			System.out.println("english");
			break;
		case 3:
			System.out.println("hindi");
			break;
			default:
				System.out.println("invalid output");
				
		}
		
		
				
	}

}}
