import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of entries
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        // Create a HashMap to store the phone book
        HashMap<String, String> phoneBook = new HashMap<>();
        
        // Read the entries and store them in the phone book
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            String phoneNumber = scanner.next();
            phoneBook.put(name, phoneNumber);
        }
        
        // Read the queries
        while (scanner.hasNext()) {
            String query = scanner.next();
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }
        
        scanner.close();
    }
}
