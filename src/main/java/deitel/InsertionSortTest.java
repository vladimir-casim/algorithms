package deitel;


import java.security.SecureRandom;
import java.util.Arrays;

public class InsertionSortTest {

    public static void insertionSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int current = data[i];
            int j = i;
            while (j > 0 && data[j] > current) {
                data[j] = data[j - 1];
                j--;
            }
            data[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        SecureRandom generator = new SecureRandom();
        int[] data = new int[10];
        for (int i = 0; i < data.length; i++) {
            data[i] = 10 + generator.nextInt(90);
        }

        System.out.println(Arrays.toString(data));
        insertionSort(data);
        System.out.println(Arrays.toString(data));

    }
}
