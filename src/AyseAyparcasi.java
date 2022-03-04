
import java.util.Scanner;

public class AyseAyparcasi{

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("8 haneli sayi giriniz: ");
		int x=scan.nextInt();
		int ilkdeger=x;
		int length=String.valueOf(x).length();
		
		int kalan,deger=0;
		for(int i=0; i<length;i++) {
			kalan=x%10;
			deger=deger*10 + kalan;
			x=x/10;
		}
		System.out.println(deger);
	}

}
