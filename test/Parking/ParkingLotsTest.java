package Parking;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParkingLotsTest {
    @Test
    public void shouldNotBeFullInitially() {
        ArrayList<ParkingLot> listOfParkingLots = new ArrayList<>();
        ArrayList<ParkingArea> listOfParkingArea = new ArrayList<>();
        listOfParkingArea.add(new ParkingArea());
        Assistant assistant = new Assistant();
        ArrayList<Observer> observers = new ArrayList<>();
        observers.add(assistant);
        ParkingLot parkingLot = new ParkingLot(listOfParkingArea,assistant,observers);
        listOfParkingLots.add(parkingLot);
        ParkingLots parkingLots = new ParkingLots(listOfParkingLots,assistant);
        assertFalse(parkingLots.isFull());
    }


    @Test
    public void shouldBeFullIfAllLotsareFull() {
        ArrayList<ParkingLot> listOfParkingLots = new ArrayList<>();
        ArrayList<ParkingArea> listOfParkingArea = new ArrayList<>();
        listOfParkingArea.add(new ParkingArea());
        Assistant assistant = new Assistant();
        ArrayList<Observer> observers = new ArrayList<>();
        observers.add(assistant);
        ParkingLot parkingLot = new ParkingLot(listOfParkingArea,assistant,observers);
        listOfParkingLots.add(parkingLot);
        ParkingLots parkingLots = new ParkingLots(listOfParkingLots,assistant);
        Car car = new Car();
        parkingLots.park(car);
        assertTrue(parkingLots.isFull());
    }
    @Test
    public void shouldNotBeFullIfACarIsunparked() {
        ArrayList<ParkingLot> listOfParkingLots = new ArrayList<>();
        ArrayList<ParkingArea> listOfParkingArea = new ArrayList<>();
        listOfParkingArea.add(new ParkingArea());
        Assistant assistant = new Assistant();
        ArrayList<Observer> observers = new ArrayList<>();
        observers.add(assistant);
        ParkingLot parkingLot = new ParkingLot(listOfParkingArea,assistant,observers);
        listOfParkingLots.add(parkingLot);
        ParkingLots parkingLots = new ParkingLots(listOfParkingLots,assistant);
        Car car = new Car();
        parkingLots.park(car);
        parkingLots.unpark(car);
        assertFalse(parkingLots.isFull());
    }


}