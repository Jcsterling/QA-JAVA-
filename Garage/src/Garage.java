import java.util.ArrayList;

public class Garage {

    ArrayList<Vehicle> vehicles;

    public Garage(){
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public static void main(String[] args){
        Garage garage = new Garage();
        garage.addVehicle(new Car(4));
    }
}
