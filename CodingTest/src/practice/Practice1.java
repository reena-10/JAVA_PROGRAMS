package practice;

public class Practice1 {

	public static void main(String[] args) {
    String s ="Hey";
    String rev="";
    for(int i=s.length()-1;i>=0;i--) {
    	rev=rev+s.charAt(i);
    }
    if(s.equals(rev))
    	System.out.println("String is Pailendrome");
    else
    	System.out.println("not pailendrome ");
	}

}
