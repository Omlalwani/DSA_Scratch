package Array;

public class IsArraySorted
{
    static boolean isSorted(int[] arr)
    {
        for(int i=1; i< arr.length; i++)
        {
            if(arr[i] < arr[i-1])
                return false;
        }
        return true;
    } //TC :- O(n)

    public static void main(String[] args) {
        int[] arr = {9};
        System.out.println(isSorted(arr));

    }
}
