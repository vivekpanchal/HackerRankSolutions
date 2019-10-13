package Arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LeftRotateSolution {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

        for (int i = 0; i < d; i++) {
            var temElement = a[0];
            System.out.println("For " + d + " left rotate element added in temp::" + temElement);
            for (int j = 0; j < a.length - 1; j++) {
                a[j] = a[j + 1];
                System.out.println("rotating......."+String.valueOf(a[j]));
            }

            a[a.length - 1] = temElement;
            System.out.println("rotated......."+ Arrays.toString(a));
        }
        return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            System.out.print(String.valueOf(result[i]));

            if (i != result.length - 1) {
                System.out.print(" ");
            }
        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
