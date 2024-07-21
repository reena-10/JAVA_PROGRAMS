package stack;
import java.util.Iterator;
import java.util.Stack;
public class Push_Method {

	public static void main(String[] args) {
    Stack<String> animals = new Stack<>();
    //Add elements to Stack
    animals.push("Dog");
    animals.push("cat");
    animals.push("Cow");
    animals.push("Horse");
    animals.push("Donkey");
    
    System.out.println("Elements in Stack ");
    Iterator<String> i= animals.iterator();
    while (i.hasNext()) {
        System.out.println(i.next());
    }

	}

}
