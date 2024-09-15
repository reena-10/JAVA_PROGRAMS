package singleton_Design_Pattern;

public class Main {
  public static void main(String[] args) {
	  Singleton singleton1 = Singleton.getInstance();
	  Singleton singleton2 = Singleton.getInstance();
	  
	  //Both singleton1 and singleton2 will refer to the same instance.
	  System.out.println(singleton1 == singleton2);
  }
}
