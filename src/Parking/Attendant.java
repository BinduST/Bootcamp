package Parking;

public class Attendant implements Observer {
    @Override
    public void update(int parkingLotCode, int occupiedParkingArea, int totalParkingArea) {
        if(canPromote(occupiedParkingArea,totalParkingArea))
            promoteLot(parkingLotCode);
    }

    private void promoteLot(int parkingLotCode) {

    }

    private boolean canPromote(int occupiedParkingArea, int totalParkingArea) {
        double promotionLimit = 0.2;
        return occupiedParkingArea/totalParkingArea <= promotionLimit;
    }
}
