package hafta04;

public class Question02 {

	public static void main(String[] args) {
		/*
		1-20 arasindaki -20 dahil olmak üzere-  çift sayýlarý yazdýrýn. e.g.2 4 6 .. 20


		1-20 arasindaki -20 dahil olmak üzere-  tek sayýlarý yazdýrýn. e.g 1,3,5,7,...,19 Virgul dahil!


		20 ile 1 arasindaki 5 e bolunebilen sayillari 20 den geriye gelerek yazdirin. e.g.20,15,10,5
		 
		1 - 20 arasýndaki tüm çift sayýlarýn toplamýný bulun.

		11 veya 15 hariç 1-20 arasýndaki tüm sayýlarý yazdýrýn; break or continue kullanin. 
		*/

ciftsayýlar();
teksayilar();	
beseBolunenler();	
ciftSayiToplam();
onBirveOnBesHaric();	
		
	
		
	}

	public static void onBirveOnBesHaric() {
		System.out.println("==========");
		System.out.println("11 veya 15 hariç 1-20 arasýndaki tüm sayýlar");
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
    System.out.println("Cift sayýlarýn toplamý: "+ toplam);
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

	public static void ciftsayýlar() {
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
