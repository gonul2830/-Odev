package hafta03;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/*
		 * Kullanicinin girmis oldugu ay icin kac gun oldugunu yazdiran Switch Case java
		 * kodunu yaziniz.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen icinde oldugunuz ayý giriniz");

		int ay = scan.nextInt();
		switch (ay) {
		case 1:
			System.out.println("ocak 31 gun");
			break;
		case 2:
			System.out.println("subat 28 gun");
			break;
		case 3:
			System.out.println("mart 31 gun");
			break;
		case 4:
			System.out.println("Nisan 30 gun");
			break;
		case 5:
			System.out.println("Mayýs 31 gun");
			break;
		case 6:
			System.out.println("Haziran 30 gun");
			break;
		case 7:
			System.out.println("Temmuz 31 gun");
			break;
		case 8:
			System.out.println("Agustos 30 gun");
			break;
		case 9:
			System.out.println("Eylül 31 gun");
			break;
		case 10:
			System.out.println("Ekim 30 gun");
			break;
		case 11:
			System.out.println("Kasim 31 gun");
			break;
		case 12:
			System.out.println("Aralik 31 gun");
			break;

		default:
			System.out.println("lutfen gecerli ay no giriniz");

		}

		scan.close();

	}

}
