import java.util.*;
class minMaxArr {
    public static void main (String[] args) {
        int[] arr = {1000, 11, 445, 1, 330, 3000};
        System.out.println(getMin(arr));
        System.out.println(getMax(arr));
    }

    private static int getMin(int[] arr) {
        int min=arr[0];
        for (int i = 1; i < arr.length-1; i++) {
            if(min>arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    private static int getMax(int[] arr) {
        int max=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if(max<arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
