package hafta04;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir isim ve karakter girmesini isteyin, sonra karakterin kaç kez
		 * tekrarlandýðýný kontrol edin. e.g: char ch1= 'a' ; String name =“John came
		 * late" => Tekrar Sayisi = 2
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir isim giriniz");
		String isim = scan.next();
		System.out.println("lutfen bir karakter giriniz");
		char harf = scan.next().charAt(0);
		int tekrar=0;
		
		for (int i = 0; i < isim.length(); i++) {
			if (isim.charAt(i)==harf){
				tekrar++;
			}
			
		}
		System.out.println(isim + " kelimesinde " +harf+" harfinin tekrar sayýsý:"+tekrar);
	}

}
