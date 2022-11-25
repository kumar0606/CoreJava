package IOStreams;

import java.io.*;

public class FileOutPutStream {
public static void main(String[] args) throws IOException {
	File f=new File("ravi.txt");
	System.out.println(f.createNewFile());
	FileOutputStream fos=new FileOutputStream(f);
	//fos.write(97);
	String s="ravi kumar";
	byte b[]=s.getBytes();
	
	fos.write(b);
	
	fos.close();
	System.out.println("byte value is");
}
}
