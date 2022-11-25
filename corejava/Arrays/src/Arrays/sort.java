package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class sort {
	public static void main(String[] args) {
		
	
	int a[]= {1,3,6,0,5,0,5,9,7,6,4};
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	String n[]= {"ravi","kumar","pawan","dileep","mani","sai"};
	Arrays.sort(n);
	System.out.println(Arrays.toString(n));
	double d[]= {20.0,32.1,66.5,11.5,2.1,3.2,33.3,0.0};
	Arrays.sort(d);
	System.out.println(Arrays.toString(d));
	Integer a1[]= {1,3,6,0,5,0,5,9,7,6,4};
	Arrays.sort(a1,Collections.reverseOrder());
	
	//api method
	
   int b[]= {11,22,66,88,44,66,33,77,2,6,1};
   for(int i=0;i<b.length;i++) {
	   for(int j=i+1;j<b.length;j++) {
		   if(b[i]>b[j]) {
			   int temp=b[i];
			   b[i]=b[j];
			   b[j]=temp;
		   }
		  
	   }System.out.println(b[i]);
   }
}
}