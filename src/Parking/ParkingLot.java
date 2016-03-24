package Parking;

import java.util.ArrayList;

public class ParkingLot {
    private ArrayList<ParkingArea> listOfParkingArea;
    private ArrayList<Observer> observers;
    private Assistant assistant;
    private int parkingLotCode = hashCode();

    public ParkingLot(ArrayList<ParkingArea> listOfParkingArea,Assistant assistant,ArrayList<Observer> observers) {

        this.listOfParkingArea = listOfParkingArea;
        this.observers = observers;
        this.assistant = assistant;
    }

    public boolean isFull() {
        for (ParkingArea parkingArea : listOfParkingArea) {
            if (!parkingArea.isOccupied())
                return false;
        }
        return true;
    }

    private ParkingArea getSuitableParkingArea() {
        for (ParkingArea parkingArea : listOfParkingArea) {
            if (!parkingArea.isOccupied())
                return parkingArea;
        }

        return null;
    }

    private int getCountOfOccupied(){
        int counter= 0;
        for (ParkingArea parkingArea : listOfParkingArea) {
            if (parkingArea.isOccupied())
                counter++;
        }
        return counter;
    }


    private double percentageOfspaceLeft(){
        double percentage;
        int counter = getCountOfOccupied();
        percentage = counter/listOfParkingArea.size();
        return percentage;
    }

    public void park(Car car) {
        if (isFull())
            return;
        ParkingArea areaInWhichCarHasToBeParked = getSuitableParkingArea();
        assistant.update(car,areaInWhichCarHasToBeParked);
        areaInWhichCarHasToBeParked.park(car);
        for (Observer observer : observers) {
            observer.update(parkingLotCode,getCountOfOccupied(),listOfParkingArea.size());
        }

    }

    public Car unpark(Car car) {
        ParkingArea parkingArea = assistant.getParkingArea(car);
        assistant.update(car,parkingArea);
        for (Observer observer : observers) {
            observer.update(parkingLotCode,getCountOfOccupied(),listOfParkingArea.size());
        }

        return parkingArea.unpark();
    }
}
