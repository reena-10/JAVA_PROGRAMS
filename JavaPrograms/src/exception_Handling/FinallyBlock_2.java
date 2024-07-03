package exception_Handling;

public class FinallyBlock_2 {
	
		  public static void main(String[] args) {
		    try {
		      // code that generates exception
		      int divideByZero = 5 / 0;
		    }

		    catch (ArithmeticException e) {
		      System.out.println("ArithmeticException => " +"Value cannot be 0 \n Re-Enter the value" );
		    }
		    
		    finally {
		      System.out.println("This is the finally block");
		    }
		  }
		}

