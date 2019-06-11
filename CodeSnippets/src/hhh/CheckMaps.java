package hhh;

import java.util.HashMap;
import java.util.Map;

public class CheckMaps {
	private Map<String,String> sessionAttributes;
	
	public CheckMaps(Map<String,String> sessionAttributes1){
		sessionAttributes = sessionAttributes1;
		System.out.println(sessionAttributes.get("wwid"));
		
	}

	public static void main(String[] args) {
	
		Map<String,String> m = new HashMap<String,String>();
		m.put("wwid","1");
		new CheckMaps(m);
		
	}

}
