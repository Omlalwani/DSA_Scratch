package Maths;

public class checkPrime
{
    static boolean isPrime(int n)
    {
        if(n <= 1)
            return false;
        for(int i = 2; i < n; i++)
        {
            if(n % i == 0)
                return false;
        }
        return true;
        //TC : - O(n), in some case it will be constant also.
    }

    static boolean isPrimeUsingSqrt(int n)
    {
        if(n <= 1)
            return false;

        for(int i=2; i*i <= n; i++)
            if(n % i == 0)
                return false;

        return true;
    }

    static boolean isPrimeEfficient(int n)
    {
        if(n == 1)
            return false;

        if(n == 2 || n == 3 )
            return true;

        if(n % 2 == 0 || n % 3 == 0) // If any number is divisible by 2 or 3 will directly return false, that's why we start from 5
            return false;

        for(int i = 5; i*i <= n; i += 6) //As we are incrementing by 6, it will skip many itr, from 5 will directly jump to 11
            if(n % i == 0 || n % (i+2) == 0) // Checks if the n divides by 5 or n divides by 7 both.
                return false;

        return true;
    }


    public static void main(String[] args)
    {
        int n = 1031;
        System.out.println(isPrime(n));
        System.out.println("--------------");
        System.out.println(isPrimeUsingSqrt(n));
        System.out.println("--------------");
        System.out.println(isPrimeEfficient(n));
    }
}
