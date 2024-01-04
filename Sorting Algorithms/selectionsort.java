import java.util.Arrays;
import java.util.Scanner;
public class selectionsort {
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

        selectionsort(array);
        System.out.println( "\nsorted array : ");
        printArray(array);



} 
    static void selectionsort(int[] arr){
        for(int i = 0; i<arr.length; i++){
            //find the largest item and swap at the last index
            int last = arr.length - i - 1;
            int max = getmaxindex(arr, 0, last);
            swap(arr, max, last);


        }
    }

    static int getmaxindex(int[] arr, int start, int last){
        int max = start;
        for(int i = start; i <= last; i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;

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
        System.out.println();}
    }
}



