package Maths;

public class primeFactors
{
    static boolean isPrime(int n)
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

    static void primeFact(int n)
    {
        for(int i=2; i<n; i++)
        {
            if(isPrime(i))
            {
                int x = i;
                while(n % x == 0)
                {
                    System.out.print(i + " ");
                    x *= i;
                }
            }
        }
    } //TC :- O(n log n)


    static void primeFactUsingSqrt(int n)
    {
        for(int i=2; i*i <= n; i++)
        {
            while(n % i == 0)
            {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if(n > 1)
            System.out.print(n);
    }

    static void primeFactEfficient(int n)
    {
        if(n <= 1)
            return;
        while(n % 2 == 0)
        {
            System.out.print(2 + " ");
            n /= 2;
        }

        while(n % 3 == 0)
        {
            System.out.print(3 + " ");
            n /= 3;
        }

        for(int i=5; i*i <= n; i += 6)
        {
            while(n % i == 0)
            {
                System.out.print(i + " ");
                n /= i;
            }

            while(n % (i+2) == 0)
            {
                System.out.print((i+2) + " ");
                n /= (i+2);
            }
        }

        if(n > 3)
            System.out.print(n);
    } //TC :- O(Sqrt(n))

    public static void main(String[] args)
    {
        int n = 450;
        primeFact(n);
        System.out.println();
        System.out.println("-----------");
        primeFactUsingSqrt(n);
        System.out.println();
        System.out.println("-----------");
        primeFactEfficient(n);
    }
}
