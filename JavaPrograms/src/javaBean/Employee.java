package javaBean;

public class Employee {
	
		
		private int Employee_Id  ;
		private String Employee_Name  ;
		
		private  Address address ;
		
		
		public  Employee() {
			
			System.out.println("Hello");
			
		}


		public int getEmployee_Id() {
			return Employee_Id;
		}



		public void setEmployee_Id(int Employee_Id) {
			this.Employee_Id =Employee_Id;
		}



		public String getEmployee_Name() {
			return Employee_Name;
		}



		public void setEmployee_Name(String Employee_Name) {
			this.Employee_Name = Employee_Name;
		}



		public Address getAddress() {
			return address;
		}



		public void setAddress(Address address) {
			this.address = address;
		}



		public Employee(int Employee_Id, String Employee_Name, Address address) {
			super();
			this.Employee_Id = Employee_Id;
			this.Employee_Name = Employee_Name;
			this.address = address;
		}



		@Override
		public String toString() {
			return "Employee Details [Employee ID= " + Employee_Id + ", Employee Name= " + Employee_Name + ", Address= " + address + "]";
		}
		
		public void display(){
			
			System.out.println(" Employee Id   " + this.Employee_Id);
			System.out.println(" Employee Name   --- " + this.Employee_Name);
			System.out.println(" Employee Address  --- " + this.address);

		}
		
		

	}

