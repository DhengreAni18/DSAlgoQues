import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t-- > 0) {
            int N = s.nextInt();
            int M = s.nextInt();
            int[] arr1 = new int[N];
            int[] arr2 = new int[M];
            for (int i = 0; i < N; i++) {
                arr1[i] = s.nextInt();
            }
            for (int i = 0; i < M; i++) {
                arr2[i] = s.nextInt();
            }

            helper(N, arr1, M, arr2);
        }
        s.close();
    }

    public static void helper(int N, int[] arr1, int M, int[] arr2) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < N; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < M; i++) {
            set.add(arr2[i]);
        }

        System.out.println(set.size());

    }
}
