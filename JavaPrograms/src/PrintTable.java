
public class PrintTable {

	public static void main(String[] args) {
		
		//Print table without any loop
		
		System.out.println(23*1);
		System.out.println(23*2);
		System.out.println(23*3);
		System.out.println(23*4);
		System.out.println(23*5);
		System.out.println(23*6);
		System.out.println(23*7);
		System.out.println(23*8);
		System.out.println(23*9);
		System.out.println(23*10);
		
		
		//second way to print table of 23 using for loop
		int a =23;
		for(int i=1;i<=10;i++)
		{
			//System.out.println(a*i);
			//0r
			System.out.println(a+ "x" +i+"="+a*i);
					
		}
		//Print table 1 to 1000
		
		 for(int i=1;i<=1000;i++)
		 {
			 System.out.println(i);
		 }
		 
		//Nested Loop
		 for(int i=1; i<=3;i++)
		 { 
			 System.out.println("Hello");
			 
			 for(int j=1;j<=5;j++)
			 {
				 System.out.println("I am Reena");
			 }
			 
			 
		 System.out.println("Done!");
		 }
		}
	}


	
