package com.company;

public class Main {

    public static void main(String[] args) {
        int N = 5;
        int[][] A = new int[N][N];

        int z = 1;
        int top = 0;
        int bottom = 4;
        int left = 0;
        int right = 4;

        while (z <= N * N) {
            for (top = left; top <= right; top++) {
                System.out.println(top);
            }
        }
    }
}