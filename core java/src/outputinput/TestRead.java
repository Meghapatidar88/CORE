package co.outputinput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestRead {
	public static void main(String[] args) throws IOException {
		
	FileReader f = new FileReader("C:\\Users\\sachin patidar\\Desktop\\Patidar\\megha.java");
	int ch = f.read();
	while (ch!=-1) {
		System.out.println((char) ch);
		ch = f.read();
		
	}
	f.close();
	
	
	
	
	}
	
	
	

}
