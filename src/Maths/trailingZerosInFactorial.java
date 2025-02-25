package Maths;

public class trailingZerosInFactorial
{
    static long factorial(int n)
    {
        int res = 1;
        for(int i=2; i<=n; i++)
        {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args)
    {
        int n = 16;
        long result = factorial(n); //Use bigInteger for the longer range of the result...
        long temp = result;
        int count = 0;

        while(temp > 0)
        {
            long lastDigit = temp % 10;
            if(lastDigit == 0)
                count++;
            temp /= 10;
        }

        System.out.println("The count of 0's in " + result + " is : " + count);
    }
}
