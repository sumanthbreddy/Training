Create a recursive function to find the nth element of a Fibonacci sequence and store the first n elements in an array.

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Size");
         int n=sc.nextInt();
        long[] fibArray = new long[n];

        for (int i = 0; i < n; i++) {
            fibArray[i] = fibonacci(i);
        }
        System.out.println("Fibonacci Sequence:");
        System.out.println(Arrays.toString(fibArray));
    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
