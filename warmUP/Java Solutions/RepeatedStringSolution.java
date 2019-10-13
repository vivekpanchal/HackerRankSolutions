package warmUP;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedStringSolution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long countForSubstring = 0;
        long totalCount = 0;

        //Determines how many a's are in a substring
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'a')
            {
                countForSubstring++;
            }
        }

        System.out.println("count for substring"+countForSubstring);
        //Determines how many complete substrings we will analyze
        long divisor = n / s.length();
        System.out.println("divisor for substring"+divisor);


        totalCount += divisor * countForSubstring;
        System.out.println("total count for substring"+totalCount);


        //Determines how many characters in we will analyze towards the end of our n range
        long remainder = n % s.length();
        System.out.println("remainder for substring"+remainder);

        for(int i = 0; i < remainder; i++)
        {
            if(s.charAt(i) == 'a')
            {
                totalCount++;
            }
        }

        System.out.println(totalCount);
        return totalCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
