package com.hackerrank.algorithms.warmup;
/**
 * Sherlock and The Beast
 * https://www.hackerrank.com/challenges/sherlock-and-the-beast
 *
 * Created by Mohsen on 1/11/15.
 */

import java.io.IOException;
import java.util.Scanner;


public class SherlockAndBeast {
    static int t;
    static String[] results;

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner in = new Scanner(System.in);

        t = in.nextInt();

        results = new String[t];

        boolean flag = false;

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();

            int n5 = n / 3;
            int n3 = n - n5 * 3;
            while (n5 > 0 && n3 > 0 && n3 % 5 != 0) {
                n5--;
                n3 = n - n5 * 3;

            }
            if (n3 % 5 == 0) {
                flag = true;
            }

            String result = "";

            if (flag == false) {
                result = "-1";
            } else {
                //int n3 = (int) n3_d;
                while (n5 > 0) {
                    result += "555";
                    n5--;
                }
                while (n3 > 0) {
                    result += "3";
                    n3--;
                }
            }

            results[i] = result;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(String.valueOf(results[i]));
        }

    }
}