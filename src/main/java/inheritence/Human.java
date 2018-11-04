package inheritence;

public class Human implements HumanInterface{
    public Human() {
    }


    @Override
    public String giveMeToString() {
        return toString();
    }
}
