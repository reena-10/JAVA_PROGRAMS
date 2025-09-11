package Easy_Questions;

//Move all the zero to the End.
//Approach Two Pointers with Swapping
public class Move_All_Zero_The_End {
   static void MoveZeros(int arr[]) {
	   int size = arr.length;
	   if(size==0||size==1) {
		   return;
	   }
	   int nz=0,z=0;
	   
	   while(nz < size) {
		   if(arr[nz]!=0) {
			   int temp = arr[nz];
			   arr[nz]=arr[z];
			   arr[z]=temp;
			   nz++;
			   z++;
		   }else {
			   nz++;
		   }
	   }
   }
	public static void main(String[] args) {
    int arr[] = {0,3,2,0,4,0,5,0};
    MoveZeros(arr);
    for(int num : arr) {
    	System.out.print(num+" ");
    }
    
	}

}

//  Time complexity -> O(n); Each element is visited once.
//  Space complexity -> O(1); work in place, no extra array.
