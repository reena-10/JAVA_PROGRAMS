
public class ButterFly_Pattern {

	public static void butterFly(int n) {
		//1st half
		for(int i=1; i<=n ;i++) {
			//star = i
			for(int j =1 ; j<=i ; j++) {
				System.out.print("*");
			}
			
			//Spaces - 2*(n-i)
			for(int j =1; j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			// Stars-i
			for(int j =1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		//2nd Half
		for(int i=n;i>=1;i--) {
			//star = i
			for(int j =1 ; j<=i ; j++) {
				System.out.print("*");
			}
			
			//Spaces - 2*(n-i)
			for(int j =1; j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			// Stars-i
			for(int j =1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	public static void main(String[] args) {
    butterFly(5);
	}

}
