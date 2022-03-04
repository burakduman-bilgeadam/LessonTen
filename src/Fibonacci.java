import java.util.Scanner;

public class Fibonacci{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number: ");
		int a = scan.nextInt();
		System.out.println("Fibonacci1 method: ");
		for (int i = 0; i <= a; i++) {
			System.out.print(fibonacci1(i) + " ");
			
		}
		System.out.println("\n");
		System.out.println("Fibonacci2 method: ");
		for(int j=0; j<=a;j++) {
			System.out.print( fibonacci2(j) +  " ");
			
		}
		System.out.println();
		System.out.print(a + ". fibonacci is: " + fibonacci2(a));
	
		

	}

	static int fibonacci1(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibonacci1(n - 1) + fibonacci1(n - 2);

	}

	static int fibonacci2(int n) {
		if (n <= 1)
			return n;
		return fibonacci2(n - 1) + fibonacci2(n - 2);
	}

}
