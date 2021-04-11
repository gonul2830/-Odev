package hafta03;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýnýn girmiþ olduðu A,B,C,D,F notlarýnýn karþýlýðýný yazdýran Switch
		 * Case java kodunu yazýnýz. A Excellent B Good C Average D Deficient F Failing
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen notunuzu giriniz");

		char not = scan.next().toUpperCase().charAt(0);

		switch (not) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Average");
			break;
		case 'D':
			System.out.println("Deficient");
			break;

		case 'F':
			System.out.println("Failing");
			break;
		default:

			System.out.println("lutfen gecerli kelime giriniz");

		}
scan.close();
	}

}
