package Array;

public class LeftRotateByOne
{
    static void rotateByOne(int[] arr)
    {
        int temp;
        temp = arr[0];
        for(int i=1; i< arr.length; i++)
        {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;


        for(int num : arr)
            System.out.print(num + " ");
    } //TC:- O(n) SC :- O(1)

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotateByOne(arr);
    }
}
