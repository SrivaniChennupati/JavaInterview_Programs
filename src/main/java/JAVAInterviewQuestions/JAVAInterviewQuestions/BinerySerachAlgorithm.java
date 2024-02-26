package JAVAInterviewQuestions.JAVAInterviewQuestions;

public class BinerySerachAlgorithm {

	public static void main(String[] args) {
		
		int a[] = {2,4,5,6,7,8,9};
		
		int x = 7; // the number we want to look for
		
		int n = a.length;
		
		int result =binarySearch(a, x, 0, n-1);
		
		if (result == -1) {
			
			System.out.println("Element is not found");
		} else {
			
			System.out.println("Element is found" +result);
		}
		
		
	}
	
	public static int binarySearch(int a[],int x ,int low , int high) {
		
		while(low<=high) {
		 int mid = low + (high-low)/2;
		 
		 if (a[mid]==x) 
			 
			 return mid;
		 
		 
		 if (a[mid]<x) 
			 
			 low = mid+1;
		 
		 
		 else 
			 
			 low = mid-1;
		 
	}
		
		return -1;
		
	}

}
