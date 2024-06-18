package access_modifier;

	// Another class to test the access of public members from 'Vehicle' class
		public class TestVehicle {
		    public static void main(String[] args) {
		        // Create an object of 'Vehicle' class
		        Vehicle vehicle = new Vehicle("Car");

		        // Accessing the public variable 'type'
		        System.out.println("Vehicle type: " + vehicle.type);

		        // Accessing the public method 'displayType()'
		        vehicle.displayType();
		    }
		}


