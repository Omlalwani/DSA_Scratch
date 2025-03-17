package Array;

public class LinearSearch
{
    static int search(int[] arr, int x)
    {
        for(int i=0; i< arr.length; i++)
        {
            if(arr[i] == x)
                return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,2,4,6};
        int target = 7;

        System.out.println("Found At : " + search(arr, target));
    }
}
