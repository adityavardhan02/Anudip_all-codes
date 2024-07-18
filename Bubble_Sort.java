package anudip;
import java.util.Scanner;

public class Bubble_Sort {

    public static void main(String[] args) {
        int[] arr = {56, 89, 34, 27, 12};
        int n = arr.length;
        int temp;
        
        // Bubble Sort algorithm
        for (int i = 0; i < n - 1; i++) { 
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swapping the numbers if one number is greater than the other
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        // Printing the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);
    }
}
