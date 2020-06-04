import java.util.ArrayList;

public abstract class Vehicle<T>
{
    int id;
    int counter;
    int seats;
    ArrayList<T> passengers = new ArrayList<>();

    Vehicle(int seats)
    {
        this.id = counter;
        counter++;
        this.seats = seats;
    }

    public int getSeats()
    {
        return seats;
    }

    boolean addPassenger(T person)
    {
        boolean flag = false;

        if(passengers.size() == getSeats())
        {
            throw new PassengerE(" we dont have a place");
        }
        else if(((Person)person).inCar)
        {
            throw new PassengerE("Passenger " + ((Person)person).getID() + " in the car");
        }
        else
        {
            ((Person)person).inCar = true;
            passengers.add((T)person);
            flag = true;
        }

        return flag;
    }

    boolean deletePassenger(int personID)
    {
        boolean flag = false;

        Person person = findPerson(personID);

        if(person != null)
        {
            person.inCar = false;
            passengers.remove(person);
            flag = true;
        }
        else
            throw new PassengerE("No passengers id = " + personID );

        return flag;
    }

    Person findPerson(int personID)
    {
        for (Person person: (ArrayList<Person>)passengers)
        {
            if(person.getID() == personID)
                return person;
        }

        return null;

    }

    public int getBusy()
    {
        return this.passengers.size();
    }
} 