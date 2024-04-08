package e2;

public class ArrayExceptionDemo {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            int value = arr[10]; // Accessing an out-of-bounds index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException" );
        }
    }
}


