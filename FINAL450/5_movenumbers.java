import java.util.*;

class movenumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = s.nextInt();
        }

        for (int i : helper(arr, N)) {
            System.out.println(i + " ");
        }
        s.close();
    }

    public static int[] helper(int[] arr, int N) {
        int j = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        return arr;
    }
}