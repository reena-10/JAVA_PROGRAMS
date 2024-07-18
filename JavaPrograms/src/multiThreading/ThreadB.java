package multiThreading;

public class ThreadB extends Thread {
@Override
public void run() {
	for (int i= 50; i<60; i++) {
		System.out.println("Inside run method of ");
	}
	System.out.println("End of ThreadB");
}
}
