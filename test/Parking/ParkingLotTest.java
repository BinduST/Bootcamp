package Parking;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ParkingLotTest {
    @Test
    public void shouldNotBeFullInitially() {

        ArrayList<ParkingArea> listOfParkingArea = new ArrayList<>();
        listOfParkingArea.add(new ParkingArea());
        Assistant assistant = new Assistant();
        ArrayList<Observer> observers = new ArrayList<>();
        observers.add(assistant);
        ParkingLot parkingLot = new ParkingLot(listOfParkingArea,assistant,observers);
        Assert.assertFalse(parkingLot.isFull());
    }

    @Test
    public void shouldBeFullIfAllParkingAreaIsOccupied() {

        ArrayList<ParkingArea> listOfParkingArea = new ArrayList<>();
        listOfParkingArea.add(new ParkingArea());
        Assistant assistant = new Assistant();
        ArrayList<Observer> observers = new ArrayList<>();
        observers.add(assistant);

        ParkingLot parkingLot = new ParkingLot(listOfParkingArea,assistant,observers);
        parkingLot.park(new Car());

        Assert.assertTrue(parkingLot.isFull());
    }
    @Test
    public void shouldNotBeFullIfACarIsUnparked() {

        ArrayList<ParkingArea> listOfParkingArea = new ArrayList<>();
        listOfParkingArea.add(new ParkingArea());
        Assistant assistant = new Assistant();
        ArrayList<Observer> observers =new ArrayList<>();
        observers.add(assistant);
        ParkingLot parkingLot = new ParkingLot(listOfParkingArea,assistant,observers);
        Car car = new Car();
        parkingLot.park(car);
        parkingLot.unpark(car);

        Assert.assertFalse(parkingLot.isFull());
    }
    @Test
    public void shouldNotifyTheObserver() {
        Observer manager = new Observer() {
            @Override
            public void update(int parkingLotCode, int occupiedParkingArea, int totalParkingArea) {
                System.out.println("hahahah");
            }
        };
        ArrayList<ParkingArea> listOfParkingArea = new ArrayList<>();
        listOfParkingArea.add(new ParkingArea());
        Assistant assistant = new Assistant();
        ArrayList<Observer> observers =new ArrayList<>();
        observers.add(assistant);
        observers.add(manager);
        ParkingLot parkingLot = new ParkingLot(listOfParkingArea,assistant,observers);
        Car car = new Car();
        parkingLot.park(car);
        parkingLot.unpark(car);
        Assert.assertFalse(parkingLot.isFull());
    }
}