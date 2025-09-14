package practice;

public class Fibonacci_Using_Recursive_Approach {
  static int fibo(int n) {
	  //Base Case
	  if(n<=1)
		  return n;
	  
	  //Recursive call
	  return fibo(n-1)+fibo(n-2);
	  
  }
	public static void main(String[] args) {
    int N=9;
    
    //print the first N numbers
    for(int i=0; i<N ; i++) {
    	System.out.print(fibo(i)+" ");
    }
	}

}
