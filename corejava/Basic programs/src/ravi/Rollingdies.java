package ravi;

import java.util.Random;

public class Rollingdies {
	public static void main(String[] args) {
		Random Ravi = new Random();
		int a= Ravi.nextInt(6)+1;
		Random Pawan=new Random();
		int b= Pawan.nextInt(6)+1;
		Random Mani= new Random();
		int c= Mani.nextInt(6)+1;
		Random Satya=new Random();
		int d= Satya.nextInt(6)+1;
		
		System.out.println("ravi rolled a : "+a);
		System.out.println("pawan rolled a : "+b);
		System.out.println("mani rolled a : "+c);
		System.out.println("satya rolled a : "+d);

	
	}

}
