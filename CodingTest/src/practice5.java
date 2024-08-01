
public class practice5 {
  static int mul(int a , int b) {
	 return a*=b;  
   }
   static int div(int a , int b) {
	   return a%=b;
   }
   static int add(int a , int b) {
	   return a+=b;
   }
   static int sub(int a , int b) {
	   return a-=b;
   }
   static int rem(int a, int b) {
	   return a/=b;
   }
  public static void main(String[] args) {
  System.out.println("Multiply of 2 and 8 is "+ mul(2,8));
  System.out.println("Division of 2 and 8 is "+ div(2,8));
  System.out.println("additon of 2 and 8 is "+ add(2,8));
  System.out.println("subtraction of 2 and 8 is " + sub(2,8));
  System.out.println("Reminder of 2 and 8 is " +rem(2,8));
	}

}
