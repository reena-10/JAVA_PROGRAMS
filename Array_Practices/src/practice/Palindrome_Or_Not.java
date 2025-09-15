package practice;

public class Palindrome_Or_Not {
	//Recursive Function
  static int palindrome_fun(int n, int rev) {
	  if(n<10) {
		  return rev*10+n;
	  }else {
		  int last_digit = n%10;
		  rev = rev*10+last_digit;
		  return palindrome_fun(n/10,rev);
	  }
  }
	public static void main(String[] args) {
     int n = 123464321;
     int rev = palindrome_fun(n,0);
     System.out.println("Reverse of n = "+rev);
     
     //checking if n is same
     //as reverse of n
     if(n==rev)
    	 System.out.println("Palindrome = Yes");
     else 
    	 System.out.println("Plaindrome = No");
	}

}
