package fizzbuzz;

import java.util.Scanner;

public class FizzBuzzBonus {

	public static void main(String[] args) {
		// TODO FITZ BUZZ PRO!
		
		Scanner scan = new Scanner(System.in);
		boolean flag = false;
		
		
		while (flag == false) {
			System.out.println("Inserisci counter tra 1 e 200");
			int j = scan.nextInt();
			if (!(j > 1 && j <= 200)) {
				System.out.println("MA SAI LEGGERE ?!?, ti ho detto: ");
				
			}
			
			if (j > 1 && j <= 200) {
		     flag = true;
			for (int i = 1; i <= j; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println("FITZ BUZZ!");
				} else if (i % 5 == 0) {
					System.out.println("BUZZ!");

				} else if (i % 3 == 0) {
					System.out.println("FITZ!");

				} else {
					System.out.println(i);
				}
				
			 }
			
		 }
	   }
	scan.close();
    }
}

	

