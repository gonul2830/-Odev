package hafta06;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
		 * //Swap islemini iki yoldan yaptiginiz java kodunu yaziniz. //1.Yol: 3.
		 * degisken kullanarak //2.Yol: 3. degisken kullanmadan
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("1.Sayiyi Giriniz : ");
		int deger1 = scan.nextInt();
		System.out.println("2.Sayiyi Giriniz : ");
		int deger2 = scan.nextInt();
		int swap = 0;

		System.out.println("Takastan Once");
		System.out.println("Deger 1 = " + deger1);
		System.out.println("Deger 2 = " + deger2);

		swap = deger1;
		deger1 = deger2;
		deger2 = swap;
		System.out.println("Takastan Sonra");
		System.out.println("Deger 1 = " + deger1);
		System.out.println("Deger 2 = "+ deger2);
		
	
		scan.close();
		
	}

}
