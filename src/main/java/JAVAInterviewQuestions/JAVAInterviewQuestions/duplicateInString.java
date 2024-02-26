package JAVAInterviewQuestions.JAVAInterviewQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class duplicateInString {

	public static void main(String[] args) {
		
		String names[] = {"java","python","Ruby","Shellscript","java"};
		
		// Method 1 
		
		
		for (int i=0;i<=names.length-1;i++) {
			
			for (int j=i+1;j<=names.length-1;j++) {
				
				if (names[i].equals(names[j])) {
					
					System.out.println(names[i]);
				}
				
				
			}
		}
		
		
		
		Set<String> namestoset = new HashSet<String>();
		  
		  for (String name: names) {
			  
			  if(namestoset.add(name)==false) {
				  
				  System.out.println(name);
			  }
		  }
		  
		  // method 3 using hashmap
		  
		  
		  Map<String,Integer> map = new HashMap<String,Integer>();
		  
		  for (String name: names) {
			  
			 Integer count= map.get(name);
			 
			 if (count==null) {
				 
				 map.put(name, 1);
			 }
			 
			 else {
				 
				 map.put(name, ++count);
			 }
			 
			 
		  }
		  
		  for (Entry<String, Integer> namesmap:map.entrySet()) {
			  
			  if (namesmap.getValue()>1) {
				  
				  System.out.println(namesmap.getKey());
			  }
		  }

	}
	
	 // method 2 using set // Creating a set 
	
	  
     
}
