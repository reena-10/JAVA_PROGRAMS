package final_keyword;

public class Bike {
  final int speedlimit;
  
  Bike(){
	  speedlimit=70;
	  System.out.println(speedlimit);
	  
  }
  public static void main(String args[]) {
	  new Bike();
  }
 
}
