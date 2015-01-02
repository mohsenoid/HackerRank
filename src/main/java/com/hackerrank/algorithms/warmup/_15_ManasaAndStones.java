package com.hackerrank.algorithms.warmup;
/**
 * Manasa and Stones
 * Created by Mohsen on 1/2/15.
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class _15_ManasaAndStones {
    static int t;
//    static ArrayList<ArrayList<Integer>> results;

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner in = new Scanner(System.in);

        t = in.nextInt();

//        results = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int one = in.nextInt();
            int two = in.nextInt();

            int a = Math.min(one, two);
            int b = Math.max(one, two);

            ArrayList<Integer> result = new ArrayList<Integer>();

            if (n == 1) {
                result.add(0);
            } else {
                for (int j = 0; j < n; j++) {
                    result.add(a * j + b * (n - 1 - j));
                }
                Collections.sort(result);
            }

            System.out.println(result.toString().replace("[", "").replace("]", "").replace(",", ""));

//            results.add(result);
        }

//        for (int i = 0; i < t; i++) {
//            System.out.println(results.get(i).toString().replace("[", "").replace("]", "").replace(",", ""));
//        }
    }
}