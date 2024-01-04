import java.util.Arrays;
import java.util.Scanner;

public class bubblesort{
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
        System.out.println("The input array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        bubblesort(array);
        System.out.println( "\nsorted array : ");
        printArray(array);

        
    }

    static void bubblesort(int[] arr){
        boolean swapped;
        for(int i = 0; i< arr.length; i++){
            swapped = false;
            for(int j = 1; j< arr.length - 1; j++){

                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
            
        }
    }

    static void printArray(int arr[])
    {
        int i;
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}