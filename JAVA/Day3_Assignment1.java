Write a function named PerformLinearSearch that searches for a specific element in an array and returns the index of the element if found or -1 if not found.

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 10, 13, 17, 21};
        int target = 13;
        int index = performLinearSearch(arr, target);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int performLinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
