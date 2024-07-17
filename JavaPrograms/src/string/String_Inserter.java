package string;

public class String_Inserter {

	public static void main(String[] args) {
    String original = "Hello World";
    String toInsert = "Beautiful ";
    int position = 6;
    
    System.out.println("Original String: "+original);
    System.out.println("String to Insert: "+toInsert);
    System.out.println("Position: "+position);
    
    String result = insertString(original, toInsert, position);
    System.out.println("Result: "+result);
	}
    public static String insertString(String original, String toInsert, int position) {
       StringBuffer buffer = new StringBuffer(original);
       buffer.insert(position, toInsert);
       return buffer.toString();

	}

}
