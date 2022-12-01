package If_else_excersises;

import java.util.Scanner;

public class Customercare_language_selection {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("find out the language byusing number in scanner calss");
		//System.out.println("choose 1 for telugu");
		
		int languages=Sc.nextInt();
		if(languages==1) {
			System.out.println("telugu");
		}
		else if(languages==2) {
			System.out.println("english");
		}
		else if(languages==3) {
			System.out.println("hindi");
		}
		else {
			System.out.println("invalid output");
		}
	}

}
