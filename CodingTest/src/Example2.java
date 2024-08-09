
public class Example2 {
  public void NormalMethod(int i) {
	  System.out.println("running "+i+" km");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Example2 j = new Example2();
   Sum kk = j::NormalMethod;
   kk.calculation(5);
	}

}
