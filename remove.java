package JUNIT.test;

public class Remove {
	String remove(String input){
		String res = input;
		int l = input.length();
		if(l>=2) {
			if(input.charAt(0) == 'A' && input.charAt(1) == 'A')
				result = result.substring(2);
			else if(input.charAt(0) == 'A' && input.charAt(1) != 'A')
				result = result.substring(1);
			else if(input.charAt(0) != 'A' && input.charAt(1) == 'A')
				res = res.substring(0,1) + res.substring(2);
		}
		else if(l == 1) {
			res = input.charAt(0) == 'A' ? "" : res; 
		}
		return res;
		
	}
}
