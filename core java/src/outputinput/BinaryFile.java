package co.outputinput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFile {
	public static void main(String[] args) throws IOException {
		
		String source ="C:\\Users\\sachin patidar\\Desktop\\Patidar\\image09.jpg";
		String target = "C:\\Users\\sachin patidar\\Desktop\\Patidar\\kumari.jpg";
		
		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(target);
		
		int ch = in.read();
		while (ch!=-1) {
			out.write(ch);
			ch=in.read();
			
		}
		in.close();
		in.close();
		System.out.println("done");
		
		
	}

}
