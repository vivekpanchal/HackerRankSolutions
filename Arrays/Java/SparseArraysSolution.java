package Arrays.Java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SparseArraysSolution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> values = new TreeMap<String, Integer>();

        for(int arr_i=0; arr_i < n; arr_i++) {
            String item = in.next();
            if (values.containsKey(item))
                values.put(item, values.get(item) + 1);
            else
                values.put(item, 1);
        }


        int q = in.nextInt();
        for(int arr_i=0; arr_i < q; arr_i++) {
            Integer reps = values.get(in.next());
            System.out.println(reps == null? 0 : reps);
        }
    }
}