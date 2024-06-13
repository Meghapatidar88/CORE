package co.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
  
	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\sachin patidar\\Desktop\\Patidar\\serializalion.java");
		  ObjectOutputStream out = new ObjectOutputStream(file);
		  
		  
		  Marksheet m = new Marksheet();
		  m.name = "Megha";
		  m.maths = 80;
		  m.physics = 97;
		  m.Chemistry =71;
		   out.writeObject(m);
		   out.close();
		   out.close();
		   System.out.println("Done");
	}
}
