package hierarchical_inheritance;

public class Refrigerator extends Appliance { //Derived class
 public int capacity;
 public int temperature;

 void Display_Temperature() {
	 capacity= 54;
	 temperature= -10;
	 System.out.println("capacity: " + capacity);
     System.out.println("Refrigerator Temperature: " + temperature + "°C");

   }
 }