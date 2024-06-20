package array;

public class Square_matrix {

	public static void main(String[] args) {
      int [][] SquareArr = {{1,2,3},{4,5,6},{7,8,9}};
      for(int i=0;i<SquareArr.length;i++){    
  		for(int j=0;j<SquareArr.length;j++){ 
  			System.out.print(SquareArr[i][j]+1+" ");
  		}
  		System.out.println();
  	}

}
}