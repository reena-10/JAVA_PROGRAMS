package builder_Design_Pattern;

public class Main {

	public static void main(String[] args) {
	 Computer computer = new Computer.ComputerBuilder("1TB", "16GB")
		       .withGraphicsCard()
		        .withBluetooth()
		         .build();

		        System.out.println(computer.toString());
		    
		
	}

}
