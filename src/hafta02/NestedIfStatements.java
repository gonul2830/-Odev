package hafta02;

import java.util.Scanner;

public class NestedIfStatements {

	public static void main(String[] args) {
		/*
		 * “NestedIfStatements” class olusturun.
		 * 
		 * Kullanicidan 2 kisi icin dogum gunu girmesini isteyin.
		 * 
		 * Yılı, ayi ve günü tamsayı olarak alın e NestedIf kullanarak kimin yas olarak
		 * daha buyuk oldugunu ekrana yazdirin. Examples: int birthYearOfYusuf=2000,
		 * birthMonthOfYusuf=12, birthDayOfYusuf=12, int
		 * birthYearOfMehmet=2000,birthMonthOfMehmet=12, birthDayOfMehmet=21; Yusuf is
		 * Older
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen iki kisinin icin dogum gunlerini kıyaslamak icin degerleri giriniz ");
		System.out.println("lutfen birinci kisi icin degerleri sırayla yıl,ay ve gün seklinde giriniz");
		int kisi1year = scan.nextInt();
		int kisi1mont = scan.nextInt();
		int kisi1day = scan.nextInt();
		System.out.println("lutfen ikinci kisi icin degerleri sırayla yıl,ay,gun seklinde giriniz");
		int kisi2year = scan.nextInt();
		int kisi2mont = scan.nextInt();
		int kisi2day = scan.nextInt();

	
		if (kisi1year == kisi2year) {
			if (kisi1mont == kisi2mont) {
				if (kisi1day == kisi2day) {
					System.out.println("kisi1 ve kisi2 yasıt");
				} else if (kisi1day > kisi2day) {
					System.out.println("kisi2 daha buyuktur");
				} else {
					System.out.println("kisi1 daha buyuktur");
				}

			} else if (kisi1mont > kisi2mont) {
				System.out.println("kisi2 daha buyuktur");
			} else {
				System.out.println("kisi1 daha buyuktur");
			}

		} else if (kisi1year > kisi2year) {
			System.out.println("kisi2 daha buyuktur");

		} else {
			System.out.println("kisi1 daha buyuktur");
		}
		{

		}

	}

}
