
public class Practice3 {

    static void Swap(int a , int b) {
    	int temp = a;
    	a=b;
    	b=temp;
    	System.out.println("a="+a);
    	System.out.println("b="+b);
    }
	public static void main(String[] args) {
		System.out.println("Value of a is 2 and b is 3 : ");
		System.out.println("AfterSwaping");
		Swap(2,3);
	}
	}
