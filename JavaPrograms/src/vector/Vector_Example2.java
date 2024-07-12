package vector;

import java.util.*;

public class Vector_Example2 {
	public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Java");
        vector.add("Python");
        vector.add("MySql");

        Iterator<String> i = vector.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}


