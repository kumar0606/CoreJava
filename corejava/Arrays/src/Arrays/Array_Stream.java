package Arrays;

import java.util.Arrays;

public class Array_Stream {
	public static void main(String[] args) {
		int ar[]= {12,3,45,2,1,447,37};
		System.out.println(Arrays.stream(ar).max());
		System.out.println(Arrays.stream(ar).min());
		System.out.println(Arrays.stream(ar).sum());
		System.out.println(Arrays.stream(ar).average());
		System.out.println(Arrays.stream(ar).max());
	}

}
