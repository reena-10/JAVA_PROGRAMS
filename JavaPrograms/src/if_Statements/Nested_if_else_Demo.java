package if_Statements;

public class Nested_if_else_Demo {
	    public static void main(String[] args) {
	 
	        int a = 120, b = 150, c= 180;
	 
	        if (a >= b) {
	            if (b >= c)
	                System.out.println(" Value of a is " + a + " is the greater than b and c.");
	            else
	                System.out.println(" Value of b is " + c + " is the greater than a snd c.");
	        } else {
	            if (b >= c)
	                System.out.println("Value of b is  " + b + " is the greater than a and c.");
	            else
	                System.out.println(" Value of c is  " + c + " is the greater than a and b.");
	        }
	    }
	}
