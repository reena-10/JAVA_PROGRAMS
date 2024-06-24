package this_Keyword;
//this keyword can also Pass as an argument in the method.
public class Example_2 {
 void java(Example_2 obj) {
	 System.out.println("Method Is Invoked");
 }
 void display() {
	java(this) ;
 }
 public static void main(String args[]) {
	 Example_2 myobj =new Example_2();
	 myobj.display();
 }
}
