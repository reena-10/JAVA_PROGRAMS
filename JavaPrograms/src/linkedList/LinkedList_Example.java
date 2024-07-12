package linkedList;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedList_Example {
	    public static void main(String[] args) {
	        LinkedList<Integer> List = new LinkedList<>();
	        List.add(100);
	        List.add(200);
	        List.add(300);

	        Iterator<Integer> i= List.iterator();
	        while (i.hasNext()) {
	            System.out.println(i.next());
	        }
	    }
	}


