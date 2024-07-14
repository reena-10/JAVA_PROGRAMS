package string;

public class Extract_Substring {

	public static void main(String[] args) {
    String s ="Hello, Reena!";
    System.out.println("Original String: "+s);
    
    int startIndex =7;
    int endIndex =12;
    
    String substring = s.substring(startIndex,endIndex);
    System.out.println("Extracted Substring: "+substring);
	}

}
