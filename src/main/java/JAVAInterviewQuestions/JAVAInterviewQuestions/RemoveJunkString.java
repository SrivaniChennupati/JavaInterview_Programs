package JAVAInterviewQuestions.JAVAInterviewQuestions;

public class RemoveJunkString {

	public static void main(String[] args) {
		
		String s = "$$$$$$$^^&&&&&Hey Porter, How are you doing ??? 1234546" ;
		
		// we use regular expression [^a-zA-Z0-9]
		
	   s =  s.replaceAll("[^a-zA-Z0-9]","");
	     
	     System.out.println(s);

	}

}
