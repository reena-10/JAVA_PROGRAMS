package arrayList;
import java.util.ArrayList; // import the ArrayList class



public class Demo {
	public static void main(String []args) {
   ArrayList<String> arrofString = new ArrayList<>();
   arrofString.add("Reena");
   arrofString.add("Vanika");
   arrofString.add("Monali");
   arrofString.add("Rahul");
   arrofString.add("Rohit");
   
   System.out.println("Before removing element");
   for(String i:arrofString) {
	   System.out.println(i);
   }
   arrofString.remove(0);
   arrofString.remove(arrofString.size()-1);
   System.out.println("\n After removing elements");
   for(String i : arrofString) {
	   System.out.println(i);
   }
}
}