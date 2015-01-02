package com.hackerrank.algorithms.warmup;
/**
 * Solve me first
 * Created by Mohsen on 12/31/14.
 */

import java.util.Scanner;

public class _01_SolveMeFirst {


    static int solveMeFirst(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int _a;
        _a = in.nextInt();

        int _b;
        _b = in.nextInt();

        int sum;
        sum = solveMeFirst(_a, _b);

        System.out.println(sum);
    }
}




