import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
         List<Integer> plus= new ArrayList<Integer>(); 
         List<Integer> minus= new ArrayList<Integer>();
         List<Integer> zero= new ArrayList<Integer>();

         for(int i=0; i< arr.length;i++){
             if (arr[i]<0) minus.add(arr[i]);
             if (arr[i]>0) plus.add(arr[i]);
             if (arr[i]==0) zero.add(arr[i]);
         }

         Double d2=Double.valueOf(arr.length);
         System.out.println((plus.size())/(d2));
         System.out.println((minus.size())/(d2));
         System.out.println((zero.size())/(d2));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
