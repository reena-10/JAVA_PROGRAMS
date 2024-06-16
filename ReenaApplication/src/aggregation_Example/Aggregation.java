package aggregation_Example;

public class Aggregation {
	
		int id;
	    String name;
	    Address address;

		public Aggregation(int id,String name,Address address) {
		 this.id=id;
	     this.name=name;
	     this.address=address;
		
		}
		void display() {
			System.out.println(id+""+name);
			System.out.println(address.City+ ""+address.State+""+address.Country); //print address the employee
		}
		public static void main(String[] args) {
			Address add1 = new Address("Bhopal ,","Madhaya Pradesh ," ,"India ");
			Address add2 = new Address("Patna ","Bihar ","India");
			
			Aggregation emp1 =new Aggregation(101," Reena",add1);
			Aggregation emp2 =new Aggregation(102," Riya",add2);
			emp1.display();
			emp2.display();

	         }
	      
}
