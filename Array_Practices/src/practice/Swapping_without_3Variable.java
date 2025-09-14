package practice;

public class Swapping_without_3Variable {
 static void Swap(int m,int n) {
	 m=m-n;
	 n=m+n;
	 m=n-m;
	 System.out.println(" Value of m is "+m+ " and Value of n is "+n);
 }
	public static void main(String[] args) {
    int m=9,n=5;
    Swap(m,n);
	}

}
