package practice;
//Best for interviews
//Time complexity = O(n)
//Space complexity = O(1)

public class Fibonacci_using_BottomUp_Dynamic_Programming {
 static int fibo(int n) {
	 if (n<=1)
	 return 0;
	 int a=0, b=1,c=0;
	 for(int i=2;i<=n;i++) {
		 c=a+b;
		 a=b;
		 b=c;
	 }
	 return b;
 }
	public static void main(String[] args) {
    int n=7;
    for(int i=1; i<=n; i++ ) {
    	System.out.print(fibo(i)+" ");
    }
	}

}
