package practice;

import java.util.Arrays;

public class Practice1 {
	public String Convert_Array(int[]array) {
	      String s1 =Arrays.toString(array);
			
			
			
			String s2 = s1.replaceAll(" ", "");
			String s3 = s2.replaceAll(",", "");
			
			
			return s3;
			
		}
		
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5};
		
		Practice1 c = new Practice1();
		System.out.println("After converting:"+c.Convert_Array(array));
		
	}

}
