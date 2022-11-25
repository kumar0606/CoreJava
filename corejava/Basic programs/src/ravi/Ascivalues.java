package ravi;

import java.util.Scanner;

public class Ascivalues {
	public static void main(String[] args) {
		for(int i=0;i<=122;i++) {
			System.out.println(i+" "+(char)i);
		}
		char ch;
			System.out.println("enter the character");
			
		Scanner Sc=new Scanner(System.in);
	ch=Sc.next().charAt(0);
    int a=ch;
	System.out.println("Ascivalue of "+ch+" is: "+a);
			
		//characters converted into Ascivalues
//		String s="kumar";
//		byte b[]=s.getBytes();
//		for(int i=0;i<b.length;i++) {
//			System.out.println(b[i]+" "+s.charAt(i));
//}
//		
//		for (byte c : b) {
//			System.out.println(c);		
	//}
	

}
}