package static_Keyword;

public class Static_Class {
private static String str ="Hellooooo! ";
static class My2ndClass{
	public void display() {
		System.out.println(str);
	}
}
	public static void main(String[] args) {
    Static_Class.My2ndClass obj = new Static_Class.My2ndClass();
    obj.display();
	}

  }
