package JAVAInterviewQuestions.JAVAInterviewQuestions;

import java.util.Stack;

public class DecodeStringWalmart {

	public static String main(String[] args) {
		
		String s = "a3bc2y"; // encoded string
		
		String s1="";
		// out put : aaabcbcy : decoded string
		// 3[a]2[bc] : aaabcbc
		
		// Create a number stack and string stack 
		
		int i = 0;
		
	   while (i< s.length()) {
		   
		  char c =  s.charAt(i);
		  
		  if (Character.isDigit(c)) {
			  
			  int count = 0;
			  
			  
		  } else if (c=='[') {
			  
			  
		  } else if (c==']') {
			  
			  
		  }
		  
		  else {
			  
			  s1 = s1+c; 
			  i++;
		  }
		  
		  
		  return s1;
		   
		   
	   }
		
		
		
		
		

	}

}
