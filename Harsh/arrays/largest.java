package Harsh.arrays;

public class largest {
    public int largestnum(int arr[], int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
