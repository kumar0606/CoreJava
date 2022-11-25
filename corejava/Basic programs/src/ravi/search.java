package ravi;

public class search {
	public static void main(String[] args) {
		int search=3
				;
		int a[]= {10,20,30,30,3,03,0};
		
		int temp=0;
		int position=0;
		for(int i=0; i<a.length;i++) {
			 position=i+1;
			if(search==a[i]) {
				temp=a[i];
				System.out.println("in array list"+temp+"position"+position+"th");
			}
		}
		if(search!=0) {
	System.out.println("the number is not in array list"+search);
	}

}
}