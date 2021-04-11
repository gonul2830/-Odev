package hafta01;

import java.util.Scanner;

public class C1_Questions {

	public static void main(String[] args) {
		//Question 1:
		//Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(pickName.charAt(0) + " "+ pickName.charAt(11)+" "+
		pickName.toLowerCase().charAt(8));
		

		
		
		//	Qyestion 2 :
		//Kullaniciya gunde kac cay ictigini ve cayi kac sekerli ictigini sorun.
		//Daha sonra kullanicinin yilda kac kg seker kullandigini hesaplayan java kodunu yaziniz.
		// 1 seker =1.7 gram
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen gunde kac cay ictiginici yazýnýz");
		int cay = scan.nextInt();
		System.out.println("lutfen cayý kac sekerli ictiginizi giriniz");
		int seker = scan.nextInt();
		double yillikseker= cay*seker*1.7*365/1000;
		System.out.println("yilda tuketilen seker miktarýnýz :"+  yillikseker + "kg/yil");
			
		
		// Question 3:
		//Konsolda Integer degiskeninin maximum ve minimum degerlerini yazdiran kodu yaziniz.
		int minDeger = Integer.MIN_VALUE;
		int maxDeger = Integer.MAX_VALUE;
		System.out.println(minDeger);
		System.out.println(maxDeger);
		
		
	}

}
