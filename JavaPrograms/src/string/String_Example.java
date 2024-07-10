package string;

public class String_Example {
 public static void main(String args[]) {
	 String s= "Ramlal";

	 for(int i=0;i<s.length();i++) {
		 String ss =" ";

	   for(int j=i;j<s.length();j++) {
	     ss=ss+s.charAt(j);
		 System.out.println(ss);
	 }
   }
  }
}