package JAVAInterviewQuestions.JAVAInterviewQuestions;

public class SortingArray {

	public static void main(String[] args) {
	
		int a [] = {2,8,7,6,8};
		
		int t =0;
		
		for (int i =0;i<=a.length-1;i++) {
			
			for (int j=i+1;j<=a.length-1;j++) {
				
				if (a[i]>a[j]) {
					
					t = a[i];
					
					a[i]=a[j];
					
					a[j]=t;
					
				}
			}
		}
		
	    for (Integer e : a) {
	    	
	    	System.out.println(e);
	    }

	}

}
