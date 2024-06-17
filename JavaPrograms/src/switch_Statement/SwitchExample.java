package switch_Statement;

public class SwitchExample {
  public static void  main (String []args) {
	  int day;
	  day=7;
	  switch (day) {
		  case 1:{
			 System.out.println("Its Monday");
			   }
		 break;
		 case 2:{
				 System.out.println("Its Tuesday");
		        }
		 break;
		 case 3:{
			    System.out.println("Its Wednesday");
		       }
		 break;
		 case 4:{
			    System.out.println("Its Thurday");
		        }
		 break;
		 case 5:{
			 System.out.println("Its friday");
		 }
		 break;
		 case 6:{
			 System.out.println("Its Saturday");
		 }
		 break;
		 case 7:{
			 System.out.println("Its Sunday");
		 }
         break;
         default :{
        	 System.out.println("Invaild...!");
	              }
             }
     }
}