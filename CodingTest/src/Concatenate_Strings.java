import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Concatenate_Strings {

	public static void main(String[] args) {
		
	        // Create a list of strings
	        List<String> S = new ArrayList<>();
	        S.add("Hello");
	        S.add(" ");
	        S.add("World");
	        S.add("!");
	        
	        // Concatenate the strings into a single string using the Stream API
	        String CS = S.stream()
	                .collect(Collectors.joining());
	        
	        // Print the concatenated string
	        System.out.println("Concatenated String: " + CS);


	}

}
