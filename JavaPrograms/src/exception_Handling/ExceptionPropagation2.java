package exception_Handling;

public class ExceptionPropagation2 {
		  void m(){  
		    int data=50/0;  
		  }  
		  void n(){  
		    m();  
		  }  
		  void p(){  
		   try{  
		    n();  
		   }catch(Exception e){System.out.println("exception handled");}  
		  }  
		  public static void main(String args[]){  
		   ExceptionPropagation2 obj=new ExceptionPropagation2();  
		   obj.p();  
		   System.out.println("normal flow...");  
		  }  
		}  

