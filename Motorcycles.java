package b0r0s;

public class Motorcycles extends VehicleClass{

	public float cc;
	
	public Motorcycles() {
		super();
	}

	
	public Motorcycles(String name, int numberOfWheels, float engineSize, String colour, int topSpeed,
			boolean stationary, float cc) {
		super(name, numberOfWheels, engineSize, colour, topSpeed, stationary);
		this.cc = cc;
	}


	public float getCc() {
		return cc;
	}

	public void setCc(float cc) {
		this.cc = cc;
	}
	
	@Override
	public float Bill() {
		return getNumberOfWheels() * getEngineSize() + cc;
	}
	
}
