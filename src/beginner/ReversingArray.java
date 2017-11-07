package beginner;

import java.util.Scanner;

/**
 * Created by Administrator on 11/8/2017.
 */
public class ReversingArray {

    static void revArray(int arr[],int size)
    {
        for(int i=size;i>0;i--)
        {
            System.out.print(arr[i-1]+" ");
        }
        System.out.print("\n");
    }
    public static void main (String[] args) {
        int arr[] = new int[100];
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while(testcases>0)
        {
            int arr_size = sc.nextInt();
            for(int i=0;i<arr_size;i++)
            {
                arr[i]=sc.nextInt();
            }
            revArray(arr,arr_size);
            testcases--;
        }
    }
}