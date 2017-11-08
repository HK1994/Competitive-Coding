package beginner;

import java.util.Scanner;

/**
 * Created by hemantkumar on 11/8/2017.
 */
// Iterative Approach of BinarySearch with complexity O(log n )
public class IterativeBinarySearch {

    int iterativeBinarySearch(int arr[], int l, int r, int x) {

        while (l <= r) {
            int mid = l + (r-1)/2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        IterativeBinarySearch object = new IterativeBinarySearch();
        int arr[] = new int[100];
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases > 0) {
            int arr_size = sc.nextInt();
            for (int i = 0; i < arr_size; i++) {
                arr[i] = sc.nextInt();
            }
            int findnumber = sc.nextInt();
            int result = object.iterativeBinarySearch(arr, 0, arr_size - 1, findnumber);
            if (result == -1)
                System.out.println("Element was not found in array");
            else
                System.out.println("Element found at index:" + result);
        }
    }
}
