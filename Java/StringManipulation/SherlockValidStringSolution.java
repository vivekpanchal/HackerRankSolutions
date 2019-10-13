package StringManipulation;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockValidStringSolution {

    // Complete the isValid function below.
    static String isValid(String s) {
        if (s.isEmpty() || s.length() <= 3) return "YES";
        Map<Character, Integer> charCounts = new HashMap<>();
        for (char c: s.toCharArray()) {
            int count = charCounts.containsKey(c) ? charCounts.get(c) : 0;
            charCounts.put(c, count + 1);
        }

        List<Integer> counts = new ArrayList<>(charCounts.values());
        Collections.sort(counts);
        int length = counts.size();
        System.out.println(counts);
        System.out.println(counts.get(0));
        System.out.println(counts.get(length - 1));
        int min = counts.get(0);
        int max = counts.get(length - 1);

        // The string is valid if all characters have equal frequency, or if
        // it can be made valid by removing one instance of the most frequent
        // character, or if it can be made valid by removing the only instance
        // of a character.
        boolean valid = (max == min) || (min == 1 && counts.get(1) == max) ||
                        (max - min == 1 && counts.get(length - 2) != max);

        return valid ? "YES" : "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
