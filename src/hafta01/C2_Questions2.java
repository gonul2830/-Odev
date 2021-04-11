package hafta01;

import java.util.Scanner;

public class C2_Questions2 {

	public static void main(String[] args) {
		// Kullanicidan 3 basamakli bir sayi isteyin ve 
		//bu sayinin basamaklari toplamini konsolda yazdiran programi yaziniz.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen uc basamaklı bir sayı giriniz");
		int sayi  = scan.nextInt();
		//int toplam = birlerbas+onlarbas+yuzlerbas;
		
		
		if (sayi>99 && sayi<1000) {
		int birlerbas = sayi%10;
		sayi/=10;
		int onlarbas = sayi%10;
		sayi/=10;
		int yuzlerbas =sayi;
		   System.out.println(birlerbas+onlarbas+yuzlerbas);
			
		} else {
			System.out.println("lutfen gecerli bir sayi giriniz");
		}

	}

}
