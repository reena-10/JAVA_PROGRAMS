package string;

public class Replace_Character {

	public static void main(String[] args) {
    String s = "Hi,I am Rani";
    System.out.println("Original String: "+s);
    
    char oldChar = 'i'; //character to replace
    char newChar = '*';//character to replace with
    
    String replaced_s = s.replace(oldChar ,newChar);
    System.out.println("Replaced String: "+replaced_s);
	}

}
