package arrayList;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Example {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(50);
        numbers.add(40);

        System.out.println("Original ArrayList:");
        System.out.println(numbers);

        // Sort the ArrayList in ascending order
        Collections.sort(numbers);

        System.out.println("\nSorted ArrayList (ascending order):");
        System.out.println(numbers);

        // Reverse the ArrayList
        Collections.reverse(numbers);

        // Print the reversed ArrayList
        System.out.println("\nReversed ArrayList:");
        System.out.println(numbers);
    }
}
