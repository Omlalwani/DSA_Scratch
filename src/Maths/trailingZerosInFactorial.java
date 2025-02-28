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

    // AN efficient way for handling big factorial's, as below if you write n > 16 you will get garbage values
    // to handle that this func is being created.

    static int countZeros(int n)
    {
        int result = 0;
        for(int i=5; i<= n; i = i * 5)
            result = result + (n/i);

        return result;
    }

    public static void main(String[] args)
    {
        /*int n = 16;
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
        System.out.println("The count of 0's in " + result + " is : " + count);*/


        //------Used efficient way----
        int j = 250;
        int res = countZeros(j);

        System.out.println("The count of 0's in " + j + " is : " + res);

    }
}
