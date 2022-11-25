package IOStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FilInputStream {
public static void main(String[] args) throws FileNotFoundException {
	File f=new File("kumar.txt");
	try {
		System.out.println(f.createNewFile());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	FileInputStream fis =new FileInputStream(f) ;
		int i=0;
		try {
			while((i=fis.read())!=-1) {
				System.out.println((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	//this line of code is used to read the single byte
//	try {
//		int i=fis.read();
//		System.out.println((char)i);
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//		
//	}
	
} 
}
