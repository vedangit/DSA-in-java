import java.util.Arrays;

class dlinearsearch {
    public static void main(String[] args)
    {
        int arr[][] = { { 3, 12, 9 },
                        { 5, 2, 89 },
                        { 90, 45, 22 } };
        int target = 89;
        int ans[] = linearSearch(arr, target);
        System.out.println("Element found at index: "
                           + Arrays.toString(ans));
    }

    static int[] linearSearch(int[][] arr, int target)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}


    // static int searcharray(int[][] arr, int target){
    //     for(int row = 0; row<arr.length; row++){
    //         for(int coloumn = 0; coloumn<arr[row].length; coloumn++){
    //             if(arr[row][coloumn]== target){
    //                 return arr[row][coloumn];
    //             }


    //         }
    //     }

    //     return -1;
    // }

