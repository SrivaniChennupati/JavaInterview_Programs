package JAVAInterviewQuestions.JAVAInterviewQuestions;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println(isprimenumber(23));
		
		getNumbers(7);
       

	}
	
	
	public static boolean isprimenumber(int num) {
		
		for (int i=2;i<num;i++) {
			
			if (num % i ==0 ) {
				
				return false;
				
				
			}

			}
	  return true;
	
	

	}
	
	public static void getNumbers(int num) {
		
		for (int i=2;i<=num;i++) {
		
		if (isprimenumber(i)) {
			
		    System.out.println(i);
		}
	}
	
	
	}

}
