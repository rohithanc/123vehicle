package b0r0s;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	// Vehicle Honda = new Car();
	// Car Honda = new Car();
	// Boat Boat = new Boat();
	// Boat Yacht = new Boat();
	// Honda.cost();
	// Boat.cost();
	// Yacht.cost();

	// ArrayList<VehicleClass> garage = newArrayList<>();

	private List<VehicleClass> vehicles = new ArrayList<>();

	public Garage() {
		super();
	}

	Vehicle vehicle = new Vehicle();

	public boolean addVehicle(VehicleClass vehicle) {
		return this.vehicles.add(vehicle);
	}
	
	@Override
	public String toString() {
		return "Garage [vehicles= " + vehicles + "]";
	}

	//Bill
	public float repairbill() {
		float bill = 0;
			for (VehicleClass vehicle: vehicles) {
				bill += vehicle.Bill();
			}
			return bill;
	}
	
	// Removing Vehicles
	public void removeByType(String type) {
		List<Vehicle> toRemove = new ArrayList<>();
		if ("Motorcycles".equals(type)) {
			for (VehicleClass v : this.vehicles) {
				if (v instanceof Motorcycles) {
					toRemove.add(vehicle);
				}
			}
		} else if ("Boats".equals(type)) {
			for (VehicleClass v : this.vehicles) {
				if (v instanceof Boats) {
					toRemove.add(vehicle);
				}
			}
		} else if ("Cars".equals(type)) {
			for (VehicleClass v : this.vehicles) {
				if (v instanceof Cars) {
					toRemove.add(vehicle);
		}
		//this.vehicles.removeAll(toRemove);
		
		//return toRemove;
	}
}
}
	//public void removeByType1(String type) {
	//	List<Vehicle> toRemove = new ArrayList<>();
		//for (VehicleClass vehicle : this.vehicles) {
		//	if (vehicle.getClass().getSimpleName().equalsIgnoreCase(type)) {
				//toRemove.add(vehicle);
			//}
		//}

}
	//need to add vehicles to the garage
