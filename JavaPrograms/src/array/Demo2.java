package array;

public class Demo2 {

	public static void main(String[] args) {
       int[]arr = {23,27,64,75,83,27};
           boolean flag= false;	        	        
    	        for (int value : arr) {
    	        if (value == 83) {
    	        	flag=true;
    	            System.out.println(" true value is Present.");
    	        }
    	    }
    	if(flag==false) {
    		System.out.println("No");
    	}

	}
}

