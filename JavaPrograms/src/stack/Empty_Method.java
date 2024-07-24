package stack;

import java.util.Iterator;
import java.util.Stack;
public class Empty_Method {

	public static void main(String[] args) {
    Stack<Double> num = new Stack<>();
    
    //Add elements to Stack
    num.push(2.23);
    num.push(34.5);
    num.push(56.0);
    num.push(45.2);
    System.out.println("Stack");
    
    Iterator<Double> i = num.iterator();
    while(i.hasNext()) {
    	System.out.println(i.next());
    }
    //Check if Stack is Empty
    boolean result = num.empty();
    System.out.println("Is the Stack empty? "+result);
	}
}
