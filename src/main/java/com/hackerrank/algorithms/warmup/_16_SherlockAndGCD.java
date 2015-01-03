package com.hackerrank.algorithms.warmup;
/**
 * Sherlock and GCD
 * Created by Mohsen on 1/2/15.
 */

import java.io.IOException;
import java.util.Scanner;


public class _16_SherlockAndGCD {
    static int t;
    static boolean[] results;

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner in = new Scanner(System.in);

        t = in.nextInt();

        results = new boolean[t];

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();

            results[i] = checkGDC(in, n);


        }
        for (int i = 0; i < t; i++) {
            System.out.println(results[i] ? "YES" : "NO");
        }
    }

    private static boolean checkGDC(Scanner in, int n) {
//        int[] array = new int[n];

        for (int j = 0; j < n; j++) {
            int member = in.nextInt();
            if (!isPrime(member))
                return false;
        }
        return true;
    }

    private static boolean isPrime(int member) {
        if (member <= 1)
            return true;
        else {
            for (int i = 2; i <= member / 2; i++) {
                if (member % i != 1)
                    return false;
            }

            return true;
        }
    }

}
