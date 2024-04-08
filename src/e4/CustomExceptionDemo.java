package e4;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            // Call a method that throws MyCustomException
            performSomeOperation();
        } catch (MyCustomException e) {
            // Catch the exception and print the stack trace
            e.printStackTrace();
        }
    }

    public static void performSomeOperation() {
        // Simulate an error condition
        throw new MyCustomException("Something went wrong!");
    }
}
