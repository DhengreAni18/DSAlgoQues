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

            helper(arr, N);
        }
        s.close();
    }

    public static void helper(int[] arr, int N) {
        int sum = Integer.MIN_VALUE, max = 0;
        for (int i = 0; i < N; i++) {
            max = max + arr[i];
            if (sum < max)
                sum = max;
            if (max < 0)
                max = 0;
        }
        System.out.println(sum);
    }
}