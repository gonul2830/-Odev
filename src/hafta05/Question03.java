package hafta05;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		/*
		 * SORU 3) Kullanicidan 100 den kucuk bir tamsayi isteyip, bu sayinin daha
		 * onceden tanimlanmis array’de olup olmadigini kullaniciya donen bir method
		 * yaziniz
		 *
		 * Array={3,5,21,32,34,45,56,57,76,87,95}
		 *
		 * Input : 5 Output: Girdiginiz sayi Arrayde var Input : 15 Output: Girdiginiz
		 * sayi Arrayde yok
		 */
		Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayý giriniz");
		int sayi = scan.nextInt();
		if (sayi<100) {
			varMiYokMu(sayi);
		} else {
           System.out.println("Lutfen 100'den kucuk sayý giriniz.");
		}
	

		scan.close();
	}

	public static void varMiYokMu(int sayi) {
		boolean sonuc = false;
		int arr[] = { 3, 5, 21, 32, 34, 45, 56, 57, 76, 87, 95 };
		for (int i : arr) {
			if (i == sayi) {
				sonuc = true;
			}
		}
		if (sonuc) {
			System.out.println("  Girdiginiz sayi Arrayde var ");
		} else {
			System.out.println("  Girdiginiz sayi Arrayde yok ");
		}
		
	}
}
