package hafta06;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {

		 /*  Rastgele kullan�c� ad� olu�turan JAVA kodu yaz�n�z.
			 *  1. Ad�m : Kullan�c�dan ismini isteyelim
			 *  2. Ad�m : Kullan�c� ad�ndaki bo�luklar� silelim.
			 *  3. Ad�m : Kullan�c� ad�n�n al�nabilir olup olmad���na bakal�m.
			 *  4. Ad�m : E�er bizim listemizde �yle bir kullan�c� ad� yoksa kullan�c� ad�, kullan�c�n�n girdi�i isim olsun.
			 *  5. Ad�m : E�er bu kullan�c� ad� zaten varsa, sonuna rastgele say� olu�turup ekleyelim, ve g�sterelim.
				List<String> veritabanindakiKullaniciListesi = new ArrayList<>();
				veritabanindakiKullaniciListesi.add("Ahmet");
				veritabanindakiKullaniciListesi.add("Ay�e");
				veritabanindakiKullaniciListesi.add("S�leyman");
				veritabanindakiKullaniciListesi.add("Nazmi");
			 */
		List<String> veritabanindakiKullaniciListesi = new ArrayList<>();
		veritabanindakiKullaniciListesi.add("Ahmet");
		veritabanindakiKullaniciListesi.add("Ay�e");
		veritabanindakiKullaniciListesi.add("S�leyman");
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
