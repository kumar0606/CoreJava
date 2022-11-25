package Arrays;



public class Arrays_class {
public static void main(String[] args) {
	String[] countwinsLoss= {"wins" , "lose" , "wins" , "wins" , "lose" , "wins"};
	int wins=0; 
	int lose=0;
	for(int i=0; i<countwinsLoss.length; i++) {
		if(countwinsLoss[i].equals("wins")) {
			 wins++;
		}
		else{
			lose++;
		}
		
	}
	System.out.println(wins);
	System.out.println(lose);
}
}
