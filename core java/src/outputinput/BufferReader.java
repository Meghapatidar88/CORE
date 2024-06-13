package co.outputinput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
	 public static void main(String[] args) throws IOException {
		
		FileReader file =new FileReader("C:\\Users\\sachin patidar\\Desktop\\Patidar//megha.java"); 
		
	  BufferedReader in = new BufferedReader(file);
		String line = in.readLine();
		 
		while(line!=null) {
			System.out.println(line);
			line = in.readLine();
			
		}
				
		in.close();		
	 }

}
