package project1;

public class buffer {
	public static void main(String[]args) {
		StringBuffer sb=new StringBuffer("Vijay");
		sb.append("Dinanath Chauhan");
		System.out.println("Length:"+sb.length());
		System.out.println("Capacity:"+sb.capacity()); 
		System.out.println("Char at"+sb.charAt(2));
		System.out.println("index of:"+sb.indexOf("Dinanath"));
		System.out.println("Replace:"+sb.replace(0, 5,"jay"));
		System.out.println("Reverse:"+sb.reverse());
	}
	

}
