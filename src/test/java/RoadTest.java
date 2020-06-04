import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RoadTest
{
    Road road;
    Person fireman, policeman, person;
    Vehicle fireTruck, policeCar, taxi, bus;

    @Before
    public void startBase() throws Exception
    {
        road = new Road();

        fireman = new Fireman();
        policeman = new Policeman();
        person = new Person();

        fireTruck = new FireCar(4);
        policeCar = new PoliceCar(1);
        taxi = new Taxi(1);
        bus = new Bus(10);
    }

    @Test
    public void countOfHumansTest()
    {
        fireTruck.addPassenger(fireman);
        policeCar.addPassenger(policeman);
        bus.addPassenger(person);
        fireTruck.deletePassenger(fireman.getID());

        road.addCarToRoad(fireTruck);
        road.addCarToRoad(policeCar);
        road.addCarToRoad(taxi);
        road.addCarToRoad(bus);

        assertEquals(2, road.getCountOfHumans());
    }

    @Test
    public void addTest()
    {
        assertTrue(fireTruck.addPassenger(fireman));
    }

    @Test(expected = PassengerE.class)
    public void addManyTest_Exception()
    {
        taxi.addPassenger(policeman);
        taxi.addPassenger(fireman);
    }

    @Test
    public void deleteTest()
    {
        fireTruck.addPassenger(fireman);
        assertTrue(fireTruck.deletePassenger(fireman.getID()));
    }

    @Test(expected = PassengerE.class)
    public void deleteTest_Exception()
    {
        taxi.deletePassenger(person.getID());
    }
}