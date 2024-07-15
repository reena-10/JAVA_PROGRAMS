package string;

public class String_Compare_Ignore_Case {

	public static void main(String[] args) {
		String str1 = "Hello";
	    String str2 = "GoodBye";
	    String str3 = "Hello";
	    if (str1.equalsIgnoreCase(str2)) {
	        System.out.println("str1 and str2 are equal (ignoring case)");
	      } else {
	        System.out.println("str1 and str2 are not equal (ignoring case)");
	      }

	      if (str1.equalsIgnoreCase(str3)) {
	        System.out.println("str1 and str3 are equal (ignoring case)");
	      } else {
	        System.out.println("str1 and str3 are not equal (ignoring case)");
	      }


	}

}
