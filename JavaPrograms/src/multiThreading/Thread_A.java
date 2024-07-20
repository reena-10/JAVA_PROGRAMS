package multiThreading;
//Thread_A , Thread_B , MainThread
public class Thread_A implements Runnable{
@Override
public void run() {
	for (int i= 0;i<20;i++) {
		String tname  = Thread.currentThread().getName();
		System.out.println(tname+ " is running");
	}
  }
}