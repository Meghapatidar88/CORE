package project1;

public class LenearSearch {
	public static int search(int numbers[],int key){
	for(int i =0; i < numbers.length; i++) {
		if(numbers[i] == key) {
	return i;
	}
}
return -1;
}

public static void main(String[] args) {
	int number[]= {2,3,4,5,6,7,8,9,10};
	int key =100;
	int index = search(number,key);
	if (index ==-1) {
	System.out.println("key not found"+key);
	}else {
		System.out.println("key is at index"+key);
	}
}
}
			
	
	








		
	
			

