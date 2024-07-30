package map_Interface;

import java.util.HashMap;
import java.util.Map.Entry;

public class FrequencyOfInteger {

	public static void main(String[] args) {
		int arr[] = {1,2,4,6,8,9,4,2,2,46};

	HashMap<Integer,Integer> map = new HashMap<>();
				
	for(int c : arr) {
	  if(map.containsKey(c)) {
		   map.put(c, map.get(c)+1) ;
					   
	    }
		else {
					   
			 map.put(c, 1) ;
		}
					
	}
				
 for( Entry<Integer, Integer> Frequency : map.entrySet() ) {
		    	  
	System.out.println(Frequency.getKey()+"----->"+Frequency.getValue());
  }
				
				
 }
}


