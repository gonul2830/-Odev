package hafta03;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir kelime girmesini isteyin. S�zc�kte tek say�da karakter ve 3
		 * veya daha fazla karakter i�eriyorsa, kelimenin ortas�ndaki karakteri
		 * yazd�r�n.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir kelime giriniz");
		String str = scan.next();

		if (str.length() % 2 == 1 && str.length() >= 3) {
			System.out.println(str.substring((str.length() - 1) / 2, (str.length() + 1) / 2));
		}

	}

}
