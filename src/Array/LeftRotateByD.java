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

            d = d % n;
            reverse(arr, 0, n-d-1);
            reverse(arr, n-d, n-1);
            reverse(arr, 0, n-1);


    } // Reversal Algorithm TC :- O(n)

    public static void main(String[] args) {
        int[] arr = {1,2};
        int d = 3;

        leftRotate(arr, d);
        for(int num : arr)
            System.out.print(num + " ");
    }

}
