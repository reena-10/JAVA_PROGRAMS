package stringbulider;

public class ReverseString {

	public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("HelloWorld");
    System.out.println("Length of a String "+sb.length());
    
    System.out.println("Reverse a string without reverse function");
    for (int i=0; i<sb.length()/2;i++) {
    	int front = i;
    	int back = sb.length()-i-1;
    	
    	char frontChar = sb.charAt(front);
    	char backChar = sb.charAt(back);
    	
    	sb.setCharAt(front, backChar);
    	sb.setCharAt(back, frontChar);
    }
    System.out.println(sb);
	}

}
