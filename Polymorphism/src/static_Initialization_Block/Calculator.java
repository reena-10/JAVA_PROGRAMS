package static_Initialization_Block;

public class Calculator {
  //Static initialization block
	static int num1;
	static int num2;
	static int add,sub,mul,div,rem;
	static {
		num1 =10;
		num2 =20;
		add=num1+num2;
		sub=num2-num1;
		mul=num1*num2;
		div=num2/num1;
		rem=num2%num1;
	}
public static void main(String[]args) { 
//Directly print the value of num1 and num2
	System.out.println("num1:"+ Calculator.num1);
	System.out.println("num1:"+ Calculator.num2);
	//Perform Addition
	System.out.println("\nAddition: "+ Calculator.add);
	//Perform Subtraction
	System.out.println("Subtraction: "+ Calculator.sub);
	//Perform Multiplication
	System.out.println("Multiplication: "+ Calculator.mul);
	//Perform Division
	System.out.println("Division: "+ Calculator.div);
 }
}
// the values of num1 and num2 are assigned before any object is created, 
//thanks to the static initialization block. 



