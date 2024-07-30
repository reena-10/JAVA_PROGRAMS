package map_Interface;
import java.util.HashMap;
import java.util.Map;

public class Frequency {

	public static void main(String[] args) {
	String s="Hellomoon";
	char[] arr = s.toCharArray();
	HashMap <Character,Integer> map = new HashMap<>();
	
	for (char c : arr) {
		if (map.containsKey(c)) {
			map.put(c,map.get(c)+1);
		}
		else {
			map.put(c, 1);
		}
	}
	for (Map.Entry<Character,Integer> Pair : map.entrySet()) {
		System.out.println(Pair.getKey()+"--->"+Pair.getValue());
	}
   	}

}
