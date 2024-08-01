package project1;

public class LenearString {
	public static int search(String name [],String colour){
		for (int i=0; i<name.length; i++) {
			if(name[i]==colour) {
				return i;
		
		
		
	}
}
	
	return -1;
	}

	public static void main(String[] args) {
		
		String name[]= { "Blue","Red","Black","White","Gray" };
		String colour ="Gray";
		int index = search(name , colour);
		if (index ==-1) {
		System.out.println("colour not found"+colour);
		}else {
			System.out.println("colour is at index"+index);//index ki jagah colour likh sakte h
		}
	}
	
	
	}
				

	
				


