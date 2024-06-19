package javaBean;


public class Address2 {
		
		public static void main(String[] args) {
			
			
			Address add1  =  new Address();
			
			add1.setCity("Bhopal");
			add1.setPincode("4622003");
			add1.setState("MP");
			
			Employee e1  = new Employee() ;
			
			e1.setEmployee_Id(101);
			e1.setEmployee_Name("Shubham")  ;
			e1.setAddress(add1);
			
			System.out.println("I am coming from "+e1.getAddress().getCity());
			System.out.println(e1);
			
			
			Employee e2   = new Employee(110, "Neha" , new Address("Ujjain" , "MP" , "469875")) ;
			System.out.println(e2);
			
			
			
		}
	}

