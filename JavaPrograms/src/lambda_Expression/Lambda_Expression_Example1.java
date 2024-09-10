package lambda_Expression;
//Example 1
public class Lambda_Expression_Example1 {

	public static void main(String[] args) {
    int width = 10;
    
    Drawable d2 = () ->{
    	System.out.println("Drawing "+width);
    };
    d2.draw();  
	}

}
