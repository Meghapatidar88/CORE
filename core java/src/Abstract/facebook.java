package Abstract;

public class facebook implements Whatsaap,Insta{

	@Override
	public void profile() {
		System.out.println("Profile is mine");
	}

	@Override
	public void reel() {
	System.out.println("reel is good");
		
	}

	@Override
	public void video() {
		System.out.println("video quality is good");
		
	}

	@Override
	public void chatpage() {
		System.out.println("chat clear");
		
	}
	

}
