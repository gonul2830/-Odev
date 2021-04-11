package hafta03;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan firstName ve lastName'i girmesini isteyin, ardýndan baþ
		 * harflerini büyük harf yapýn ve geri kalaný tamamen kucuk harf olarak konsolda
		 * yazdirin. ferhat => Ferhat kirac => Kirac
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen firstname'i giriniz");
		String firstname = scan.next().toLowerCase();
		System.out.println("Lutfen lastname'i giriniz");
		String lastname = scan.next().toLowerCase();

		System.out.println(firstname.toUpperCase().charAt(0) + firstname.substring(1, firstname.length()));
		System.out.println(lastname.toUpperCase().charAt(0) + lastname.substring(1, lastname.length()));

	}

}
