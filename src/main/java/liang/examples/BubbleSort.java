package liang.examples;

/*
Bubble sort is a simple sorting algorithm that works by repeatedly stepping through the list to be sorted, comparing each pair of
adjacent items and swapping them if they are in the wrong order. The pass through the list is repeated until no swaps are needed,
which indicates that the list is sorted. The algorithm gets its name from the way smaller elements bubble to the top of the list.
Because it only uses comparisons to operate on elements, it is a comparison sort. You can see the code implementation below:
 */
public class BubbleSort {

    public static void bubbleSort(int[] list) {
        for (int k = 1; k < list.length; k++) {
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i+1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

}
