package e1;

public class Main {
    public static void main(String[] args) {
        try {
            // Declare a variable and initialize it with null
            Object myVariable = null;

            // Invoke a method on the null variable (this will throw a NullPointerException)
            myVariable.toString();

        } catch (NullPointerException e) {
            // Catch the exception
            System.out.println("Caught NullPointerException");
        }
    }
}
