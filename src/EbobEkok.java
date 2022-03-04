

import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter number1: ");
		int x= scan.nextInt();
		System.out.println("Please enter number2: ");
		int y= scan.nextInt();
		int ebob=ebob(x,y);
		
		System.out.println("En Büyük Ortak Böleni (EBOB): " + ebob(x,y));
		System.out.println("En küçük ortak böleni (EKOK): " + ekok(x,y,ebob));
		
		
	}
	public static int ebob(int x, int y) {
		int ebob=1;
		int i;
		int a=Math.min(x,y);
		for(i=2; i<=x && i<=y; i++) {
			if(x%i==0 && y%i==0) {
				ebob= i;
			}
			
		}
		return ebob;
	}
	public static int ekok(int x, int y, int ebob) {
		int ekok = (x*y)/ebob;
		return ekok;
	}
	

}
