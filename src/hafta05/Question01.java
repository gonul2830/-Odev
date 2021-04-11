package hafta05;

public class Question01 {

	public static void main(String[] args) {
		/*
		 * // Stringi ters çevirmek için bir Java Programı yazın //1.Yol: StringBuilder
		 * () kullanarak //2.Yol: String Classini kullanarak //3.Yol: Bir method
		 * oluşturun, ardından methodu main method dan çağırın
		 */

		StringBuilder str = new StringBuilder("gelecek");
		str.reverse();
		System.out.println(str);

		String str1 = "gelecek";
		String ters = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			ters += str1.charAt(i);
		}
		System.out.print(ters);

		String str2 = "bugun";
		tersCevir(str2);
		System.out.println();
System.out.println(str.toString().equals(ters));
	}

	public static void tersCevir(String str2) {
		System.out.println();
		String ters2 = "";
		for (int i = str2.length() - 1; i >= 0; i--) {
			ters2 += str2.charAt(i);
		}
		System.out.print(ters2);

	}

}
