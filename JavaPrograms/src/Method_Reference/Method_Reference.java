package Method_Reference;

//Reference to a static method

public class Method_Reference {
 public static void Saysomething() {
	 System.out.println("Hello, This is Static Method");
 }
	public static void main(String[] args) {
    //Referring static method
    Sayable sayable = Method_Reference::Saysomething;
    
    //calling interface method
    sayable.say();
	}

}
