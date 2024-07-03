package downCasting;

import downCasting.Parent;
import downCasting.Parent.Child;

public class TestDownCasting {
	
	
		    
		    public static void main(String[] args)   
		    {   
		        Parent p = new Child();  
		        p.name = "Aman";  
		          
		        // Performing Downcasting Implicitly   
		        //Child c = new Parent(); // it gives compile-time error   
		          
		        // Performing Downcasting Explicitly   
		        Child c = (Child)p;   
		    
		        c.age = 22;   
		        System.out.println(c.name);   
		        System.out.println(c.age);   
		        c.showMessage();   
		    }   
		}  




