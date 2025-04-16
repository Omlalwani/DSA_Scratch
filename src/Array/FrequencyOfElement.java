package Array;

import java.util.HashMap;

public class FrequencyOfElement
{
    static void checkFrequency(int[] arr)
    {
        int freq = 1;
        int i = 1;
        int n = arr.length;
        HashMap<Integer, Integer> addElement = new HashMap<>();

        while(i < n)
        {
            while(i < n && arr[i] == arr[i-1])
            {
                freq++;
                i++;
            }

            System.out.println(arr[i-1] + " " + freq);
            //addElement.put(arr[i-1], freq);
            i++;
            freq = 1;

            if(n == 1 || arr[n-1] != arr[n-2])
                System.out.println(arr[n-1]);

            //System.out.println(addElement);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,10,10,20,20,30,30,30};
        checkFrequency(arr);
    }
}
