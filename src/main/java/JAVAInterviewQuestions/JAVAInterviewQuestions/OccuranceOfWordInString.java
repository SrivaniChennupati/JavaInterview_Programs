package JAVAInterviewQuestions.JAVAInterviewQuestions;

public class OccuranceOfWordInString {

	public static void main(String[] args) {

		
		// method 1
		
	 String S = "Test AutomatiISAon ISA interesting job Is A" ;
		
	  String[] stringarray=  S.split("ISA");
	  
	  System.out.println(stringarray.length);
	  
	  System.out.println("*****************************");
	  
	  
	String str=  S.replaceAll("\\s", "");
	
	System.out.println(str);
	
	String searchString = "isa";
	
	int count=0;
	
	 for (int i=0;i<=str.length()-1;i++){
		 
		 if (str.toLowerCase().substring(i).startsWith(searchString)) {
			 
			 ++count;
			 
		 } 
		
		 
	 }
	 
	 System.out.println(count);
    
	
	 
	 
	 

	}

}
