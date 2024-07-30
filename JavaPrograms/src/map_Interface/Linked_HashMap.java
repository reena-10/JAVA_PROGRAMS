package map_Interface;


		import java.util.HashMap;
		import java.util.LinkedHashMap;
		import java.util.Map;

		public class Linked_HashMap {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

				
				LinkedHashMap<String, String> country = new LinkedHashMap<>();
				country.put(" Bihar ", "  patna");
				country.put(" france ", " paris ");
				country.put(" Japan ", " tokyo ");
				
				
				
				for(Map.Entry<String, String>m : country.entrySet()) {
					
					System.out.println(m);
				}
				
			}

		}
	


