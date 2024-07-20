package multiThreading;

public class ThreadA extends Thread{
@Override
 public void run() {
	 for(int i=0; i<10; i++) {
		 System.out.println("inside run method of ThreadA"+i);
	 }
	 System.out.println("End of ThreadA");
 }
}
