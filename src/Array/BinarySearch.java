package Array;

public class BinarySearch
{
    static int binSearch(int[] arr, int target)
    {
        int left = 0;
        int right = arr.length-1;
        while(left <= right)
        {
            int mid = left + (right - left) / 2;

            if(arr[mid] == target)
                return mid;

            if(arr[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr = {2,4,6,8,10,12};
        int target = 6;
        int search = binSearch(arr, target);

        if(search != -1)
            System.out.println("Found at index : " + search);
        else
            System.out.println("Element " + target + " not found...");


    }
}
