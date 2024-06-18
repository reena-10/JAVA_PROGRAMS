package access_modifier;


	// Define a class with a public access modifier
	public class Vehicle {

	    // public variable can be accessed from any class
	    public String type;

	    // public constructor can be accessed from any class
	    public Vehicle(String type) {
	        this.type = type;
	    }

	    // public method can be accessed from any class
	    public void displayType() {
	        System.out.println("The type of the vehicle is: " + type);
	    }
	}

	

