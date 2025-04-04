package Array;

import java.util.ArrayList;
import java.util.Collections;

public class LeaderInArray
{
    // It checks from left to right, if there is a element, so from that element right side elements should be less than
    // that element.

    static ArrayList<Integer> leaderInArray(int[] arr)
    {
        int n = arr.length-1;
        int currentElement = arr[n];
        ArrayList<Integer> addVar = new ArrayList<>();
        addVar.add(currentElement);

        for(int i=n-1; i>=0; i--)
        {
            if(currentElement <= arr[i])
            {
                currentElement = arr[i];
                addVar.add(currentElement);
            }
        }
        Collections.reverse(addVar);
        return addVar;
    }

    public static void main(String[] args)
    {
        int[] arr = {61,61,17};
        System.out.println(leaderInArray(arr));
    }
}
