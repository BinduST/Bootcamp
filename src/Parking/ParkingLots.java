package Parking;

import java.util.ArrayList;

public class ParkingLots {
    private final ArrayList<ParkingLot> listOfParkingLots;
    private Assistant assistant;

    public ParkingLots(ArrayList<ParkingLot> parkingLotArrayList, Assistant assistant) {
        this.listOfParkingLots = parkingLotArrayList;
        this.assistant = assistant;
    }


    public boolean isFull() {
        for (ParkingLot parkingLot : listOfParkingLots) {
            if (!parkingLot.isFull())
                return false;
        }
        return true;
    }

    private ParkingLot getSuitableParkingLot() {
        for (ParkingLot parkingLot : listOfParkingLots) {
            if (!parkingLot.isFull())
                return parkingLot;
        }

        return null;
    }


    public void park(Car car) {
        if (isFull())
            return;
        ParkingLot lotInWhichCarHasToBeParked = getSuitableParkingLot();
        lotInWhichCarHasToBeParked.park(car);
        assistant.update(car,lotInWhichCarHasToBeParked);
    }

    public Car unpark(Car car) {
        ParkingLot parkingLot = assistant.getParkingLot(car);
        return parkingLot.unpark(car);
    }


}
