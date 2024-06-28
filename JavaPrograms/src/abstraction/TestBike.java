package abstraction;
abstract class Bike{
	Bike(){
		System.out.println("Bike is Created");
	}
   abstract void run();
   void changeGear() {
	   System.out.println("Gear Changed");
   }
}
class Honda extends Bike{
	void run() {
		System.out.println("Running safely");
	}
}

public class TestBike {
 public static void main(String args[]) {
	 Bike obj = new Honda();
	 obj.run();
	 obj.changeGear();
 }
}

