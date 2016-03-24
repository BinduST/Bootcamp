package Parking;

import java.util.HashMap;

public class Assistant implements Observer{
    HashMap<Car,ParkingLot> parkingLotRegister = new HashMap<>();
    HashMap<Car,ParkingArea> parkingAreaRegister = new HashMap<>();
    public void update(Car car, ParkingArea areaInWhichCarHasToBeParked) {
        parkingAreaRegister.put(car,areaInWhichCarHasToBeParked);
    }
    public void update(Car car, ParkingLot lotInWhichCarHasToBeParked) {
        parkingLotRegister.put(car,lotInWhichCarHasToBeParked);
    }

    public ParkingArea getParkingArea(Car car) {
        return parkingAreaRegister.get(car);
    }

    public ParkingLot getParkingLot(Car car){
        return parkingLotRegister.get(car);
    }

    @Override
    public void update(int parkingLotCode, int availableParkingArea, int totalParkingArea) {
        display(parkingLotCode,availableParkingArea,totalParkingArea);
    }

    private void display(int parkingLotCode, int availableParkingArea, int totalParkingArea) {

    }
}
