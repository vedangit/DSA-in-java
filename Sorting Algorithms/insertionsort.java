import java.util.Arrays;
import java.util.Scanner;
public class insertionsort {
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
        insertionsort(array);
        System.out.println( "\nsorted array : ");
        printArray(array);

    } 

    static void insertionsort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){  //or i<= arr.length - 2, same thing.
            for(int j = i + 1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);

                }
                else{
                    break;
                }
            }
        }
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