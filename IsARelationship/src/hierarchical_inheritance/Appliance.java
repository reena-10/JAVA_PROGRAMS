package hierarchical_inheritance;

public class Appliance { //Parent class
  public String brand;
  public double powerConsumption;
  public boolean isOn;
  
   void Display_Appliance() {
	   brand="Samsung";
	   powerConsumption=150;
	  System.out.println("\nBrand:"+brand);
	  System.out.println("Power Consumption:"+powerConsumption+ "watts");	  
  }
  public void turn_on() {
	  isOn=true;
	  System.out.println("\n" +brand+ " is now on");
  }
  public void turn_off() {
	  isOn=false;
	  System.out.println(brand+ " is now off");
  }
}
