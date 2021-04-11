package hafta02;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa “gecerli bir email girin” yazdirin
       @ isaretinden sonra sadece “gmail.com” yaziyorsa “email onaylandi” yazdirin
       @ isaretinden sonra “gmail.com” disinda birsey yaziyorsa “Lutfen gmail hesabinizi girin” yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : “gecerli bir email girin”
       INPUT : techproed@gmail.com OUTPUT : “email onaylandi”
       INPUT : techproed@hotmail.com OUTPUT : “Lutfen gmail hesabinizi girin”
       */

		

		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen mail adresinizi giriniz");
		
		String mail= scan.nextLine();
		
		
		if (!mail.contains("@")) {
			System.out.println("lutfen gecerli bir mail adresi giriniz");
		
		} else if  (mail.endsWith("@gmail.com")) {
			System.out.println("email onaylandý");
				}
		else {
			
			System.out.println("lutfen gmail hesabý giriniz");
		}
		
		scan.close();
		
	}

}
