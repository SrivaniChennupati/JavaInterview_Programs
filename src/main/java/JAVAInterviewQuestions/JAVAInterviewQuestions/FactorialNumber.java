package JAVAInterviewQuestions.JAVAInterviewQuestions;

public class FactorialNumber {
	
	
	
	
	// fact of 3 = 3*2*1=6
	
	// using non -recursive : using for loop
	
	
	public static int factorial(int num) {
		
		int fact=1;
		
		for (int i=num;i>=1;i--) {
			
			fact=fact*i;
		}
		
		return fact;
		
		
	}
	
	// using recursive: a function is calling itself 
	
	public  static int fact(int num) {
		
		if (num ==0) {
			
			return 1;
		}
		
		
			
			return (num * fact(num-1));
		
	}

	
	

	public static void main(String[] args) {
		
		System.out.println(factorial(6));
     
	}

}
