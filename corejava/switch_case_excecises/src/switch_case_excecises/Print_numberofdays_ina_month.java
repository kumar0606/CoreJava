package switch_case_excecises;

import java.util.Scanner;

public class Print_numberofdays_ina_month {
	public static void main (String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("find number of days in a month");
		while (true) { 
			//System.out.println("choose 1 for 31days");
			//System.out.println("choose 2 for 28days :");
		int month=Sc.nextInt();
		switch(month)
		{
		case 1:
			System.out.println("31days");
			break;
		case 2:
			System.out.println("28/29days");
			break;
		case 3:
			System.out.println("31days");
			break;
		case 4:
			System.out.println("30days");
			break;
		case 5:
			System.out.println("31days");
			break;
		case 6:
			System.out.println("30days");
			break;
		case 7:
			System.out.println("31days");
			break;
		case 8:
			System.out.println("31days");
			break;
		case 9:
			System.out.println("30days");
			break;
		case 10:
			System.out.println("31days");
			break;
		case 11:
			System.out.println("30days");
			break;
		case 12:
			System.out.println("31days");
			break;
			default:
				System.out.println("invalid output");
		}
	}

}
}