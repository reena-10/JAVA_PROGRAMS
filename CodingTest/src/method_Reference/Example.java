package method_Reference;

public class Example {
  public static void notLikeRun() {
	  System.out.println("Thread is working.");
  }
	public static void main(String[] args) {
    Thread t1 = new Thread(Example::notLikeRun);
    t1.start();
	}

}
