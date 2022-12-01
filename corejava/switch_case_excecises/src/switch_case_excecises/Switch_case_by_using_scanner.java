package switch_case_excecises;

import java.util.Scanner;

public class Switch_case_by_using_scanner {
	public static void main (String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("calculate weekdays by using numbers");
	int week=Sc.nextInt();
	
	switch (week)
	{ 
	case 1:
		System.out.println("monday");
		break;
	case 2:
		System.out.println("tuesday");
	    break;
	case 3:
		System.out.println("wednesday");
		break;
	case 4:
		System.out.println("thursday");
		break;
	case 5:
		System.out.println("friday");
		break;
	case 6:
		System.out.println("saturday");
		break;
		default:
			System.out.println("in valid output");
			
	
	}
	
	
	}
}
