package IOStreams;

import java.io.*;


public class BufferReader {
	public static void main(String[] args) throws  IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter first number");
		int x=Integer.parseInt(br.readLine());
		System.out.println("enter Second number");
		int y=Integer.parseInt(br.readLine());
		System.out.println("sum: "+(x+y));
	}

}
