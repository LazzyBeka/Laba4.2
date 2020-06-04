public class Car<T extends Person> extends Vehicle<T>
{
    Car(int seats)
    {
        super(seats);
    }
}
