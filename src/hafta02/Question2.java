package hafta02;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		/*
        Print "L�tfen i� unvan�n�z� girin� 
        �jobTitle� isimli bir degisken olusturun ve kullanicidan isteyin.
        Do�ru jobTitle yazd�rmak i�in a�a��daki test datalarini kullan�n. Example :
        Eger jobTitle  qa ise print ��� unvan�n�z Quality Analyst� 
        test data: qa ise print Quality Analyst 
        dev ise print Developer 
        ba ise print Business Analyst 
        pm ise print Project Manager
       */
Scanner scan = new Scanner (System.in);
System.out.println("lutfen is unvan�n�z� giriniz");
String jobtitle =scan.next();

switch(jobtitle) {
case "qa":
	System.out.println("Quality Analyst");
	break;
case "dev":
	System.out.println("Developer");
	break;
case "ba":
	System.out.println("Business Analyst");
	break;
case"pm" :
	System.out.println("Project Manager");
	break;
	default:
		System.out.println("lutfen gecerli bir jobtitle giriniz");
}

	}

}
