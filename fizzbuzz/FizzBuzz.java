package fizzbuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		// FITZBUZZ!
		
		for (int i = 1; i <= 100; i++) {
		if  (i % 3 ==0 && i % 5 ==0) {
			System.out.println("FITZ BUZZ!");
	    }
		else if (i % 5 ==0) {
			System.out.println("BUZZ!");
			
		}	
		else if (i % 3 ==0) {
			System.out.println("FITZ!");
			
		}
		else {
			System.out.println(i);
		}

	}

 }
}
