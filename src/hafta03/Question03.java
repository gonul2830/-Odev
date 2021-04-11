package hafta03;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		/*
		 * Ternary kullanarak: int variable : FIYAT string variable : Secim (String
		 * Secim=.....) price = $10 ise Print “UCUZ” price 10-$20 arasi ise Print
		 * “UYGUN” diger durumlar icin “PAHALI” yazdirin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen fiyat giriniz");
		int fiyat = scan.nextInt();
		String secim = fiyat == 10 ? "ucuz" : fiyat > 10 && fiyat < 20 ? "uygun" : "pahali";

		System.out.println(secim);
		scan.close();

	}

}
