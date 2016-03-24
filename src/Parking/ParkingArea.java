package Parking;

public class ParkingArea {

    private Car parkedCar = null;

    public boolean isOccupied() {
        return parkedCar != null;
    }

    public void park(Car car) {
        this.parkedCar = car;
    }

    public Car unpark() {
        Car carToGive = parkedCar;
        parkedCar = null;
        return carToGive;
    }
}
