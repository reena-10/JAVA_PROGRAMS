package practice;

public class Inheritance2 extends Inheritance1{
    void Method2() {
    	System.out.println("Hello, I am Method 3");
    }
	public static void main(String[] args) {
    Inheritance2 obj = new Inheritance2();
    obj.Method();
    obj.Method1();
    obj.Method2();
	}

}
