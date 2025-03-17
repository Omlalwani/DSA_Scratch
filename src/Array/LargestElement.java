package Array;

public class LargestElement
{
    static int findLargest(int[] arr)
    {
        int res = Integer.MIN_VALUE;
        for (int j : arr)
            if (j > res)
                res = j;

        return res;
    }

    public static void main(String[] args)
    {
        int[] arr = {40,30,90,35};
        System.out.println(findLargest(arr));
    }
}
