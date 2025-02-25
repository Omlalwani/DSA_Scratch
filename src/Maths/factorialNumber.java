package Maths;

public class factorialNumber
{
    //With the use of recursive function...
    static int fact(int n)
    {
        if(n == 0)
            return 1;

        return n * fact(n - 1) ;
    }

    public static void main(String[] args) {

        //With the use of looping TC = O(N), SC = O(1)
        int n = 5;
        int res = 1;
        for(int i=2; i<=n; i++)
        {
            res *= i;
        }

        System.out.println("Factorial of " + n + " is : " + res);

        //-----------
        int checkNum = fact(5);
        System.out.println(checkNum);

    }
}
