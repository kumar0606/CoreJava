package Filenotfound_exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class File {
	

	

	public static void main(String[] args) {
		try {
			FileReader f =new FileReader("file.r");
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		System.out.println("ravi kumar");
	}

}
