package anudip;

public class ArrayDemo {

    public static void main(String[] args) {
        // Initialize the boolean flag to track if the element is found
        boolean b = false;
        
        // Initialize the array with given values
        int arr[] = { 41, 69, 88, 9, 25, 33 };
        
        // The number to be searched in the array
        int num = 25;
        
        // Loop through each element of the array to search for the number
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element matches the number to be searched
            if (num == arr[i]) {
                // Print a message indicating that the element is found
                System.out.println("Element is found: " + arr[i]);
                
                // Set the boolean flag to true since the element is found
                b = true;
                
                // Break out of the loop as we found the element
                break;
            }
        }
        
        // If the element was not found in the array, print a message indicating so
        if (!b) {
            System.out.println("Element not found");
        }
    }
}
