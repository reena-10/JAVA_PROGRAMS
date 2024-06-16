package method_Overloading;

public class Calculator {
	void calculateSum(int a, int b) {
		int Sum;
		Sum=a+b;
		System.out.println("Sum of 2 integers: "+Sum);
	}
    void calculatesum(double x,double y,double z) {
    	double Sum;
    	Sum=x+y+z;
    	System.out.println("Sum of 3 Double: "+Sum);
    }
     void calculatesum() {
    	int arr[] = {1,2,3,4,5};
    	int Sum=0;
    	for(int i=0;i<arr.length;i++)
    	Sum += arr[i];
    	System.out.println("Sum of an array of integers: " +Sum);
    }
     public static void main(String [] args) {
    	 Calculator calculator = new Calculator();
    	 calculator.calculateSum(2,3);
    	 calculator.calculatesum(1.2,2.3,3.4);
    	 calculator.calculatesum();
     }
}
