package exception_Handling;

public class Example_1 {
		  public static void main(String args[]){  
		   try{  
		      //code that may raise exception  
		      int a=14/0;  
		   }catch(ArithmeticException e){
			   System.out.println(e);
			   }  
		   System.out.println("rest of the code...");  
		  }  
		}  


