import java.util.ArrayList;

public class Road
{
    ArrayList<Vehicle> carsInRoad = new ArrayList<>();

    public int getCountOfHumans()
    {
        int countOfHumans = 0;

        for(Vehicle a: carsInRoad)
        {
            countOfHumans += a.getBusy();
        }

        return countOfHumans;
    }

    public void addCarToRoad(Vehicle cars)
    {
        carsInRoad.add(cars);
    }
} 