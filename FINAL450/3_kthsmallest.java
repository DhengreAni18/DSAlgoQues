import java.util.*;
class kthsmallest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while(t-- >= 0) {
            int N = s.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = s.nextInt();
            }
            int k = s.nextInt();

            helper(arr,k);
        }
        
        s.close();
    }

    public static void helper(int[] arr , int k) {
        
    }
}
