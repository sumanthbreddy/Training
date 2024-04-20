Implement a function called BruteForceSort that sorts an array using the brute force approach. Use this function to sort an array created with InitializeArray.

CODE:-

import java.util.Arrays;

public class BruteForceSort {

    public static void main(String[] args) {
        int[] array = InitializeArray(10);
        System.out.println("Original array: " + Arrays.toString(array));

        BruteForceSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void BruteForceSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static int[] InitializeArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
}
