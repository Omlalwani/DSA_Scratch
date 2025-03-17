package Array;

public class DeleteElement
{
    static int deleteElement(int[] arr, int x, int n)
    {
        int i;
        for(i=0; i<n; i++)
            if(arr[i] == x)
                break;

        if(i == n)
            return n;

        for(int j=i; j<n-1; j++)
            arr[j] = arr[j+1];

        return (n-1);
    }


    public static void main(String[] args)
    {
        int[] arr = {5,43,3,2,1};
        int x = 3;
        int n = arr.length;
        System.out.println("Before Deleting element size is : " + n);
        int delete = deleteElement(arr, x, n);
        System.out.println("After Deleting element size is : " + delete);

        //for (int j : arr) System.out.print(j + " ");
    }
}
