package Arrays;

public class Find_min_number {
public static void main(String[] args) {
	int a[]= {120,300,220,560,410,22,33};
	int min=a.length;
	for(int i=0; i<min; i++) {
		if(min>a[i]) {
			min=a[i];
		}
	}
	System.out.println(min);
}
}
