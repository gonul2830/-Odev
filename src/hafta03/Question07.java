package hafta03;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
		/*
		 * StringMethods: �ift uzunlukta bir degiskenin ilk yar�s�n� konsolda yazdirmak
		 * i�in bir Java program� yaz�niz. ORNEK: INPUT : Python OUTPUT : Pyt
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir degisken giriniz");
		String str = scan.nextLine();

		ilkYarisiniYaz(str);

	}

	public static void ilkYarisiniYaz(String str) {
		if (str.length() % 2 == 0) {
			System.out.println(str.substring(0, str.length() / 2));
		} else {
			System.out.println("lutfen cift karakterli bir kelime giriniz");
		}

	}

}
