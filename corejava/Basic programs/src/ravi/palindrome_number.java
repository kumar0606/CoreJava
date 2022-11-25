package ravi;

public class palindrome_number {
	public static void main(String[] args) {
		int number=121;
		int originalnumber=number;
		int reverse=0;
	
while(number!=0) {
	reverse=reverse*10+number%10;
	number=number/10;
	
}
System.out.println(reverse);
if(originalnumber==reverse) {
	System.out.println("this is palindrome number");
}
else {
	System.out.println("this is not palindrome number");
}
}}
