package string;

public class String_Compare {

	public static void main(String[] args) {
     String str1 = "Hello";
     String str2 = "GoodBye";
     String str3 = "Hello";
     
     if (str1.equals(str2)) {
    	 System.out.println("str1 and str2 are equal");
     }else {
    	 System.out.println("str1 and str2 are not equal");
     }
     
     if(str1.equals(str3)) {
    	 System.out.println("str1 and str3 are equal");
     }else {
    	 System.out.println("str1 and str3 are not equal");
     }
	}

}
