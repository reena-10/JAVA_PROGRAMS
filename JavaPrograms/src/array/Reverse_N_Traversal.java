package array;

public class Reverse_N_Traversal {

	public static void main(String[] args) {
		int [][] mat = {
	    		  {1,2,3},
	    		  {4,5,6},
	    		  {7,8,9}
	      };
		for(int i=0;i<mat.length;i++) {
			System.out.print(mat[i][0]+" ");
		}
		for(int i=1;i<mat.length-1;i++) {
			System.out.print(mat[i][i]+" ");
		}
		for(int i=0;i<mat.length;i++) {
			System.out.print(mat[i][2]+" ");

		}
		}
	}


