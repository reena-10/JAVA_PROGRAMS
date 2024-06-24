package this_Keyword;
// this keyword used for constructor chaining.
public class Example_3 {
     int a;
     int b;
     //Default Constructor
     Example_3(){
    	 this(10,20);
    	 System.out.println("Inside default Constructor\n");
     }
     
     //Parameterized Constructor
     
     Example_3 (int a, int b)
     {
    	this.a=a;
    	this.b=b;
    	System.out.println("Inside parameterized constructor");
     }
     
	public static void main(String[] args) {
		
		Example_3 myobj = new Example_3();
 }
}
