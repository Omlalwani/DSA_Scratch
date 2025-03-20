package Array;

import java.util.HashSet;

public class MissingNumber
{
    static int missingNumber(int[] arr )
    {
        if(arr.length <= 1)
            return arr[0] + 1;

        int n = arr.length+1;
        int sum = (n * (n+1) / 2);
        int sum2 = 0;

        for(int i=0; i<arr.length; i++)
        {
            sum2 += arr[i];
        }
        return sum - sum2;
    }


    static int missedNumber(int[] arr)
    {
        HashSet<Integer> checkNumber = new HashSet<>();
        for(int num : arr)
            checkNumber.add(num);

        int i=1;
        while(checkNumber.contains(i))
            i++;

        return i;
    }

    public static void main(String[] args)
    {
        int[] arr = {1};
        System.out.println(missingNumber(arr));
        System.out.println(missedNumber(arr));
    }
}
