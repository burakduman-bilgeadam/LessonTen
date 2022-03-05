import java.util.Scanner;

public class EkinGulsumakin {
public static void main(String[] args) {
		
		// GİRİLEN sayıyı tersten yazdıran uygulama
		

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter a number: ");
		int number=scanner.nextInt();
	
	
		reverse(number);
		
		//System.out.print("Reverse number is:  ");

		

	}

	private static void reverse(int number) {
		
		int digits = 0;
		int count=0;
		int numberofdigits=number;
		
		while (numberofdigits>0) {
			numberofdigits = numberofdigits/10;
			count++;
			
		}
		
		
		for (int i = 0; i < count; i++) {

			digits = number % 10;
			System.out.print(digits);
			number = number / 10;

		}
		
		
		
	}

}
