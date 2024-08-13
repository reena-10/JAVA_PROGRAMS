package practice;

public class Practice3 {

	public static void main(String[] args) {
		String txt = "Hello, Java";
		 int count = 0;
	        for (int i = 0; i < txt.length(); i++) {
	            char ch = txt.charAt(i);
	            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
	                count++;
	            }
		System.out.print(count);
	}

	}
	}
