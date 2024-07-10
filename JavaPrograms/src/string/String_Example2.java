package string;


public class String_Example2 {
	public static void main(String[] args) {
        String input = "Sharma is a good player and he is so punctual";
        String reversed =" ";
        for(int i =input.length()-1;i>0;i--) {
        	reversed+=input.charAt(i);
        }
      System.out.println(input);
      System.out.println(reversed);
    }

	
}
