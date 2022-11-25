package Arrays;

public class FindmaximumNumber {
public static void main(String[] args) {
	int a[]= {2,3,9,7,8,77,789};
	int max=a.length;
	int min=a.length;
	for(int i=0; i<a.length;i++) {
		if(max<a[i]) {
			max=a[i];
		//System.out.println(a[i]);
	}}
	System.out.println(max);
	//System.out.println(max-712); //this is second largest number code
	for(int i=0;i<a.length;i++) {
		//if(min>a[i])
		if(min>a[i]) 
		{
			min=a[i];
			
			
		}
		
	}
	
	System.out.println(min);
	//System.out.println(min+1);//this is second minimum number code
}
}
