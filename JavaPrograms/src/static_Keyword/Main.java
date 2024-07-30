package static_Keyword;

public class Main {
  //Static Method
  static void myStaticMethod() {
	System.out.println ("Static methods caan be called without creating objects"); 
  }
  //Public method
  public void myPublicMethod() {
	  System.out.println("Public methods must be called by creating objects");
  }
  //Main method
  public static void main(String[] args) {
    myStaticMethod(); //Call the static method
    //myPublicMethod();    This would output an error
    
    Main myobj = new Main(); //Create an Object of Main
    myobj.myPublicMethod(); //Call the public method
  }

}
