package Maths;

public class GCD
{

    //Logic - 1. It will loop until the biggest number, as we know it will go till min number from both.
    static int greatorDivisor(int a, int b)
    {
        int checkGreator = 0;
        for(int i=1; i<= b; i++)
        {
            if((a % i == 0) && (b % i == 0))
                checkGreator = i;
        }

        return checkGreator;
    }


    //Logic - 2. It will loop until the min number from both using while loop - TC :- O(min(a,b))
    static int greatestDivisor(int a, int b)
    {
        int result = Math.min(a, b);
        while(result > 0)
        {
            if ((a % result == 0) && (b % result == 0))
                break;
            result--;
        }
        return result;
    }

    //Logic - 3. Using Euclidean Algorithm....

    static int eculideanGCD(int a, int b)
    {
        while(a != b)
        {
            if(a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 12, b = 15;
        int print = greatorDivisor(a, b);
        System.out.println(print);
        System.out.println("----------------");
        int print2 = greatestDivisor(a, b);
        System.out.println(print2);
        System.out.println("----------------");
        int eculideanAlgo = eculideanGCD(a, b);
        System.out.println(eculideanAlgo);
    }
}
