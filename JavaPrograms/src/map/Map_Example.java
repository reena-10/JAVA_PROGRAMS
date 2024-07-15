package map;

import java.util.HashMap;
import java.util.Map;

public class Map_Example {

	public static void main(String[] args) {
		
		HashMap<String , Boolean> mp  = new HashMap<>() ;
		
		mp.put("Value 1" , true  ) ;
		mp.put("Value 2" , false ) ;
		mp.put("Value 3" , true  ) ;
		
		mp.put("Value 4" , true  ) ;
		
		mp.put("Value 5" , true  ) ;
		
		
		
		for( Map.Entry<String , Boolean> ee :mp.entrySet()) {
			System.out.println(ee);
			
		}
		
	}
}
