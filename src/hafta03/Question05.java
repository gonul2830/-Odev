package hafta03;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir kelime girmesini isteyin. Sözcükte tek sayýda karakter ve 3
		 * veya daha fazla karakter içeriyorsa, kelimenin ortasýndaki karakteri
		 * yazdýrýn.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir kelime giriniz");
		String str = scan.next();

		if (str.length() % 2 == 1 && str.length() >= 3) {
			System.out.println(str.substring((str.length() - 1) / 2, (str.length() + 1) / 2));
		}

	}

}
