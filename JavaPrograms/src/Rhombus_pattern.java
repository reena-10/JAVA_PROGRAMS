
public class Rhombus_pattern {

	public static void rhombus_pattern(int n) {
		for(int i=1 ;i<=n ; i++) {
			//Spaces
			for(int j =1; j<=(n-i);j++) {
				System.out.print(" ");
			}
			//Stars
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
    rhombus_pattern(10);
	}

}
