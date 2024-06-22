package aggregation;

public class Employee {
		int id;  
		String name;  
		Address2 address;  
		  
		public Employee(int id, String name,Address2 address) {  
		    this.id = id;  
		    this.name = name;  
		    this.address=address;  
		}  
		  
		void display(){  
		System.out.println(id+" "+name);  
		System.out.println(address.city+" "+address.state+" "+address.country);  
		}  
		  
		public static void main(String[] args) {  
			Address2   address1=new Address2("gzb","UP","india");  
			Address2 address2=new Address2("gno","UP","india");  
		  
		Employee e=new Employee(111,"varun",address1);  
		Employee e2=new Employee(112,"arun",address2);  
		      
		e.display();  
		e2.display();  
		      
		}  
		}  
