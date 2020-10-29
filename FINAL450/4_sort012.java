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

            for (int i : helper(arr, N)) {
                System.out.print(i + " ");

            }
            System.out.println();
        }
        s.close();
    }

    public static int[] helper(int[] arr, int N) {
        int l = 0;
        int m = 0;
        int h = N - 1;

        while (m <= h) {
            if (arr[m] == 0) {
                swap(arr, l, m);
                l++;
                m++;
            }

            else if (arr[m] == 1) {
                m++;
            }

            else if (arr[m] == 2) {
                swap(arr, m, h);
                h--;
            }
        }

        return arr;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
