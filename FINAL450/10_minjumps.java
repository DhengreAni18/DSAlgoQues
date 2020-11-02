/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t-- > 0) {
            int N = s.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = s.nextInt();
            }

            System.out.println(helper(arr, N));
        }
        s.close();
    }

    public static int helper(int[] arr, int N) {
        int[] jumps = new int[N];

        if (N == 0 || arr[0] == 0) {
            return -1;
        }

        jumps[0] = 0;
        for (int i = 1; i < N; i++) {
            jumps[i] = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (i <= j + arr[j] && jumps[j] != Integer.MAX_VALUE) {
                    jumps[i] = Math.min(jumps[i], jumps[j] + 1);
                    break;
                }
            }
        }

        return jumps[N - 1];
    }
}