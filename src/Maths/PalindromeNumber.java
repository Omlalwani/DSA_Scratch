package Maths;

public class PalindromeNumber
{
    public static void main(String[] args) {
        int num = 767;
        int temp = num;
        int rev = 0;

        while(temp > 0)
        {
            int lastDigit = temp % 10;
            rev = rev * 10 + lastDigit;
            temp /= 10;
        }

        if(num == rev)
            System.out.println("It is a palindrome number..." + num);
        else
            System.out.println("Not an palindrome number..." + num + " : " + rev);
    }
}
