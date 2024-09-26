package practice;

public class Swapping_with_3Variable {

	static void swap(int m , int n) {
		int temp =m;
		m=n;
		n=temp;
		System.out.println("Value of m is "+m+" and Value of n is "+n);
	}
	public static void main(String[] args) {
    int m=9 ,n=5;
    swap(m,n);
	}

}
