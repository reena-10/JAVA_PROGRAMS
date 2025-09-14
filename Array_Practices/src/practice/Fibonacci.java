package practice;

// Fibonacci series program in java
//using iterative approach

public class Fibonacci {
  //Function to print N fibonacci Number
  static void fibonacci(int N) {
	  int n1 =0,n2 =1;
	  for(int i=0; i<N;i++) {
		  System.out.print(n1+" ");
		  //swap
		  int n3=n2+n1;
		  n1 = n2;
		  n2 = n3;
	  }
  }
	public static void main(String[] args) {
     //Given Number N
		int N =10;
		
		//Function call
		fibonacci(N);
     
	}

}
