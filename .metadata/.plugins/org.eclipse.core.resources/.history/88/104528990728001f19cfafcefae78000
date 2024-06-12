package inheritance;

public class WashingMachine extends Appliance{
  private int size;
  private String type;
  private String methodofwork;
  
  public WashingMachine(int size, String type, String methodofwork) {
	  this.size=size;
	  this.type=type;
	  this.methodofwork= methodofwork;
  }
  public void PrintInfo() {
	  System.out.println("Size:"+size);
	  System.out.println("Type:"+type);
	  System.out.println("MethodOfWork:"+methodofwork);
  }
  public static void main(String[]args) {
	  WashingMachine wm1 = new WashingMachine(5,"Front Load","Automatic");
	  WashingMachine wm2 = new WashingMachine(4,"Top Load","Semi-Automatic");
	  
	  wm1.PrintInfo();
	  wm2.PrintInfo();

  }
}
