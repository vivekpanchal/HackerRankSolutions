package Arrays.Java;

import java.io.*;
import java.util.*;

public class ArrayManipulationSolution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        Item[] array = new Item[M];
        for(int i = 0; i < M; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            long k = in.nextInt();

            array[i] = new Item(a, b, k);
        }

        System.out.println(crush(N, M, array));
    }

    public static long crush(int N, int M, Item[] items) {
        long[] copy = new long[N + 1];
        for(int i = 0; i < copy.length; i++) {
            copy[i] = 0;
        }

        for(int i = 0; i < M; i++) {
            copy[items[i].getA() - 1] += items[i].getK();
            copy[items[i].getB()] -= items[i].getK();
        }

        long max = copy[0];
        long sum = max;
        for(int i = 1; i < N; i++) {
            sum += copy[i];
            if(sum > max) {
                max = sum;
            }
        }

        return max;
    }

    static class Item {
        int a;
        int b;
        long k;

        public Item(int a, int b, long k) {
            this.a = a;
            this.b = b;
            this.k = k;
        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        public long getK() {
            return k;
        }

        public void setK(long k) {
            this.k = k;
        }
    }
}