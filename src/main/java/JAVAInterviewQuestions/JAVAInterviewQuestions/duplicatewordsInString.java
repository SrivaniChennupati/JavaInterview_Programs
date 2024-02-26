package JAVAInterviewQuestions.JAVAInterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class duplicatewordsInString {
	
	// Java is a best Java Language is Java Python
	
	
	public static void duplicatewords(String input) {
		
		String words[]=input.split(" ");
		
		Map<String, Integer> wordsmap = new HashMap<String,Integer>();
		
		for ( String word: words) {
			
			Integer count=wordsmap.get(word);
			
			if (count == null) {
				
				wordsmap.put(word, 1);
			}
			
			else {
				
				wordsmap.put(word, ++count);
			}
			
			
		}
		
		for (Entry<String,Integer> map:wordsmap.entrySet()) {
			
			  if( map.getValue()>1)
				  
				  System.out.println("Duplicated Word is::::"+map.getKey()+":::"+map.getValue());
		}
		
		
		
	}
	
	
	
	

	public static void main(String[] args) {
	
		duplicatewords("Java is a best Java Language is Java Python");
	}

}
