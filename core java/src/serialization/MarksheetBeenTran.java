package co.serialization;

import java.io.Serializable;

public class MarksheetBeenTran implements Serializable {
	String name =null;
	int maths =0;
	int physics =0;
	int chemistry =0;
	
	transient int total =0;
	transient double percentage =0; //ye run nhi hoga kyuki ye transiat h

	

}
