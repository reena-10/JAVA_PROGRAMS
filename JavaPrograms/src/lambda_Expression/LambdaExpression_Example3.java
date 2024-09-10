package lambda_Expression;

public class LambdaExpression_Example3 {

	public static void main(String[] args) {
    Operations ad1 = (a,b)->(a+b);
    System.out.println("Perform addition here ---->"+ad1.Value(10, 20));
    
    Operations ad2 = (int a,int b)->(a-b);
    System.out.println("Perform subtraction here ---->"+ad2.Value(100,50));
    
    Operations ad3 =(int a ,int b)->(a*b);
    System.out.println("Perform Multipication here ---->"+ad3.Value(120,20));
    
    Operations ad4 = (int a, int b)->(a/b);
    System.out.println("Perform division here ---->"+ad4.Value(13, 8));
	}

}
