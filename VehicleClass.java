package b0r0s;

public class VehicleClass {
	
	// three derived classes: cars, motorcycles, boats
	
	// Attributes
	// these attributes are inherent in all vehicles
	// specific classes will have different attributes (leather seats, cc, knots);
	protected String Name;
	protected int NumberOfWheels;
	protected float EngineSize;
	protected String Colour;
	protected int TopSpeed;
	protected boolean stationary;
	
	public VehicleClass() {
		super();
	}

	// Generators
	public VehicleClass(String name, int numberOfWheels, float engineSize, String colour, int topSpeed,
			boolean stationary) {
		super();
		this.Name = name;
		this.NumberOfWheels = numberOfWheels;
		this.EngineSize = engineSize;
		this.Colour = colour;
		this.TopSpeed = topSpeed;
		this.stationary = stationary;
	}
	
	public float Bill() {
		return 50.00f;
	}

	//Setters and Getters
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public int getNumberOfWheels() {
		return NumberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.NumberOfWheels = numberOfWheels;
	}

	public float getEngineSize() {
		return EngineSize;
	}

	public void setEngineSize(float engineSize) {
		this.EngineSize = engineSize;
	}

	public String getColour() {
		return Colour;
	}

	public void setColour(String colour) {
		this.Colour = colour;
	}

	public int getTopSpeed() {
		return TopSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.TopSpeed = topSpeed;
	}

	public boolean isStationary() {
		return stationary;
	}

	public void setStationary(boolean stationary) {
		this.stationary = stationary;
	}
	
	//Methods
	
}
