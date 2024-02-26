package JAVAInterviewQuestions.JAVAInterviewQuestions;

public class ReverseOfString {

	public static void main(String[] args) {
		
		// Reverse of a String 
		// can we have  a rev function in string : no 
		// diff between string and String buffer 
		// String - immutable , String buffer- mutable , which also has rev function
		
		String s = "Srivani";
		String rev="";
		
		// fisrt I have to find the length of the String using .length() method 
		
		 int length = s.length();//7
		 
		 // I have to start the counting from 7 to reverse i.e i(from end)
		 
		 // start for loop ( length-1) means java index starts from 0 right , herer (0-6)
		 
		 for ( int i=length-1;i>=0;i--) {
			 
			 // appending to rev
			rev=rev+ s.charAt(i);
		 }
		 
		 System.out.println(rev);
		 
		 //***************************************************************** using string bufefr class
		 
		 StringBuffer sf = new StringBuffer(s);
		 
		// System.out.println(sf.reverse());
		 

	}

}
