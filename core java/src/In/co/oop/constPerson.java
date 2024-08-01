package In.co.oop;

public class constPerson {
	
	private String name;
	private String adress;
	private String city;
		
	public constPerson(String name,String adress,String city) {
		this.name =name;
		this.adress =adress;
		this.city = city;}
    public constPerson () {
		System.out.println("i'm default");}
		
		public String getName() {
		return name;
		}
		public  String getAdress() {
			
		return adress;}
		
		public String getCity() {
			return city ; }
		
		
		
		
	

public static void main(String[]agrs) {
	constPerson Z = new constPerson("sachin", "kurawar" ,"indore");
	   System.out.println(Z.getName()+Z.getAdress()+Z.getCity());
	
	
	
}}
	
	


