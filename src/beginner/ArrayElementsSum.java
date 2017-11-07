package beginner;

import java.util.Scanner;
/**
 * Created by Administrator on 11/7/2017.
 */
/*Print the array in reverse order in a single line separated by space.
Each array is to be printed in separate line.
Constraints:
1 <= T <= 100
1 <= N <=100
0 <= Arr[i] <= 100*/
public class ArrayElementsSum {

    static int arraySum(int arr[],int size)
    {
        int sum = 0;
        for(int i=0;i<size;i++)
        {

             sum = sum + arr[i];
        }
        if(arr !=null)
            return sum;
      else
        return -1;
    }
    public static void main (String[] args) {
        int arr[]= new int[100];
        Scanner sc= new Scanner(System.in);
        int testcases = sc.nextInt();

        while(testcases>0)
        {
            int arr_size = sc.nextInt();
            for(int i=0;i<arr_size;i++)
            {
                arr[i]= sc.nextInt();
            }
            System.out.println(arraySum(arr,arr_size));
            testcases--;
        }
    }
}