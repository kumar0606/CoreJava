package Arrays;

import java.util.Arrays;

public class Replacingthenumber {
public static void main(String[] args) {
	int a[]= {10,30,40,60,80,90};
	int temp=a[2];
	a[2]=a[4];
	a[4]=temp;
	//for(int b:a) {
		System.out.println(Arrays.toString(a));
	
	//System.out.print(b+" ");
	
}}
//}
