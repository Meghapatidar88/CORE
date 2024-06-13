package co.outputinput;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadKeyboard {
	
	public static void main(String[] args)throws Exception{
		InputStreamReader isReader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isReader);
		
		PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\sachin patidar\\Desktop\\Patidar\\patidar.java.txt"));
		
				String line = in.readLine();
	while (!line.equals("quit")) {	
		out.println(line);
		line = in.readLine();
		
	}
	out.close();
	in.close();
	
	

}}
