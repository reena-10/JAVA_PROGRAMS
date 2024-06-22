package aggregation;


	public class Student {
		 private int rollno ;
		 private String name;
		 private Address s_add;
		 
		
		
		
		public int getRollno() {
			return rollno;
		}

		public void setRollno(int rollno) {
			this.rollno = rollno;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Address getS_add() {
			return s_add;
		}

		public void setS_add(Address s_add) {
			this.s_add = s_add;
		}

		//parameter constructor
		public Student(int rollno, String name) {
			super();
			this.rollno = rollno;
			this.name = name;
		}
		
		//default construction
		Student (){
			
		}

		@Override
		public String toString() {
			return "Student [rollno=" + rollno + ", name=" + name + ", s_add=" + s_add + "]";
		}
		
		
}
