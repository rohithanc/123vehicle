package b0r0s;

public class Cars extends VehicleClass{ 

public float TyreTread;
public String Fuel;
	
	public Cars() {
		super();
	}

	public Cars(String name, int numberOfWheels, float engineSize, String colour, int topSpeed,
			boolean stationary, float TyreTread, String Fuel) {
		super(name, numberOfWheels, engineSize, colour, topSpeed, stationary);
		this.TyreTread = TyreTread;
		this.Fuel = Fuel;
	}


	public float getTyreTread() {
		return TyreTread;
	}

	public void setTyreTread(float TyreTread) {
		this.TyreTread = TyreTread;
	}
	
	
	public String getFuel() {
		return Fuel;
	}


	public void setFuel(String fuel) {
		Fuel = fuel;
	}


	@Override
	public float Bill() {
		return getNumberOfWheels() * getEngineSize() * TyreTread;
	}
}
