package ravi;

import java.util.Scanner;

public class Scanner_class {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter four numbers");
		int a=Sc.nextInt();
		float b=Sc.nextFloat();
		double c=Sc.nextDouble();
		int d=Sc.nextInt();
		System.out.println(a+b+c+d);
}}