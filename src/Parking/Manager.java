package Parking;

public class Manager implements Observer {
    @Override
    public void update(int parkingLotCode, int occupiedParkingArea, int totalParkingArea) {
        if(canGiveToTrainee(occupiedParkingArea,totalParkingArea))
            availableToTrainee(parkingLotCode);
    }

    private void availableToTrainee(int parkingLotCode) {

    }

    private boolean canGiveToTrainee(int occupiedParkingArea, int totalParkingArea) {
        double heavyTraffic = 0.8;
        return occupiedParkingArea / totalParkingArea <= heavyTraffic;
    }

}
