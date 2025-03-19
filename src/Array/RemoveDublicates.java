package Array;

public class RemoveDublicates
{
    static void removeDublicates(int[] arr)
    {
        int n = 1;
        for(int i=0; i< arr.length; i++)
        {
            if(arr[i] != arr[n-1])
            {
                arr[n] = arr[i];
                n++;
            }
        }

        for(int i : arr)
            System.out.print(i + " ");
    }

    public static void main(String[] args)
    {
        int[] arr = {10,20,20,30,30,30};


        removeDublicates(arr);
    }
}
