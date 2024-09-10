package Method_Reference;

public class Instance_Method_Reference {
    public void Saysomething() {
    	System.out.println("Hello , This is non static method.");
    }
	public static void main(String[] args) {
		Instance_Method_Reference MethodReference = new Instance_Method_Reference();
		
		//Referring non static method using Reference
		Sayable sayable1 = MethodReference::Saysomething;
		sayable1.say();
		
		Sayable sayable2 = new Instance_Method_Reference()::Saysomething;
		sayable2.say();
	}

}
