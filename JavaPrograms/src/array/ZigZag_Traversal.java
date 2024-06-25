package array;

public class ZigZag_Traversal {
  public static void main(String []args) {
	  int[][]mat= {
			  {1,2,3,4,5},
			  {6,7,8,9,11},
			  {3,2,5,4,6},
			  {7,8,9,1,2}
	  };
	  for(int i=0; i<mat.length;i++) 
		  if(i%2==0) 
		  {
			  for(int j=mat[0].length-1;j>=0;j--) 
			  {
				  System.out.print(mat[i][j]+" ");
			  }
		  }
		 else {
				 for(int j=0;j<mat[0].length;j++) 
				 {
					 System.out.print(mat[i][j]+" ");
				 }
			  }
		  }
	  }
  
     