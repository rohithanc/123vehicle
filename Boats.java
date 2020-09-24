package b0r0s;

public class Boats extends VehicleClass{

	//Attributes
	private int Anchors;
	
	public Boats() {
		super();
	}
	
	public Boats(String name, int numberOfWheels, float engineSize, String colour, int topSpeed,
			boolean stationary) {
		super(name, numberOfWheels, engineSize, colour, topSpeed, stationary);
		this.Anchors= Anchors; //has no effect atm
	}
	
	@Override
	public String toString() {
		return "Boats[Anchors=" + Anchors + ", getEngineSize()=" + getEngineSize() + ", getNumberOfWheels()="+ getNumberOfWheels() + ", isStationary()=" + isStationary() +"]";
	}

	public int getAnchors() {
		return Anchors;
	}

	public void setAnchors(int anchors) {
		this.Anchors = anchors;
	}
	
	@Override
	public float Bill() {
		return getNumberOfWheels() * getEngineSize() + Anchors;
	}
}
