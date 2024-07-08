package vector;
import java.util.*;
public class VectorExample {
  public static void main(String[]args) {
      Vector<Integer> num = new Vector<>();
      num.add(10);
      num.add(20);
      num.add(30);
      num.add(40);
      num.add(50);
      System.out.println("Original Vector");
      System.out.println(num);
      
      num.remove(2);
      System.out.println("\nIndex [2] Value is Changed");
      num.add(2,35);
      
      System.out.println(num);
      boolean contains =num.contains(40);
      System.out.println("\nContains 40:"+contains);
      num.clear();
      System.out.println("After Clearing Elements");
      System.out.println(num);
  }
}
