import java.util.*;
public class ArrayTransformation {
  public static int minOperations(int[] arr, int k) {
        int n = arr.length;
        int remainder = arr[0] % k;
        for (int num : arr) {
            if (num % k != remainder) {
                return -1;
            }
        }
        Arrays.sort(arr);
        int median = arr[n / 2];
        int operations = 0;
        for (int num : arr) {
            operations += Math.abs(num - median) / k;
        }
        return operations;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int k = 2;

        int result = minOperations(arr, k);
        System.out.println("Minimum Operations: " + result);
    }
}
