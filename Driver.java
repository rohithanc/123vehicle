package b0r0s;

//import com.qa.garage.Garage;
//import com.qa.garage.Motorcycles;
//import com.qa.garage.Boats;
//import com.qa.garage.VehicleClass;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VehicleClass Motorcycle1 = new Motorcycles("Honda", 2, 2, "red", 125, false, 0);
		VehicleClass Motorcycle2 = new Motorcycles("Yamaha", 2, 1.8f, "yellow", 119, false, 0);
		VehicleClass Boat1 = new Boats("Corsair", 1, 7.2f, "white", 20, true);
		VehicleClass Car1 = new Cars("Volkswagen", 4, 1.6f, "black", 150, true, 0.14f, "petrol");		
		
		Garage garage = new Garage();
		garage.addVehicle(Boat1);
		garage.addVehicle(Motorcycle2);
		garage.addVehicle(Motorcycle1);
		garage.addVehicle(Car1);
		
	
		System.out.println(Motorcycle1.getClass().getSimpleName());
		System.out.println(garage);
		
		garage.removeByType("car");
		
		System.out.println(garage.repairbill());
		System.out.println(garage);
		garage.addVehicle(new Motorcycles("Suzuki", 2, 2.0f, "red", 200, true, 50.0f));
		System.out.println(garage.repairbill());
	}

}
