package hafta04;

public class Question02 {

	public static void main(String[] args) {
		/*
		1-20 arasindaki -20 dahil olmak �zere-  �ift say�lar� yazd�r�n. e.g.2 4 6 .. 20


		1-20 arasindaki -20 dahil olmak �zere-  tek say�lar� yazd�r�n. e.g 1,3,5,7,...,19 Virgul dahil!


		20 ile 1 arasindaki 5 e bolunebilen sayillari 20 den geriye gelerek yazdirin. e.g.20,15,10,5
		 
		1 - 20 aras�ndaki t�m �ift say�lar�n toplam�n� bulun.

		11 veya 15 hari� 1-20 aras�ndaki t�m say�lar� yazd�r�n; break or continue kullanin. 
		*/

ciftsay�lar();
teksayilar();	
beseBolunenler();	
ciftSayiToplam();
onBirveOnBesHaric();	
		
	
		
	}

	public static void onBirveOnBesHaric() {
		System.out.println("==========");
		System.out.println("11 veya 15 hari� 1-20 aras�ndaki t�m say�lar");
		for (int i = 1; i <= 20; i++) {
			if ((i==11||i==15)) {
			continue;

			}
		
			System.out.print(i+" ");
			}
			System.out.println();
			}
		
	

	public static void ciftSayiToplam() {
		System.out.println("========");
		int toplam=0;
    for (int i = 0; i < 20; i++) {
		if (i%2==0) {
			toplam+=i;
			}
		
	}
    System.out.println("Cift say�lar�n toplam�: "+ toplam);
	}

	public static void beseBolunenler() {
		System.out.println("========");
		System.out.println("bes'e bolunenler:");
		for (int i = 20; i>1; i--) {
			if (i%5==0) {
				System.out.print(i+",");
				System.out.println();
			}
		
		}
		
	}
 
	public static void teksayilar() {
		
		System.out.println("========");
		System.out.println("tek sayilar : ");
		for (int i = 1; i <20; i++) {
			if (i%2==1) {
				System.out.println(i+",");
			}
		
		}
		
	}

	public static void ciftsay�lar() {
		System.out.println("========");
		System.out.println("cift sayilar:");
		for (int i = 1; i <20; i++) {
			if (i%2==0) {
			
				System.out.print(i);
				System.out.println();
			}
			
		}
		
	}

}
