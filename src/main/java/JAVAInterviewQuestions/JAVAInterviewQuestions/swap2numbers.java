package JAVAInterviewQuestions.JAVAInterviewQuestions;

public class swap2numbers {

	public static void main(String[] args) {
		
		
		int x = 3434;
		
		int y = 6253;
		
		int t;
		
		
		// method 1 using temporary variable 
		
		t = x;
		
		x=y;
		
		y=t;
		
		System.out.println(x);
		System.out.println(y);
		
		// method 2 : without using temperpry variable 
		
		
		System.out.println("**************************");
		
		x = x+y;
		y=x-y;
		x=x-y;
		
		System.out.println(x);
		System.out.println(y);
		
		
		System.out.println("**************************");
		
		
		// method 3 : without using temperpry variable using multiply operator
		
		x= x*y;
		y=x/y;
		x=x/y;
		System.out.println(x);
		System.out.println(y);
		
	}

}
