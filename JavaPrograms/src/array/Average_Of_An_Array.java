package array;
import java.util.Scanner;
public class Average_Of_An_Array {

	public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int size = sc.nextInt();
    int nums[] = new int[size];
    System.out.println("Enter the Elements of an Array");
    for(int i=0;i<nums.length;i++) {
    	nums[i]=sc.nextInt();
    }
    int sum =0;
    int count=0;
    
    for(int i=0; i<nums.length;i++) {
    	count++;
    	sum= sum+nums[i];
    }
    System.out.println("Sum of an Array is : "+sum);
    System.out.println("Total No. of element : "+count);
    
    int average = sum/count;
    System.out.println("Average of an Array :"+average);
    
	}

}
