package co.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class MarksheetBeanExt implements Externalizable {
	String id = null;
	String firstName = null;
	String lastName = null;
	double salary = 0;
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(id);
		out.writeObject(firstName);
		out.writeObject(lastName);
		out.writeDouble(salary);
		
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	id =(String)in.readObject();
	firstName = (String)in.readObject();
	lastName = (String)in.readObject();
	salary =in.readDouble();
		
	}
	

	

}
