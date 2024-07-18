package anudip;

public class Findtheduplication {

    public static void main(String[] args) {
        // Initialize the array with given values, including duplicates
        int[] a = { 66, 69, 99, 88, 33, 89, 69};

        // Variable to keep track of the count of duplicates
        int count = 0;
        // Outer loop to iterate over each element in the array
        for (int i = 0; i < a.length; i++) {

            // Inner loop to compare the current element with the subsequent elements
            for (int j = i + 1; j < a.length; j++) {
                // Check if the current pair of elements are duplicates
                if (a[i] == a[j]) {
                    // Print the duplicate value
                    System.out.println("Duplicate value is: " + a[j]);

                    // Increment the duplicate count
                    count++;
                }
            }
        }

        // Print the total count of duplicates found in the array
        System.out.println("Total duplicate count: " + count);
    }
}
