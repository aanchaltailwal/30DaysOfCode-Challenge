import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < t; i++) {
            // Read the string for the current test case
            String s = scanner.nextLine();
            
            // Initialize strings to hold even-indexed and odd-indexed characters
            String evenChars = "";
            String oddChars = "";
            
            // Loop through each character in the string
            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) {
                    // Even index
                    evenChars += s.charAt(j);
                } else {
                    // Odd index
                    oddChars += s.charAt(j);
                }
            }
            
            // Print the results as required
            System.out.println(evenChars + " " + oddChars);
        }
        
        // Close the Scanner object
        scanner.close();
    }
}
