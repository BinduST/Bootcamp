package Parking;

public class CivicBody implements Observer {
    private int parkingLotCode;

    @Override
    public void update(int parkingLotCode, int occupiedParkingArea, int totalParkingArea) {

        if (canCollectMoreTax(occupiedParkingArea, totalParkingArea))
            collectMoreTax(parkingLotCode);
    }

    private void collectMoreTax(int parkingLotCode) {

    }

    private boolean canCollectMoreTax(int occupiedParkingArea, int totalParkingArea) {
        double excessTaxLimit = 0.8;
        return occupiedParkingArea / totalParkingArea >= excessTaxLimit;
    }
}
