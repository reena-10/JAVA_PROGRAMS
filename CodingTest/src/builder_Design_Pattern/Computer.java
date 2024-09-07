package builder_Design_Pattern;

public class Computer {
	//required parameters
		private String HDD;
		private String RAM;
		
		//optional parameters
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;

  private Computer(ComputerBuilder computerBuilder) {
	  this.HDD = computerBuilder.HDD;
	  this.RAM = computerBuilder.RAM;
	  this.isGraphicsCardEnabled = computerBuilder.isGraphicsCardEnabled;
	  this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
}
  
  public String getHDD() {
	return HDD;
}

public String getRAM() {
	return RAM;
}

public boolean isGraphicsCardEnabled() {
    this.isGraphicsCardEnabled = true;

	return isGraphicsCardEnabled;
}

public boolean isBluetoothEnabled() {
	return isBluetoothEnabled;
}
public static class ComputerBuilder{
	  private String HDD;
	  private String RAM;
	  private boolean isGraphicsCardEnabled;
	  private boolean isBluetoothEnabled;
	  
	public ComputerBuilder(String HDD, String RAM) {
		this.HDD = HDD;
        this.RAM = RAM;
        }

	// Build method to create a Computer object
      public Computer build() {
          return new Computer(this);
      }
      public ComputerBuilder withGraphicsCard() {
          this.isGraphicsCardEnabled = true;
          return this;
      }

      public ComputerBuilder withBluetooth() {
          this.isBluetoothEnabled = true;
          return this;
      }

	public Computer isGraphicsCardEnabled() {
		// TODO Auto-generated method stub
		return null;
	}
  }


@Override
public String toString() {
	return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled
			+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
}


}