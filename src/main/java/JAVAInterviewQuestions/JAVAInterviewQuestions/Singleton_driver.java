package JAVAInterviewQuestions.JAVAInterviewQuestions;

public class Singleton_driver {
	
	
	private static Singleton_driver singletondriver = null;
	
	private Singleton_driver() {
		
		
	}
	
	
	public static Singleton_driver getInstance() {
		
		if (singletondriver==null) {
			
			singletondriver = new Singleton_driver();
		}
		
		return singletondriver;
	}
	
	
	public void openBrowser() {
		
		
	}

	public static void main(String[] args) {
		

	}

}
