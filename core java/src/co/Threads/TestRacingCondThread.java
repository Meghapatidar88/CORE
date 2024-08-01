package co.Threads;

public class TestRacingCondThread {
	public static void main (String[]args) {
		RacingCondThread  t1 = new RacingCondThread ("megha");
		RacingCondThread  t2 = new RacingCondThread  ("Patidar");
		t1.start();
		t2.start();
		
	}

}
