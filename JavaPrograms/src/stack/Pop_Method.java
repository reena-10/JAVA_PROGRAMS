package stack;
import java.util.Iterator;
import java.util.Stack;
public class Pop_Method {

	public static void main(String[] args) {
    Stack<String> stack = new Stack<>();
    
    // Add elements to Stack
    stack.push("Reena");
    stack.push("Meena");
    stack.push("Teena");
    stack.push("Kareena");
    stack.push("Katrina");
	
	System.out.println("Before pop method");
	Iterator<String> i= stack.iterator();
    while (i.hasNext()) {
        System.out.println(i.next());
    
    }  
    System.out.println();
    //Remove element stacks
	String element = stack.pop();
	
	System.out.println("After pop method");
	   Iterator<String> itr= stack.iterator();
       while (itr.hasNext()) {
           System.out.println(itr.next());
       }
    
	}
}
