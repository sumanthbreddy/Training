Create a program that declares an array of integers, initializes it with consecutive numbers, and prints the array in reverse order.

CODE:-


import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        int size = 5; 
        int[] numbers = new int[size];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        
        System.out.println("Original Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("Array in Reverse Order:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
              sc.close();
    }
}
