package JAVAInterviewQuestions.JAVAInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class Practice {

	public static void main(String[] args) {
		
	  
		String s = "I love coding java";
		
		int count=0;
		
		char[] ch=s.toCharArray();
		
		for (Character e : ch) {
			
			if (e=='a') {
				
				count++;
			}
			
		}
		
		System.out.println(count);
		
	}
}
