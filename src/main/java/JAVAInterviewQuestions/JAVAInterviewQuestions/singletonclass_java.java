package JAVAInterviewQuestions.JAVAInterviewQuestions;

public class singletonclass_java {
	
	
	// Create a private constructor
	//create a static method "getInstance()" that returns obj of  single ton class
	
	
	// creating a variblae 
	
	private static singletonclass_java singletonvariable= null; // imitially object reference pointed to null
	
	
	String str;
	
	private singletonclass_java() {
		
		str = "This is Srivani";
	
	}
	
	
	
	public static singletonclass_java getInstance() {
		
		if (singletonvariable==null) {
			
			singletonvariable = new singletonclass_java();
		}
		return singletonvariable;
	}

	public static void main(String[] args) {
		
		singletonclass_java x= singletonclass_java.getInstance();
		
		singletonclass_java y=singletonclass_java.getInstance();
		
		System.out.println((x.str).toUpperCase());
		
		System.out.println((y.str).toUpperCase()); // now y also points to the same  object
		
		

	}

}
