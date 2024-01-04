import java.util.Arrays;
import java.util.Scanner;
public class cyclesort{
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
        cyclesort(array);
        System.out.println( "\nsorted array : ");
        printArray(array);
        
    }

    static void cyclesort(int[] arr){
        
        while(int i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
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