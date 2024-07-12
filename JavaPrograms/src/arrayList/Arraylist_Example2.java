package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_Example2 {
	public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Dog");
        list.add("Cat");
        list.add("Elephant");

        Iterator<String> i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

}
