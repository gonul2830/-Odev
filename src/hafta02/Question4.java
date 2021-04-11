package hafta02;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		/* 
		Kullanicidan 3 tane pozitif  tam sayi alalim
		bu uc sayidan ucgen olup olmama durumunu kontrol edelim
		eger ucgen olabiliyor ise, es kenar ucgen mi kontrol edelim.

		* Ucgen olma kosullari.
		b+c>a>b-c  1
		a+c>b>a-c  1
		a+b>c>a-b 1

		* Eskenar ucgen olma kosullari.
		a=b=c 

		Konsolda asagidaki durumlari yazdiralim.
		Eskenar ucgen
		Sadece ucgen
		Ucgen degildir
		         */
Scanner scan = new Scanner (System.in);
System.out.println("ucgen olup olmadýgýný kontrol etmek icin üc tane sayý giriniz ");
double a= scan.nextDouble();
double b = scan.nextDouble();
double c = scan.nextDouble();

if (a<0 || b<0 || c<0) {
	System.out.println("Lutfen gecerli bir sayý giriniz");
}  else if(a==b && b==c) {
	System.out.println("giediginiz sayýlarla eskenar ucgen olusturuluyor");
} else if ((b+c>a && a>b-c) || (a+c>b && b>a-c) || (a+b>c && c>a-b)) {
	System.out.println("girdiginiz sayýlarla ücgen olusturulabilinir");

	} else {
	System.out.println("girdiginiz sayýlarla ucgen olusturulmaz");
	}


 scan.close();

}

	}


