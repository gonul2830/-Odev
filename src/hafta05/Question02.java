package hafta05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/* Kullanicidan sayilar girmesini isteyin
         * ve girdigi sayilari toplayip yazdirin.
         * yeni sayi isteyin
         * girilen sayilarin toplami 100 'u gecerse
         * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
         *
         */
		Scanner scan =new Scanner(System.in);


		int toplam=0;
		int count=0;

		do {
		System.out.println("lutfen toplama islemi icin sayi giriniz");
		//int sayi=scan.nextInt();
		toplam+=scan.nextInt(); // toplam=toplam+sayi
		count++;

		} while (toplam<100);

		System.out.println(count +" kere sayi girdin.Bu kadar sayi yeter");
		scan.close();
		
	}

}
