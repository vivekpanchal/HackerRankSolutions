package StringManipulation;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MakingAnagramsSolution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        Map<Character, Integer> count = new HashMap<>();

        // Set up tally of characters in first string.
        for (char c : a.toCharArray()) {
            int charCount = count.containsKey(c) ? count.get(c) : 0;
            count.put(c, charCount + 1);
        }
        
        // Set up tally of characters in second string.
        // Decrements tally by 1 for each common character.
        for (char c : b.toCharArray()) {
            int charCount = count.containsKey(c) ? count.get(c) : 0;
            count.put(c, charCount - 1);
        }

        // Sum up number of 'extra' characters that need to be deleted.
        List<Integer> extraCharCounts = new ArrayList<>(count.values());
        int total = 0;
        for (Integer v : extraCharCounts)
            total += Math.abs(v);
        return total;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
