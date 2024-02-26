package JAVAInterviewQuestions.JAVAInterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OccuranceOfVowelsInString {

	public static void main(String[] args) {
	
		
		String s = "your love is sufficient for me" ;
		
		// need to print the occurance of only vowels 
		
		
		char ch[] = s.toCharArray();
		
		Map<String,Integer> vowelsmap = new HashMap<String,Integer>();
		
		vowelsmap.put("a", 0);
		
		vowelsmap.put("e", 0);
		
		vowelsmap.put("i", 0);
		
		vowelsmap.put("o", 0);
		
		vowelsmap.put("u", 0);
		
		for (Character e: ch) {
			
		  if (e == 'a') {
			  
			  vowelsmap.put("a", vowelsmap.get("a")+1 );
			  
		  } else if (e=='e') {
			  
			  vowelsmap.put("e", vowelsmap.get("e")+1 );
			 
		  } else if (e=='i') {
			  
			  vowelsmap.put("i", vowelsmap.get("i")+1 );
		  }
		  
		  else if (e=='o') {
			  
			  vowelsmap.put("o", vowelsmap.get("o")+1 );
		  }
		  
		  else if (e =='u') {
			  
			  vowelsmap.put("u", vowelsmap.get("u")+1 );
		  }
			  
		}
		
		
		for (Entry<String, Integer> e : vowelsmap.entrySet()) {
			
			System.out.println(e.getKey()+".......>" +e.getValue());
		}
		
		 
		
		

	}
	
	
	
     

}
