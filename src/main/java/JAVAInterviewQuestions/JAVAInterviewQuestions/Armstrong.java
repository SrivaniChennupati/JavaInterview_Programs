package JAVAInterviewQuestions.JAVAInterviewQuestions;

public class Armstrong {
	
	// 153 
	
	
	  public static void isArmStrong(int num) {
		  
		  int t = num;
		  
		  int r;
		  
		  int cube =0;
		  
		  
		  while (num!=0) {
			  
			  r = num%10;
			  num=num/10;
			  
			  cube = cube+(r*r*r);
		  }
		  
		  if (t==cube) {
			  
			  System.out.println("Given number is armstring:::"+t);
		  }
		  
		  else {
			  
			  System.out.println("Given number is armstring::::"+t);
		  }
		  
	  }
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isArmStrong(153);

	}

}
