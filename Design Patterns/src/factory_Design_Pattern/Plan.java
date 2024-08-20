package factory_Design_Pattern;

 abstract class Plan {
 protected double rate;
 abstract void getRate();
 
 public void calculationBill(int units) {
	 System.out.println(units*rate);
 }
}
