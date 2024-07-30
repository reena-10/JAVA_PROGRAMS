package set_Interface;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_Hash_Set {

	public static void main(String[] args) {
    LinkedHashSet<String> Students = new LinkedHashSet<String>();
    
    Students.add("Reena");
    Students.add("Rakhi");
    Students.add("Diksha");
    Students.add("Nandini");
    Students.add("Yogita");
    
    System.out.println("Elements of LinkedHashSet:");
    
    Iterator<String> itr = Students.iterator();
    while(itr.hasNext()) {
    System.out.println(itr.next());
    }
	}

}
