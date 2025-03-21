package Array;

public class MoveZerosToEnd
{

    static void swap(int a, int b)
    {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }


    static void moveZeros(int[] arr)
    {
        int count = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] != 0)
            {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count ++;
            }
        }

        for(int num : arr)
            System.out.print(num + " ");
    }


    public static void main(String[] args) {
        int[] arr = {10,8,0,0,12,0};

        moveZeros(arr);
    }
}
