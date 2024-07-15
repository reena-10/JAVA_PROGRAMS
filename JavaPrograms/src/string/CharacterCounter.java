package string;

public class CharacterCounter {

	public static void main(String[] args) {
    String str = "Hello, World";
    char targetChar ='o';
    
    int count =0;
    for (int i=0; i<str.length(); i++) {
    	if(str.charAt(i) == targetChar) {
    		count++;
    	}
    }
    System.out.println("The character "+targetChar+" appears "+count+" time in the string.");
	}

}
