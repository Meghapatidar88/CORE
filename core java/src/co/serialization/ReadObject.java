package co.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\sachin patidar\\Desktop\\Patidar\\serializalion.java");
		ObjectInputStream out = new   ObjectInputStream(file);
		 Marksheet m = (Marksheet)out.readObject();
		   System.out.println(m.name);
		   System.out.println(m.maths);
		   System.out.println(m.physics);
		   System.out.println(m.Chemistry);
		   
		   file .close();
		   out.close();
	}

}
