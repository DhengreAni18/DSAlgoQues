import java.util.*;

class kthsmallest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t-- > 0) {
            int N = s.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = s.nextInt();
            }
            int k = s.nextInt();

            System.out.println(helper(arr, k, 0, arr.length - 1));
        }

        s.close();
    }

    public static int partition(int[] arr, int l, int h) {
        int i = l;
        int pivot = arr[h];

        for (int j = l; j <= h - 1; j++) {
            if (arr[j] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        int temp = arr[i];
        arr[i] = arr[h];
        arr[h] = temp;

        return i;

    }

    public static int helper(int[] arr, int k, int l, int h) {
        if (k > 0 && k <= h - l + 1) {

            int pos = partition(arr, l, h);

            if (pos - l == k - 1)
                return arr[pos];

            if (pos - l > k - 1)
                return helper(arr, l, pos - 1, k);

            return helper(arr, pos + 1, h, k - pos + l - 1);
        }

        return Integer.MAX_VALUE;
    }
}
