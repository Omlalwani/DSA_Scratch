package Maths;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class printPrime
{
    static boolean isPrime(int n)
    {
        if(n == 1)
            return false;
        if(n == 2 || n == 3)
            return true;
        if(n % 2 == 0 || n % 3 == 0)
            return false;

        for(int i=5; i*i<=n; i+=6)
        {
            if(n % i == 0 || n % (i+2) == 0)
                return false;
        }

        return true;
    }

    static void primeNumbers(int n)
    {
        for(int i=2; i<n; i++)
        {
            if(isPrime(i))
                System.out.print(i + " ");
        }
    } //TC :- O(Sqrt(N))

    static void sieve(int n)
    {
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr, true);

        for(int i=2; i*i <= n; i++)
        {
            if(arr[i])
            {
                for(int j = i*i; j<=n; j += i)
                {
                    arr[j] = false;
                }
            }
        }
        for(int i=2; i<= n; i++)
        {

            if(arr[i])
                System.out.print(i + " ");
        }
    } // TC :- O(n log log n), almost linear RC, because we are reducing iterations

    static void seiveOptimized(int n)
    {
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr, true);
        for(int i=2; i<=n; i++)
        {
            if(arr[i])
            {
                System.out.print(i + " ");
                for(int j = i*i; j<=n; j+=i)
                {
                    arr[j] = false;
                }
            }
        }
    } // Reduced code compare to the previous solution...

    public static void main(String[] args) {
        int n = 100;
        primeNumbers(n);
        System.out.println();
        System.out.println("-----------");
        sieve(n);
        System.out.println();
        System.out.println("-----------");
        seiveOptimized(n);
    }
}
