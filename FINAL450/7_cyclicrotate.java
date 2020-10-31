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
    // with modifying array :

    public static void helper(int[] arr, int N) {
        int last = arr[N - 1];
        for (int i = N - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Another method without modifying the array :

    public static void helper(int[] arr, int N) {
        System.out.print(arr[N - 1] + " ");
        for (int i = 0; i < N - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}