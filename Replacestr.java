package anudip;

import java.util.Scanner;

public class Replacestr {
    // Method to replace characters with 'x' except the last 4 characters
    String replaceStr(String s) {
        // Convert the string to a character array
        char arr[] = s.toCharArray();
        
        // Replace characters with 'x' except for the last 4 characters
        for (int i = 0; i < arr.length - 4; i++) {
            arr[i] = 'x';
        }
        
        // Convert the character array back to a string
        return new String(arr);
    }

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter their mobile number
        System.out.println("Enter your mobile number:");
        String str = sc.next();
        
        // Create an instance of Replacestr
        Replacestr rp = new Replacestr();
        
        // Call the replaceStr method and print the result
        System.out.println(rp.replaceStr(str));
        
        // Close the scanner
        sc.close();
    }
}
