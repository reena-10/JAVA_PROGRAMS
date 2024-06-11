
public class Pattern {

	public static void main(String[] args) {
		//Print Right half Pyramid star Pattern
		
			for(int i=0;i<=5;i++)
			{
				for(int j=0;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println("");
			}
			System.out.println(""); // This line give space between triangle pattern and square pattern
			
			//Print Reverse Right half Pyramid star Pattern
			
			for(int i=1;i<=6;i++)
			{
				for(int j=6;j>=i;j--)
				{
					System.out.print("*");
				}
				System.out.println("");
			}
			System.out.println("");
			
			//Print Star square pattern	
			for (int i=1;i<=5;i++){
				 for(int j=1;j<=5;j++)
			{
				System.out.print("*");
			}
			   System.out.println();
		}
			System.out.println("");//Space
			
			//Print number triangle pattern
			int rows=5;
			for(int i=1; i<=rows;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(j+ "");
				}
				System.out.println();
			}
			System.out.println("");//Space
			
			//Print hollow Square pattern
			for(int i=1;i<=4;i++)
			{
				if(i==1||i==4) {
					for(int j=1;j<=4;j++) {
						System.out.print("*");
					}
				} else {
					for(int j=1;j<=4;j++) {
						if(j==1||j==4) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
					}
				}
			   System.out.println();
			}	
			
			//Another way to Print hollow Square pattern
			for(int i=1;i<=4;i++) {
				for(int j=1;j<=4;j++) {
					if(i==1||i==4||j==1||j==4) {
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
						
				}
				System.out.println();
			}

	}

}
