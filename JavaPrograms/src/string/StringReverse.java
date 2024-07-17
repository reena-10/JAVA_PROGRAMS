package string;

public class StringReverse {

	public static void main(String[] args) {
     String  input = "Hello World!";
     System.out.println("Original String: "+input);
     
     String reversed = reverseString(input);
	 System.out.println("Reversed String: "+ reversed);
	}
  public static String reverseString(String str) {
	  StringBuffer buffer = new StringBuffer(str);
	  return buffer.reverse().toString();
  }
}
