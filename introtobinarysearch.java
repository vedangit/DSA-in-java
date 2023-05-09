public class introtobinarysearch {
    public static void main(String[] args) {
    int[] arr = {2, 4, 7, 9, 12, 23, 45, 56, 67, 78};
    int target = 45;
    int ans = binarysearch(arr, target);
    System.out.println(ans);
    }

    //return index
    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
         while(start<=end){
            int mid = start + ((end - start)/2);
         

         if(target< arr[mid]){
            end = mid-1;
         }
         else if(target>arr[mid]){
            start = mid + 1;
         }
         else{
         return mid;
        }
    }
        return -1;

    }
}
