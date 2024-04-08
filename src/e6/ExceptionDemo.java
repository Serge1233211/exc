import java.util.Random;

public class ExceptionDemo {

    public static void main(String[] args) {
        try {
            randomlyThrowException();
        } catch (NullPointerException e1) {
            System.out.println("Caught NullPointerException: " + e1.getMessage());
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e2.getMessage());
        } catch (IllegalArgumentException e3) {
            System.out.println("Caught IllegalArgumentException: " + e3.getMessage());
        }
    }

    static void randomlyThrowException() {
        Random random = new Random();
        int randomValue = random.nextInt(3); // Generates a random value between 0 and 2

        switch (randomValue) {
            case 0:
                throw new NullPointerException("This is a NullPointerException");
            case 1:
                throw new ArrayIndexOutOfBoundsException("This is an ArrayIndexOutOfBoundsException");
            case 2:
                throw new IllegalArgumentException("This is an IllegalArgumentException");
        }
    }
}
