package exception_Handling;

public class FinallyBlock {

	    public static void main(String[] args) {
	        int[] arr = new int[1000];

	        try {
	            int value = arr[2000]; 
	            System.out.println("Value: " + value); 
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Caught exception: " + e.getMessage());
	        } finally {
	            arr = null; 
	            System.out.println("Array reference set to null.");
	        }

	    }
	}


