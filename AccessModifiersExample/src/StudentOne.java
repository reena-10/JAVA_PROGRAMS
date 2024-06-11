
		public class StudentOne {
		    private int id;
		    private String name;
		    private Address address;
		    
		    // Default Constructor
		    public Student() {
		    }
		    
		    // Parameterized Constructor
		    public StudentOne(int id, String name, Address address) {
		        this.id = id;
		        this.name = name;
		        this.address = address;
		    }
		    
		    // Getters and Setters
		    public int getId() {
		        return id;
		    }
		    
		    public void setId(int id) {
		        this.id = id;
		    }
		    
		    public String getName() {
		        return name;
		    }
		    
		    public void setName(String name) {
		        this.name = name;
		    }
		    
		    public Address getAddress() {
		        return address;
		    }
		    
		    public void setAddress(Address address) {
		        this.address = address;
		    }
		    
		    // toString method
		    @Override
		    public String toString() {
		        return "StudentOne{" +
		                "id=" + id +
		                ", name='" + name + '\'' +
		                ", address=" + address +
		                '}';
		    }
		}
	}
}