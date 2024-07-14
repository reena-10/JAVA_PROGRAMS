package string;

public class Split_String {
  public static void main(String []args) {
	  String s = "Hello,world ,Java ,Programming";
	  System.out.println("Original String : "+s);
	  
	  String[] substring = s.split(",");
	  System.out.println("Split Substring: ");
	  
	  for(String string : substring) {
		  System.out.println(string);
	  }
  }
}
