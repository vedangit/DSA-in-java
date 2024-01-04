public class linearsearch {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 8, 9, 7};
        int target = 7;
        int ans = linearsearch(arr, target);
        System.out.println(ans);

        
    }
    //search in the array if item found return index, else return no item found and index as -1
    static int linearsearch(int[] arr, int target){

        if(arr.length == 0){
            return -1;
        }

        // for(int index = 0; index<arr.length; index++){
        //     int element = arr[index];
        //     if(element == target){
        //         return index;

        //     }

        for(int element : arr){
            if(element == target){
                return element;
            }
        }

        

        return -1;

    }
       
        


        
        

}

   


