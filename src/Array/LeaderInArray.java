package Array;

public class LeaderInArray
{
    // It checks from left to right, if there is a element, so from that element right side elements should be less than
    // that element.

    static void leaderInArray(int[] arr)
    {
        int n = arr.length-1;
        int currentElement = arr[n];

        System.out.print(currentElement + " ");

        for(int i=n-1; i>=0; i--)
        {
            if(currentElement < arr[i])
            {
                currentElement = arr[i];
                System.out.print(currentElement + " ");
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {7,10,6,4,2};
        leaderInArray(arr);
    }
}
