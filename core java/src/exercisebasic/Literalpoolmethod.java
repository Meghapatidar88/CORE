package exercisebasic;

public class Literalpoolmethod {
public static void main(String[] args) {//exercise page 79 Q= 4
	
	String name = "Sunrays";
	String name1 = new String ("Welcome");//name1 is use new keyword so its always stored in heep memory area
	System.out.println(name+name1);//name is using double quotes so its always stored in literal pool
}
}
