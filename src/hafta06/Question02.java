package hafta06;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {

		 /*  Rastgele kullanýcý adý oluþturan JAVA kodu yazýnýz.
			 *  1. Adým : Kullanýcýdan ismini isteyelim
			 *  2. Adým : Kullanýcý adýndaki boþluklarý silelim.
			 *  3. Adým : Kullanýcý adýnýn alýnabilir olup olmadýðýna bakalým.
			 *  4. Adým : Eðer bizim listemizde öyle bir kullanýcý adý yoksa kullanýcý adý, kullanýcýnýn girdiði isim olsun.
			 *  5. Adým : Eðer bu kullanýcý adý zaten varsa, sonuna rastgele sayý oluþturup ekleyelim, ve gösterelim.
				List<String> veritabanindakiKullaniciListesi = new ArrayList<>();
				veritabanindakiKullaniciListesi.add("Ahmet");
				veritabanindakiKullaniciListesi.add("Ayþe");
				veritabanindakiKullaniciListesi.add("Süleyman");
				veritabanindakiKullaniciListesi.add("Nazmi");
			 */
		List<String> veritabanindakiKullaniciListesi = new ArrayList<>();
		veritabanindakiKullaniciListesi.add("Ahmet");
		veritabanindakiKullaniciListesi.add("Ayþe");
		veritabanindakiKullaniciListesi.add("Süleyman");
		veritabanindakiKullaniciListesi.add("Nazmi");
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen isminizi Giriniz : ");
		String username= scan.nextLine();
		username= username.replaceAll(" ", "");
		System.out.println(username.replaceAll(" ", ""));

boolean kullniciIsmiVarMi = veritabanindakiKullaniciListesi.contains(username);

if (kullniciIsmiVarMi) {
System.out.println("bu kullanicinin ismi zaten alinmis");

} else {
System.out.println("bu kullanici adini kullanabilirsiniz");

}
if (kullniciIsmiVarMi) {
int rastgeleSayi = new Random().nextInt(10000);
username = username + "" + rastgeleSayi;
System.out.println(" yeni kullanici ismi olarak bunu kullanabilirin: " + username);
} else {

System.out.println("yeni kullanici adi: " + username);
}
scan.close();
		
	}

}
