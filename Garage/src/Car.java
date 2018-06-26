public class Car extends Vehicle{

    int numberOfWheels;

    public Car(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void setNumberOfWheels(int wheels) {

    }

    @Override
    public String getVehicleType() {
        return "car";
    }
}
