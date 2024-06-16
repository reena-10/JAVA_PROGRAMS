package static_method;

public class CalculateCude {
static int cube(int x) {
	return x*x*x;
}
	public static void main(String[] args) {
    int result=CalculateCude.cube(5);
    System.out.println("The Cube of 5 is "+result);
	}

}
