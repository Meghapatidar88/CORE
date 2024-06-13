package co.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class EmailValidator {
	
	public static void main(String[] args) {
		
		List<EmailTask> t = new ArrayList<>();
		t.add( new EmailTask("meghapatidar9066@gmail.com"));
		t.add( new EmailTask("Himanshi98j@gmail.com"));
		t.add( new EmailTask("raman45@gmail.com"));
		t.add( new EmailTask("Shailja908gmail.com"));
		t.add( new EmailTask("nehw35yjgmail.com"));
		
		String gmailPattern = "^[A-Za-z0-9+_.-]+@gmail\\.com$";
		
		Pattern pattern = Pattern.compile(gmailPattern);
		
		t.stream().map(e->e.email)
		    .filter(e -> pattern.matcher(e).matches()&& e.substring(0,e.indexOf('@')).matches(".*\\d.*"))
		    .distinct().collect(Collectors.collectingAndThen(Collectors.toList(),e-> {
		    	Collections.shuffle(e);
		    	return e.stream();
		    })).forEach(e-> {
		    	System.out.println("Valid gmail is : "+ e);
		    	
		    });
		
	}

}
