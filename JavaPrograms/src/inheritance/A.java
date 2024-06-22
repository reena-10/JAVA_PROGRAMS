package inheritance;
//Example of Multilevel inheritance
public class A { //super class
 int a,b,c;
 void add() { 
	 a=90 ; b=10; 
	 c=a+b;
	 System.out.println("Addition of a and b is "+c);
 }
 void subtract() {
	 a=90;b=10;
	 c=a-b;
	 System.out.println("Subtraction of a and b is "+c);
 }
}
