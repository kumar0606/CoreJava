package forloop;

public class Less {
public static void main(String[] args) {
     for(int i=1; i<=5; i++) {
    	 for(int j=i; j<=5; j++) {
    		 System.out.print(i);
    	 }
    	 System.out.println();
     }
     for(int i=4; i>0;i--) {
    	 for(int j=i; j<=5; j++) {
    		System.out.print(i); 
    	 }
    	 System.out.println();
     }
}
}
