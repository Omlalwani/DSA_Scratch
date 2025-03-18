package Array;

public class ReverseArray
{
    static void reverseArray(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;

        /*while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }*/ //TC :- O(n)


        for(int i=0; i< arr.length/2; i++)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        } // TC :- O(log n) - Optimized code

        for (int j : arr) System.out.print(j + " ");
    }

    public static void main(String[] args)
    {
        int[] arr = {20,30,40,50};
        reverseArray(arr);
    }
}
