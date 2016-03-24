package Parking;

import org.junit.Assert;
import org.junit.Test;

public class ParkingAreaTest {

    @Test
    public void shouldBeOccupiedIfACarIsParked() {
        ParkingArea parkingArea = new ParkingArea();
        parkingArea.park(new Car());
        Assert.assertTrue(parkingArea.isOccupied());
    }
    @Test
    public void shouldNotBeOccupiedIfACarIsUnparked() {
        ParkingArea parkingArea = new ParkingArea();
        parkingArea.park(new Car());
        parkingArea.unpark();
        Assert.assertFalse(parkingArea.isOccupied());
    }

    @Test
    public void shouldNotBeOccupiedInitially() {
        ParkingArea parkingArea = new ParkingArea();
        Assert.assertFalse(parkingArea.isOccupied());
    }
}