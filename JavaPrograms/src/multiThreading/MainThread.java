package multiThreading;

public class MainThread {
public static void main(String[]args) {
	Thread_A T1 = new Thread_A();
	Thread_B T2 = new Thread_B();
	
	Thread t1 = new Thread(T1);
	Thread t2 = new Thread(T2);
	
	t1.setName("Shudhansu");
	t2.setName("Himanshu");
	
	t1.start();
	t2.start();
}
}
