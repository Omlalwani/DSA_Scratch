package Array;

public class RemoveElement
{
    static void removeElement(int[] arr, int val)
    {
        int end = arr.length-1;
        for(int i=0; i<arr.length/2; i++)
        {
            if(arr[i] == val)
            {
                if(arr[end] == val)
                    end--;
                int temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
                end--;
            }
        }
        for(int num : arr)
        {
            if(num == val)
                break;

            System.out.print(num + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 3, 1, 3};
        int val = 3;

        removeElement(arr, val);
    }
}
