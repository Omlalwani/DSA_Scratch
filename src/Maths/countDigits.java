package Maths;

public class countDigits
{
    public static void main(String[] args)
    {
        int num = 54321;
        int count = 0;
        while(num > 0)
        {
            int temp = num % 10;
            count++;
            num /= 10;
        }

        System.out.println("The count of numbers is : " + count);
    }
}
