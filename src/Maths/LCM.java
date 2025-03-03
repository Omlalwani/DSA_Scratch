package Maths;

public class LCM
{
    static int calculateGcd(int a, int b)
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

    public static void main(String[] args)
    {
        int a = 12, b = 15;
        int resultGcd = calculateGcd(a , b);
        int calculateLcm = (a * b) / resultGcd;

        System.out.println("LCM is : " + calculateLcm);

        //TC :- O(log(min(a,b)).
    }
}
