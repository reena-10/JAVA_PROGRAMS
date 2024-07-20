package multiThreading;

public class ThreadC extends Thread {
@Override
public void run() {
	for(int i=20; i<30;i++) {
		System.out.println("Inside run method of ThreadB "+i);
	}
	System.out.println("End of ThreadC");
}
}
