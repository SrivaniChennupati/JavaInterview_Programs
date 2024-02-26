package JAVAInterviewQuestions.JAVAInterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Duplicatecharinstring {

	public static void main(String[] args) {
	
		String s = "When life gives you lemons, make lemonade" ;
		
		char[] chararry= s.toCharArray();
		
		/*
		 * for(char e : chararry) {
		 * 
		 * System.out.println(e);
		 * 
		 * }
		 */
		
		
	    Map<Character,Integer> map1= new HashMap<Character,Integer>();
	    
	    for (char e : chararry) {
	    	
	    	Integer count = map1.get(e);
	    	
	    	if (count == null) {
	    		
	    		map1.put(e, 1);
	    	}
	    	
	    	else {
	    		
	    		map1.put(e, ++count);
	    	}
	    }
	    
	    for (Entry<Character, Integer> e : map1.entrySet()) {
	    	
	    	
	    	
	    	
	    	
	    	}
	    		
	    		
	    }
		
		

	}


