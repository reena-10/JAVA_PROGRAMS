package this_Keyword;
//  Invoke the method of the current class by using the this keyword.
public class Example_1 {
  void Java() {
	  System.out.println("Hello Java Learner");
  }
  void Pyhton() {
	  System.out.println("Hello Pyhton Learner");
	  this.Java();
  }
}
