package Array;

import java.util.ArrayList;

public class MaximumDifference
{
    static int maxDiff(int[] arr)
    {
        int res = arr[1] - arr[0];
        //System.out.println(res);
        for(int i=0; i< arr.length-1; i++)
        {
            for(int j=i+1; j< arr.length; j++)
            {
                res = Integer.max(res, arr[j] - arr[i]);
            }
        }

        return res;
    } //O(n^2)

    static int maxxDiff(int[] arr)
    {
        int res = arr[1] - arr[0];
        int minVal = arr[0];
        for(int i=1; i < arr.length; i++)
        {
            res = Integer.max(res, arr[i] - minVal);
            minVal = Integer.min(minVal, arr[i]);
        }

        return res;
    } //O(n)


    public static void main(String[] args) {
        int[] arr = {30,20,10};
        System.out.println(maxDiff(arr));
        System.out.println(maxxDiff(arr));
        //maxDiff(arr);
    }
}
