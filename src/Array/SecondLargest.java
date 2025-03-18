package Array;

public class SecondLargest
{

    static int findLargest(int[] arr)
    {
        int res = Integer.MIN_VALUE;
        for(int j=0; j<arr.length; j++)
            if (j > res)
                res = j;

        return res;
    }


    static int secondLarge(int[] arr)
    {
        int result = 0;
        for(int i=0; i<arr.length; i++)
        {
            int largest = findLargest(arr);
            if(arr[i] != arr[largest])
            {
                if(result == 0)
                    result = i;
                else if (arr[i] > arr[result])
                    result = i;
            }
        }

        return arr[result];
    } //TC :- O(n*2)

    static int secondLargeEfficent(int[] arr)
    {
        int result = -1, largest = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > arr[largest])
            {
                result = largest;
                largest = i;
            }
            else if(arr[i] != arr[largest])
            {
                if(result == -1 || arr[i] > arr[result])
                    result = i;
            }
        }

        if(result == -1)
            return -1;
        return arr[result];
    }

    public static void main(String[] args)
    {
        int[] arr = {10,10,10};
        //System.out.println(secondLarge(arr));
        //System.out.println(findLargest(arr));
        System.out.println(secondLargeEfficent(arr));

    }
}
