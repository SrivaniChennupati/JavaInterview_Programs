package JAVAInterviewQuestions.JAVAInterviewQuestions;

public class swap2strings {

	public static void main(String[] args) {
	
		
		String a = "hello";
		
		String b = "world";
		
		// reverse of strings
		
		a = a+b;
		
		System.out.println(a);// now a becoms helloworld 
		
		b = a.substring(0,a.length()-b.length()); // b becomes hello
		
		System.out.println(b);
		
		//a= a.substring(a.length()-b.length());
		
		a=a.substring(b.length());
		
		
		System.out.println(a);
		
		

	}

}
