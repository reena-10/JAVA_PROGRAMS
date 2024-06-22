package inheritance;

public class B extends A{ //Sub class of A
  void multiply() {
	  a=10; b=90;
	  c=a*b;
	  System.out.println("Multiplication of a and b is "+c);
  }
  void divide() {
	  a=90; b=10;
	  c=a/b;
	  System.out.println("Division of a and b is "+c);
  }
}
