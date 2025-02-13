import java.util.Arrays;

public class Task3Demo {
    public static void main(String[] args)
    {
        //setting up the array
        double[] array = {3.0, 2.4, 6.0, 2.0, 4.0, 5.1, 7.2};
        SequenceOperations operations = new SequenceOperations();

        //doing all the displaying
        System.out.println("Processing Array: " + Arrays.toString(array));
        System.out.println("Total: " + operations.getTotal(array));
        System.out.println("Average: " + operations.getAverage(array));
        System.out.println("Reversed Array: " + Arrays.toString(operations.getReverse(array)));
    }
}