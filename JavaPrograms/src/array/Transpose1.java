package array;

public class Transpose1 {

  public static void main(String args[]){  
    int original[][]={{0,0,0},
		{1,1,1},
		{2,2,2}
	   };    
		int transpose[][]=new int[3][3];  
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		transpose[i][j]=original[j][i];  
		}    
	 }    
		  
		System.out.println("Printing Matrix After Transpose:");  
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		System.out.print(transpose[i][j]+" ");    
	}    
		System.out.println();
   }    
 }
}