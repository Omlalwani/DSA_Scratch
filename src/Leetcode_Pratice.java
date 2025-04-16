import java.util.HashMap;
import java.util.Map;

public class Leetcode_Pratice
{
    public static void main(String[] args) {
        Map<Character, Integer> romanInt = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        String s = "LVIII";
        int n = s.length();
        int sum = 0;

        for(int i=0; i<n; i++)
        {
            int current = romanInt.get(s.charAt(i));
            System.out.println(current);
            if(i < n-1 && current < romanInt.get(s.charAt(i+1)))
                sum -= current;
            else
                sum += current;
        }

        System.out.println(sum);







        /*String s = "LVIII";
        char[] c = s.toCharArray();
        int sum = 0;
        for(int i=0; i<c.length; i++)
        {
            String currentSymbol = String.valueOf(c[i]);
            int currentVal = romanInt.get(currentSymbol);
            if(i < c.length - 1)
            {
                String nextSymbol = String.valueOf(c[i+1]);
                int nextVal = romanInt.get(nextSymbol);
                if(currentVal < nextVal)
                    sum -= currentVal;
                else
                    sum += currentVal;
            }
            else
                sum += currentVal;
        }
        System.out.println(sum);*/
    }
}
