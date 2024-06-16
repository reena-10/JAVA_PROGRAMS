package multilevel_inheritance;

class Employee extends Person { // derived class of Person
	public int employeeId;
	public String department;
	  
	 void Display_Employee() {
		
		 department="HR";
		 employeeId=123;
		
		 System.out.println("Department =" +department);
		 System.out.println("Employee ID= " +employeeId);
	 }
	
}