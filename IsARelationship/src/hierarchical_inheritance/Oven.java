package hierarchical_inheritance;

public class Oven extends Appliance { //derived class of appliance
  public int maxtemperature;
  public int temperature;
  
	void Display_Oven() {
		maxtemperature =100;
		temperature=30;
		System.out.println(" Samsung Oven Maximum Temperature: " + maxtemperature + "°C");
        System.out.println("Oven Temperature: " + temperature + "°C");
	}

public static void main(String[]args) {
	//Create instances of Refrigerator and Oven
	Refrigerator fridge = new Refrigerator();
	fridge.Display_Appliance();
    fridge.turn_on();
    fridge.Display_Temperature();
    fridge.turn_off();

	Oven oven = new Oven();
	oven.Display_Appliance();
	oven.turn_on();
	oven.Display_Oven();
	oven.turn_off();
 }
}