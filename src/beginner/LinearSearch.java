package beginner;

import java.util.Scanner;

/**
 * Created by Administrator on 11/7/2017.
 */
/*Problem Statement:
Linear Search: Given an integer array and an element x, find if element is present in array or not.
If element is present, then print index of its first occurrence. Else print -1.
Constraints:
1 <= T <= 100
1 <= N <= 100
1 <= Arr[i] <= 100
*/
public class LinearSearch {

    static int search(int arr[],int arr_size,int find)
    {
        for(int i =0;i<arr_size;i++)
        {
            if(arr[i]== find)
            {
               return i;
            }
        }
        return  -1;
    }
    public static void main(String[] args) {

        int [] arr = new int[100];

        // Input the number of test cases you want to run
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        while (testcase>0)
        {
            int size = sc.nextInt();
            for(int i=0;i<size;i++)
            {
                arr[i] = sc.nextInt();
            }
            int x =sc.nextInt();
            System.out.print(search(arr,size,x));
            testcase--;
        }

    }
}
