package Maths;

public class ComputingPower
{
    static void iterativePower(int n, int x)
    {
        int sum = 1;
        while(n > 0)
        {
            if(n % 2 != 0)
            {
                sum *= x;
            }
            x = x * x;
            n /= 2;
        }
        System.out.println(sum);
    } // Used Binary Iteration, as 10 :- 1010, so where we get 1 will multiply that. TC :- O(log n), SC :-


    static void calculatePower(int n, int x)
    {
        int sum = 1;

        for(int i=0; i<n; i++)
            sum = sum * x;

        System.out.println(sum);
    } // TC :- O(n)

    static int power(int x, int n)
    {
        if(n == 0)
            return 1;

        int temp = power(x, n/2);
        temp = temp * temp;

        if(n % 2 == 0)
            return temp;
        else
            return temp * x;
    } //TC :- O(log n)




//2, 2

    public static void main(String[] args) {
        int x = 3, n = 19;
        //calculatePower(n, x);
        //System.out.println(power(x, n));
        iterativePower(n, x);

        //System.out.println(iterativePower(n,x));
    }
}
