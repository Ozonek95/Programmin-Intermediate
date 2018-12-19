package exceotionexercise1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try {
            throwRandomException();
        } catch (Exception1 exception1) {
            System.out.println("Ex 1");
        } catch (Exception2 exception2) {
            System.out.println("Ex 2");
        } catch (Exception3 exception3) {
            exception3.printStackTrace();
        }
    }

    static void throwRandomException() throws Exception1, Exception2, Exception3 {
        int randomInt = new Random().nextInt(2);

        switch (randomInt) {
            case 0:
                throw new Exception1();
            case 1:
                throw new Exception2();
        }



    }
}
