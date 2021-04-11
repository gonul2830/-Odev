package hafta02;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		/*
        Print "Lütfen iþ unvanýnýzý girin” 
        “jobTitle” isimli bir degisken olusturun ve kullanicidan isteyin.
        Doðru jobTitle yazdýrmak için aþaðýdaki test datalarini kullanýn. Example :
        Eger jobTitle  qa ise print “Ýþ unvanýnýz Quality Analyst” 
        test data: qa ise print Quality Analyst 
        dev ise print Developer 
        ba ise print Business Analyst 
        pm ise print Project Manager
       */
Scanner scan = new Scanner (System.in);
System.out.println("lutfen is unvanýnýzý giriniz");
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
