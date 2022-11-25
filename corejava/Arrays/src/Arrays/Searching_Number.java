package Arrays;

public class Searching_Number {
public static void main(String[] args) {
	int search=6;
	int []a= {10,30,6,0,6,0,5,55};
	
	
	int temp=0;
	int position=0;
	
	for(int i=0;i<a.length;i++) {
		
 	position=i+1;
		if(search==a[i]) {
			
			temp=a[i];
			System.out.println("it is the in the array list "+temp+" at position "+position+"th");
	}
		
			
		}if(search!=temp) {
			System.out.println("it is not in the array list "+search);
			
		
		}
		
	}
 


}
