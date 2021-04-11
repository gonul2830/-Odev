package hafta02;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		/* 
		Kullanýcýný 1 ile 7 arasýnda bir sayý girdiðinde haftanýn hangi günü olduðunu yazdýran switch case java kodunu yazinýz.
				 */

		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen bir rakam giriniz");
		int rakam =scan.nextInt();
		    switch (rakam) {
		    case 1:
			System.out.println("PAZARTESÝ");
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
			System.out.println("CUMARTESÝ");
			break;
			case 7: 
		System.out.println("PAZAR");
		break;
		default:
			System.out.println("lutfen gecerli bir sayý giriniz");
	}

}
}