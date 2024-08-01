package co.outputinput;

import java.io.FileWriter;
import java.io.IOException;

public class whiteFile {
	public static void main(String[] args) throws IOException {
		
		FileWriter out = new FileWriter("C:\\Users\\sachin patidar\\Desktop\\Patidar//io.input");
	out.write('A'); //direct yahi se file bana sakte h
	out.write('\n');//new line character
	out.write("This is line one");
	out.write("This is line two");	
	out.close();
	System.out.println("Check f:/newtest.txt");
				
				
				
	}

}
