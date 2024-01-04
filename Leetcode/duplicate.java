package Leetcode;
import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the given size
        int[] array = new int[size];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Print the array
        printArray(array);
        
        System.out.println( cyclesort(array));
        
        
    }

    static int cyclesort(int[] arr){
        int i = 0;
        while( i < arr.length){
            int correct = arr[i];
            if(arr[i]< arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }

        for(int j = 0; j < arr.length; j++){
            if(arr[j] != j){
                return j;
            }
        }
        
        return arr.length;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    } 

    static void printArray(int arr[])
    {
        int i;
        for (i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        System.out.println();
        }
    }
}
