public class Main {
    public static void main(String[] args)
    {
        try
        {
            Road road = new Road();
            Policeman police = new Policeman();
            Fireman fireman = new Fireman();

            PoliceCar policeCar = new PoliceCar(2);
            Taxi taxi = new Taxi(1);
            Bus bus = new Bus(2);
            FireCar fireCar = new FireCar(1);
            System.out.println(fireCar.addPassenger(fireman));

            policeCar.addPassenger(police);
            taxi.addPassenger(police);
            policeCar.deletePassenger(police.getID());
            taxi.addPassenger(police);

            road.addCarToRoad(policeCar);
            road.addCarToRoad(taxi);
            road.addCarToRoad(bus);
            road.addCarToRoad(fireCar);

        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}
