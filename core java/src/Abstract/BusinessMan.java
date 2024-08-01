package Abstract;

public class BusinessMan implements RichMan,SocialWorker{

	@Override
	public void helpToOthers() {
		System.out.println("help to other");
		
	}

	@Override
	public void earnMoney() {
		System.out.println("erning money");
		
	}

	@Override
	public void donation() {
		System.out.println("donation to other");
		
	}

	@Override
	public void party() {
		System.out.println("doning party");
		
	}
	

}
