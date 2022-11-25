package FundamentalPrograms;

public class palindrome {
public static void main(String[] args) {
	int number=1222221;
	int reversenumber=number;
	int reverse=0;
	while(number!=0) {
		reverse=reverse*10+number%10;
		number=number/10;
	}
	System.out.println(reverse);
	if(reversenumber==reverse) {
		System.out.println(reverse+":this is palindrome number");
	}else {
		System.out.println(reverse+":this is not palindrome number");
	}
	int a[]= {1,2,3,4,5,6,7,8,9};
	int max=a.length;
	int min=a.length;
	for(int i=0;i<a.length;i++) {
		if(max<a[i]) {
		max=a[i];

}
		if(min>a[i]) {
			min=a[i];
		}
	}
	System.out.println(max);
	System.out.println(min);
	
}
}
