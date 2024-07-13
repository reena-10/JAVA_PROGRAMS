package string;

public class SubString {
  public static void main(String[]args) {
	  String s = "Hey , I am Reena";
	  String substring ="Reena";
	  
	  if (s.contains(substring)) {
		  System.out.println("The String '"+s+"' contains the Substring '"+substring+"'");
	  } else {
		  System.out.println("The String '"+s+"'does not contain the substring '"+substring+"'");
	  }
  }
}
