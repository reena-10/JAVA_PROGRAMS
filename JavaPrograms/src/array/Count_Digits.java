package array;

public class Count_Digits {

	public static void main(String[] args) {
     int [] matrix = {0,1,0,1,1,1,0,2,2,0};
      int count1 =0;
      int count2=0;
      int count3 =0;
      for(int i=0;i<matrix.length;i++) {
    	  
    		  if(matrix[i]==0) {
    			  count1++;
    		  }
    		  if(matrix[i]==1) {
    			  count2++;
    	     }
    		  if(matrix[i]==2) {
    			  count3++;
    		  }
      }
      System.out.println(count1+" "+count2+" "+count3);
}           
}