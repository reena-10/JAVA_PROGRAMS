package lambda_Expression;
//Example 2 (single parameter)
public class LambdaExpression_Example2 {

	public static void main(String[] args) {
      Sayable s1 = (name) -> {
    	return "Hello, "+name;  
      };
      System.out.println(s1.Say("Sonoo"));
      
      //you can omit fuction parentheses
      
      Sayable s2 = name -> {
    	  return "Hello, "+name;
      };
      System.out.println(s2.Say("Reenu"));
	}

}
