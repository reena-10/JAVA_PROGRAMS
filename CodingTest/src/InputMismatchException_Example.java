import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchException_Example {

	public static void main(String[] args) {
	//create scanner class  object
    Scanner sc = new Scanner(System.in);
    // use try-catch block for taking input from the user and handling exception  
    try { //try block
    	System.out.println("Enter a Value ");
        Integer a = sc.nextInt();
        System.out.println("Square of " +a+ " is: "+a*a);
    }
    catch(InputMismatchException e) { //print exception
    	System.out.println(e);
    	System.out.println("Please Enter a Valid Integer Value.");//print message when value in not a valid Integer value.
    } 
 }

}
