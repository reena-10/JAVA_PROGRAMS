package arrayList;


import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
	        ArrayList<String> fruits = new ArrayList<>();

	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");
	        fruits.add("Date");
	        fruits.add("Elderberry");

	        System.out.println("Original ArrayList:");
	        System.out.println(fruits);

	        fruits.remove(2);

	        fruits.add(2, "Fig");

	        
	        System.out.println("\nModified ArrayList:");
	        System.out.println(fruits);

	        boolean banana = fruits.contains("Banana");
	        System.out.println("\nContains Banana: " + banana);

	        fruits.clear();

	        System.out.println("\nFinal ArrayList (after removing):");
	        System.out.println(fruits);
	    }
	}



