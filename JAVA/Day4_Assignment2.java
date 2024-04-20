Write a recursive function named SumArray that calculates and returns the sum of elements in an array, demonstarte with example.

public class SumArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = SumArray(array, array.length);
        System.out.println("Sum of array elements: " + sum);
    }

    public static int SumArray(int[] array, int length) {
        if (length <= 0) {
            return 0;
        } else {
            return SumArray(array, length - 1) + array[length - 1];
        }
    }
}
