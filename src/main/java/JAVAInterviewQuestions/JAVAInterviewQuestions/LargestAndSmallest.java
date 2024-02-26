package JAVAInterviewQuestions.JAVAInterviewQuestions;

public class LargestAndSmallest {

	public static void main(String[] args) {
		
		int numbers[] = {10,48,98,65362543,47834};
		
		int largest = numbers[0]; // stored 10 i.e ist index in both largest and smallest
		
		int smallest = numbers[0];
		
		// start loop with 1 
		for  (int i =1;i<=numbers.length-1;i++) {
			
			if (numbers[i]>largest) {
				
				largest = numbers[i];
			}
			
			else {
				
				if (numbers[i]<smallest) {
					
					smallest = numbers[i];
				}
			}
		}
		
		
		System.out.println(smallest);
		
		System.out.println(largest);

	}

}
