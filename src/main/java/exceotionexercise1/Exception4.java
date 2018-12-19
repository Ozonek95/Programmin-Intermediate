package exceotionexercise1;

public class Exception4 extends RuntimeException {
    String messege = "error4";

    @Override
    public String getMessage() {
        return messege;
    }
}
