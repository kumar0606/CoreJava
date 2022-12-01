package Filenotfound_exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("kumar.txt");
		try {
			System.out.println(f.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FileInputStream fis=new FileInputStream(f);
		
	
	int i=0;
	try {
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
			
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
