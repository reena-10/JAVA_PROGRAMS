package array;

public class N_Traversal {

	public static void main(String[] args) {
      int [][]mat= {
    		  {1,2,3},
    		  {4,5,6},
    		  {7,8,9}
      };
      for (int i=mat.length-1;i>=0;i--) {
    	  System.out.print(mat[i][0]+" ");
      }
      for(int i =1;i<mat.length-1;i++)
      {
    	  System.out.print(mat[i][i]+" ");
      }
          for(int i=mat.length-1;i>=0;i--) {
    	  System.out.print(mat[i][mat[0].length-1]+" ");
      }
	}

}
