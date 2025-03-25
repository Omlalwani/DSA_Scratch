package Array;

public class LeftRotateByD
{
    static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void reverse(int[] arr, int low, int high)
    {
        while(low < high)
        {
            swap(arr, low, high);
            low++;
            high--;
        }
    }

    static void leftRotate(int[] arr, int d)
    {
        int n = arr.length;
        //d = d % n;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    } // Reversal Algorithm TC :- O(n)

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int d = 2;

        leftRotate(arr, d);
        for(int num : arr)
            System.out.print(num + " ");
    }

}
