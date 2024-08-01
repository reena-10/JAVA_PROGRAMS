
public class Pratice4 {
	static int factorial(int n) {
	int r =1 ,i;
    for(i=2; i<=n;i++) 
    	r*=i;
    return r;
    }

	public static void main(String[] args) {
		System.out.println("Fcatorial of 9 is "+factorial(9));
    	}

}
