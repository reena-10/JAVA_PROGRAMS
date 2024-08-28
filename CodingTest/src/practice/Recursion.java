package practice;

public class Recursion {
	//without recursion
    public static void num(int a) {
    	for(int i =a;i>=1;i--) {
    		System.out.println(i);
    	}
    	System.out.println();
    }
    //with recursion
    public static void print(int i) {
    	if(i>0) {
    		print(i-1);
    		System.out.println(i+" ");
    	}
   }
    //print sum of digits
    public static int sum(int b) {
      if(b==0) {
    	  return 0;
      }else {
    	  int n =b%10;
    	  b = b/10;
    	  return n+sum(b);
      }
    }
    
    public static void fibonacci(int a,int b) {
    if(a!=0 && b!=0) {
    	System.out.println(a+b);
    }
    	
    }
	public static void main(String[] args) {
     num(10);
     print(5);
    System.out.println("\nSum of Digits : "+ sum(123));
	}

}
