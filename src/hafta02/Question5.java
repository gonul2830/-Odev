package hafta02;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		/* 
		Kullan�c�n� 1 ile 7 aras�nda bir say� girdi�inde haftan�n hangi g�n� oldu�unu yazd�ran switch case java kodunu yazin�z.
				 */

		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen bir rakam giriniz");
		int rakam =scan.nextInt();
		    switch (rakam) {
		    case 1:
			System.out.println("PAZARTES�");
			break;
			case 2:
			System.out.println("SALI");
			break;
			case 3:
			System.out.println("CARSAMBA");
			break;
			case 4:
			System.out.println("PERSEMBE");
			break;
			case 5:
			System.out.println("CUMA");
			break;
			case 6:
			System.out.println("CUMARTES�");
			break;
			case 7: 
		System.out.println("PAZAR");
		break;
		default:
			System.out.println("lutfen gecerli bir say� giriniz");
	}

}
}