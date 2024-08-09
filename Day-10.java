import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Read input integer
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        // Convert the integer to binary representation
        String binaryString = Integer.toBinaryString(n);

        // Split the binary string by '0' to get groups of consecutive '1's
        String[] onesGroups = binaryString.split("0");

        // Find the length of the longest group
        int maxConsecutiveOnes = 0;
        for (String group : onesGroups) {
            if (group.length() > maxConsecutiveOnes) {
                maxConsecutiveOnes = group.length();
            }
        }

        // Print the result
        System.out.println(maxConsecutiveOnes);

        bufferedReader.close();
    }
}
