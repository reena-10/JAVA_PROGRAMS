package string;

public class Reverse_String {

	public static void main(String[] args) {
      String s = "Hello  Java  Programming";
      System.out.println("Original String: "+s);
      
      String reversed = reverseString(s);
      System.out.println("Reversed String: "+reversed);
	}
	public static String reverseString(String str) {
	    String reversed = "";
	    for (int i = str.length() - 1; i >= 0; i--) {
	      reversed += str.charAt(i);
	    }
	    return reversed;
	  }

}
