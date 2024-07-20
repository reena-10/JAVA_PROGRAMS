package multiThreading;

public class ThreadOne implements Runnable {
@Override
public void run() {
	for (int i= 20; i<40;i++) {
		System.out.println("Inside run() of ThreadOne");
	}
}
public static void main(String []args) {
	ThreadOne t1 = new ThreadOne();
	Thread t = new Thread(t1);
	t.start();
	
	for(int i = 20;i<40;i++) {
		System.out.println("Inside main of ThreadOne"+i);
	}
}
}
