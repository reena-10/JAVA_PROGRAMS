package exception_Handling;

public class ExceptionPropagation {

	    public static void main(String[] args) {
	        try {
	            divideByZero();
	        } catch (ArithmeticException e) {
	            System.out.println("Caught exception in main method: " + e.getMessage());
	        }
	    }

	    public static void divideByZero() {
	        int numerator = 10;
	        int denominator = 0;
	        int result = numerator / denominator; 
	        System.out.println("Result: " + result); 
	    }
	}


