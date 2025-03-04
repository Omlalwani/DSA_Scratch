package Maths;

import java.util.ArrayList;
import java.util.List;

public class AllDivisorsOfNumber
{
    static void divisorsUsingList(int n)
    {
        List<Integer> addNum = new ArrayList<>();
        for(int i = 1; i<=n; i++)
        {
            if(n % i == 0)
                addNum.add(i);
        }
        System.out.println(addNum);
    }

    static void printDivisors(int n)
    {
        for(int i=1; i*i<=n; i++) {
            if (n % i == 0)
            {
                System.out.print(i + " ");
                if (i != n / i)
                    System.out.print(n / i + " ");
            }
        }
    } //TC :- O(log n)

    static void printDivisorsEfficient(int n)
    {
        int i;
        for(i = 1; i*i<n; i++)
            if(n % i == 0)
                System.out.print(i + " ");

        for( ;i>=1; i--)
            if(n % i == 0)
                System.out.print(n/i + " ");
    } //TC :- O(Sqrt(n))


    public static void main(String[] args) {
        int n = 30;
        divisorsUsingList(n);
        System.out.println("-----------------------");
        printDivisors(n);
        System.out.println();
        System.out.println("-----------------------");
        printDivisorsEfficient(n);
    }
}
