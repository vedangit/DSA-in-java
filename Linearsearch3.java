//this program takes the input from 

import java.util.Scanner;
public class Linearsearch3 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int n;  
Scanner sc=new Scanner(System.in);  
System.out.println("Enter the number of elements you want to store: ");  
//reading the number of elements from the that we want to enter  
n=sc.nextInt();  
//creates an array in the memory of length 10  
int[] array = new int[10];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  
//reading array elements from the user   
array[i]=sc.nextInt();  
}  
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findnumbers(array));
    }

//this function will go through the array and count the number of numbers who have even number of digits
    static int findnumbers(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if(even(num)) {
                count++;
            }
        }
        return count;
    }

//now we will write a program to check if a certain number has an even number of digits
	/*ways to do that 
	1] count the number of digits, the old fashioned way. (n/10 and count++)
	2] convert the number into a string and do string length
	*/
	
	
	//first here, we are counting the number of digits in a number
    static int digits(int num) {
        int count = 0;
        //what if the number is negative
        if(num<0){
            num = num*-1; //making it positive
        }
        if(num ==0){
            return 1;
        }
        while(num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    //here, we check if the number of digits are even
    static boolean even(int num) {
        int number = digits(num);
        return number % 2 == 0;
    }
}
