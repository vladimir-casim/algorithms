package deitel;

import java.security.SecureRandom;
import java.util.Arrays;

public class SelectionSortTest {

    private static void printPass(int[] data, int pass, int index) {
        System.out.println();
    }

    private static void swap(int[] data, int first, int second) {
        int temporary = data[first];
        data[first] = data[second];
        data[second] = temporary;
    }

    public static void selectionSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    swap(data, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        SecureRandom generator = new SecureRandom();
        int[] data = new int[10];
        for (int i = 0; i < data.length; i++) {
            data[i] = 10 + generator.nextInt(90);
        }

        System.out.println(Arrays.toString(data));
        selectionSort(data);
        System.out.println(Arrays.toString(data));
    }

}
