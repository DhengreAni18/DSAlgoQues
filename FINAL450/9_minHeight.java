// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getMinDiff(arr, n, k);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends

// User function Template for Java

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        if (n == 1) {
            return 0;
        }
        int small = arr[0];
        int big = arr[n - 1];
        int ans = big - small;
        small = arr[0] + k;
        big = arr[n - 1] - k;
        if (big < small) {
            int ty = big;
            big = small;
            small = ty;
        }
        for (int i = 1; i < n - 1; i++) {
            int sm = arr[i] - k;
            int l = arr[i] + k;
            if (sm >= small || l <= big) {
                continue;
            }
            if (big - sm < l - small) {
                small = sm;
            } else {
                big = l;
            }
        }
        return Math.min(ans, big - small);
    }
}
