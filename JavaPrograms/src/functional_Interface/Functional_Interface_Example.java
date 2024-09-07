package functional_Interface;

public class Functional_Interface_Example implements Sayable {
 public void say(String msg) {
	 System.out.println(msg);
 }
	public static void main(String[] args) {
		Functional_Interface_Example FI = new Functional_Interface_Example();
        FI.say("Hello ,Good Morning");
	}

}
