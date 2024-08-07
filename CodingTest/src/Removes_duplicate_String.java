import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Removes_duplicate_String {

	public static void main(String[] args) {
        // Create a list of strings with  duplicate values
        List<String> s = new ArrayList<>();
        s.add("Dog");
        s.add("Cat");
        s.add("Cow");
        s.add("Dog");
        s.add("Bear");
        s.add("Deer");

        // Create a stream from the list
        List<String> ss = s.stream()

                // Collect the stream into a Set, which automatically removes duplicates
                .collect(Collectors.toSet())

                // Create a new stream from the Set
                .stream()

                // Collect the stream into a new list
                .collect(Collectors.toList());

        // Print the original list 
        System.out.println("Original List: " + s);
        //print after removing duplicates
        System.out.println("List after removing duplicates: " + ss);

	}

}
