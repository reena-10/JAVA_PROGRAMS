package string;

public class Vowel_Checker {

	public static void main(String[] args) {
     String str = "Hello";
     System.out.println("Input: "+str);
     System.out.println("Output: " + containsAllVowels(str));
	}
  public static boolean containsAllVowels(String str) {
	  str = str.toLowerCase();
	  boolean hasA = str.contains("a");
      boolean hasE = str.contains("e");
      boolean hasI = str.contains("i");
      boolean hasO = str.contains("o");
      boolean hasU = str.contains("u");

      return hasA && hasE && hasI && hasO && hasU;
      }
}
