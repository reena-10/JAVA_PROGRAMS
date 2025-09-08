package Easy_Questions;

//Count positive, negative, and zero elements in an array.

public class Count_Positive_Negative_and_Zeros {

	static void Count_P_N_Z(int arr []) {
		int positive_count =0;
		int negative_count=0;
		int zeros_count=0;
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==0)
				 zeros_count++;
			if(arr[i]>0)
				 positive_count++;
			if(arr[i]<0)
				negative_count++;
		}
		System.out.println(zeros_count);
		System.out.println(positive_count);
		System.out.println(negative_count);

	}
		public static void main(String[] args) {
			int arr[] = {2,3,-2,0,4,5,-1,0,-3};
            Count_P_N_Z(arr);
	}

}
