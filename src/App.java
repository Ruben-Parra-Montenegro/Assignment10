import java.util.Arrays;
import java.util.Random;

import sorts.Sorts;

public class App {
    public static void main(String[] args) {
        int Number = Integer.parseInt(args[0]);
        int length = Number;
        int[] array = generateRandomArray(length);

        int[] arrayCopy = Arrays.copyOf(array, array.length);

        long startTime = System.currentTimeMillis();
        Sorts.bubbleSort(array);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by BubbleSort: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        Sorts.mergeSort(arrayCopy, 0, arrayCopy.length - 1);
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by MergeSort: " + (endTime - startTime) + "ms");
    }

    public static int[] generateRandomArray(int length) {
        Random rand = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = rand.nextInt(1000);
        }
        return array;
    }
}
// java --enable-preview -jar Assignment10.jar