import java.util.Scanner;

public class Matrix_Addition {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no. of rows");
    int rows = sc.nextInt();
    System.out.println("Enter no. of cols");
    int cols = sc.nextInt();
    
    //create matrix1
   Integer[][] matrix1 = new Integer[rows][cols];
   Integer[][] matrix2 = new Integer[rows][cols];
   Integer[][] result = new Integer[rows][cols];
   
   //take input for matrix1
   System.out.println("Enter the Elements of matrix 1");
   for(int i=0;i<rows;i++) {
	  for(int j=0;j<cols;j++) {
		  matrix1[i][j]=sc.nextInt();
	  }
   }
   //take input for matrix2
   System.out.println("Enter the Elements of matrix 2");
   for(int i=0;i<rows;i++) {
	   for(int j=0;j<cols;j++) {
		matrix2[i][j]=sc.nextInt();   
	   }
   }
   //add matrix 1 and matrix 2
   System.out.println("Sum of matrix1 and matrix2 is: ");
   for(int i=0;i<rows;i++) {
	   for(int j=0; j<cols; j++) {
		   result[i][j] = matrix1[i][j] + matrix2[i][j];
	  System.out.print(result[i][j]+" ");//print result 
	  }
	   System.out.println();
   }
  
 }

}
