package hafta04;

public class Question03 {

	public static void main(String[] args) {
		/*
		Verilen String icerisindeki tekrar eden karakterleri yazdiran Java kodunu yaziniz. 
		String str=“ilovejavatoo” 
		Output: o v a
		         */

		String str="ilovejavatoo";
		String str2="";
		for (int i = 0; i < str.length()-1; i++) {
			for (int j = i+1; j < str.length()-1; j++) {
				if (str.charAt(i)==str.charAt(j) &&  str2.indexOf(str.charAt(i))<0) {
					str2+=str.charAt(i)+" ";
				
			}
			
			}
		}
		System.out.println(str2);
	}

}
