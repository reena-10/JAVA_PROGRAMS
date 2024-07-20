package multiThreading;

public class RunThread implements Runnable {
public void run() {
	for(int i= 0; i<15; i++) {
		String tname  = Thread.currentThread().getName();
		System.out.println(tname+" is running");
	}
}
	public static void main(String[] args) {
     RunThread obj = new RunThread();
     
     Thread one = new Thread(obj);
     Thread two = new Thread(obj);
     
    one.setName("Priyanshu Thread");
    two.setName("Priya Thread");
    
    one.start();
    two.start();
	}

}
