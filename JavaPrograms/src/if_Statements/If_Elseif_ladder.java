package if_Statements;

public class If_Elseif_ladder {

		public static void main(String[] args) {  
		    int marks=92;  
		      
		    if(marks<33){  
		        System.out.println("fail");  
		    }  
		    else if(marks>=33 && marks<40){  
		        System.out.println("D grade");  
		    }  
		    else if(marks>=41 && marks<60){  
		        System.out.println("C grade");  
		    }  
		    else if(marks>=61 && marks<70){  
		        System.out.println("B grade");  
		    }  
		    else if(marks>=70 && marks<80){  
		        System.out.println("B+ grade");  
		    }else if(marks>=81 && marks<90){  
		        System.out.println("A grade");  
		    }else if(marks>=91 && marks<100){  
		        System.out.println("A+ grade");  
		    }else{  
		        System.out.println("Invalid Enter!");  
		    }  
	}  
}  
