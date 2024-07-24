package stack;
import java.util.Iterator;
import java.util.Stack;
public class Search_Method {

	public static void main(String[] args) {
    Stack<String> name = new Stack<>();
    //Add elements to Stack
    name.push("Vanika");
    name.push("Devanshi");
    name.push("Monali");
    name.push("Rakhi");
    System.out.println("Stack \n");

    Iterator<String> i = name.iterator();
    while(i.hasNext()) {
    	System.out.println(i.next());
    }
    
    //Access elements from the top
    int position = name.search("Monali");
    System.out.println("\nPosition of Monali is : "+position);
	}

}
