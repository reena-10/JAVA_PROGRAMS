package construtor;

public class Employee {
		
		int empolyeeid;
		String empolyeeName;
		String empolyeedepartment;
		int salary;
		int shift;
		 
		public int display() {
			return shift;
			
		}
		//default constructor
		Employee(){};
			
		//parameterized constructor
		public Employee(int empolyeeid , String empolyeeName, String empolyeedepartment , int shift, int salary) 
		{
			
			this.empolyeeName = empolyeeName;
			this.empolyeeid = empolyeeid;
			this.empolyeedepartment =empolyeedepartment;
			this.shift = shift;
			this.salary =salary;
		}
		  
			public static void main(String[] args) {
				
				Employee e1 = new Employee();
				e1.empolyeeid=112;
				e1.empolyeeName= "Reena";
				e1.empolyeedepartment ="IT";
				e1.salary =34098;
				e1.shift = 1;
				
				e1.display();
				//calling methods and variables
				//calling e1
				System.out.println("employee id: "+e1.empolyeeid);
				System.out.println("employee name:"+e1.empolyeeName);
				System.out.println("employee department:"+ e1.empolyeedepartment);
				System.out.println("employee shift:"+ e1.display());
				
				
			}
			

		}
		
		
		
		
		
		
		
		



