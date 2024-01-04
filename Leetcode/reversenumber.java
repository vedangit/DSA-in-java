package Leetcode;
import java.util.Scanner;
public class reversenumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        int reversed = reverseNumber(number);
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversed);
    }

    public static int reverseNumber(int num) {
        if (num < 10) {    //base case
            return num;
        }
        
        int lastDigit = num % 10;
        int remainingDigits = num / 10;
        
        return (int) (lastDigit * Math.pow(10, (int) Math.log10(remainingDigits) + 1)) + reverseNumber(remainingDigits);
    }
}