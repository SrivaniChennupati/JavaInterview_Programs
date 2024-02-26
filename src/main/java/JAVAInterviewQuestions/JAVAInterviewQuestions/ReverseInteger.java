package JAVAInterviewQuestions.JAVAInterviewQuestions;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int num = 12345;
		int rev = 0;
		
		while (num !=0) {
			
		rev=rev*10+num%10; // using % w will get lst element 
		
		num = num/10; // using / u will get the entire number except last element
		
		}
		 
		System.out.println(rev);
				
	    
				
	

	}

}
