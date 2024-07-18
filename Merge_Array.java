package anudip;

import java.util.Arrays;

public class Merge_Array {

    public static void main(String[] args) {

        int[] arr1 = {2, 4, 6, 8, 10};
        int[] arr2 = {1, 3, 5, 7, 9};

        int size = arr1.length + arr2.length;
        int[] merge = new int[size];

        // Copying elements from arr1 to merge
        for (int i = 0; i < arr1.length; i++) {
            merge[i] = arr1[i];
        }

        // Copying elements from arr2 to merge
        for (int i = 0; i < arr2.length; i++) {
            merge[arr1.length + i] = arr2[i];
        }

        // Sorting the merged array
        Arrays.sort(merge);

        System.out.print("Merged and sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(merge[i] + " ");
        }
    }
}
