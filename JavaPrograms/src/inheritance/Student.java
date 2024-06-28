package inheritance;
//Example of Single level inheritance
public class Student { //base class
  int rollno;
  String name;
  String subject;
  void display() {
	  System.out.println("Enter Roll no ,Subject ,Marks ");
  }
}
  class Reena extends Student//sub-class
  {
	  void show() {
		  rollno =101;
		  name="Reena";
		  subject="BCA";
		  System.out.println(rollno+" "+name+" "+subject);
 }
  
	  public static void main(String []args) {
		  Reena r = new Reena();
		  r.display();
		  r.show();
	  }
  
  }
