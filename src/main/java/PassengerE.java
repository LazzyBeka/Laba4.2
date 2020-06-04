public class PassengerE extends RuntimeException
{
    String text;

    PassengerE(String text)
    {
        super(text);
        this.text = text;
    }
}
